package com.commander4j.manifest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;

import org.apache.commons.io.FileUtils;

public class Create {

	public static String[] excludes;
	public static String[] manual_includes;
	public static List<String> includes = new ArrayList<String>();
	public static String source = "";
	public static String startClass = "";
	public static File fout;
	public static FileOutputStream fos;
	public static BufferedWriter bw;
	public static String prefix = "";

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Syntax: b6Manifest manifest.name\n");
			System.out.println("\n");
			System.out.println("Parameter file contains a list parameters :-");
			System.out.println("   Project base folder");
			System.out.println("   Start Class");
			System.out.println("   jars to exlude");
			System.out.println("   manual includes to classpath");
			System.out.println("\n");
			System.exit(1);
		} else {
			File test = new File(args[0]);
			if (test.exists()) {
				try {
					List<String> contents = FileUtils.readLines(test, "utf-8");
					int lineNumber = 1;

					// Iterate the result to print each line of the file.
					for (String line : contents) {

						switch (lineNumber) {
						case 1:
							line = line.replaceFirst("^~", Matcher.quoteReplacement(System.getProperty("user.home")));
							source = line;
							break;
						case 2:
							startClass = line;
							prefix = "Manifest-Version: 1.0\n" + "Main-Class: " + startClass + "\n" + "Class-Path:";
							break;
						case 3:
							excludes = replaceNullStringwithBlank(line).split(" ");
							break;
						case 4:
							manual_includes = replaceNullStringwithBlank(line).split(" ");
							break;
						default:
							break;
						}

						lineNumber++;
					}

					if (lineNumber >= 3) {
						System.out.println("Invoking b6Manifest on " + test);
						System.out.println("   Folder = " + source);
						System.out.println("");
						topLevel(new File(source));

						if (manual_includes != null) {
							for (int x = 0; x < manual_includes.length; x++) {
								includes.add(" " + manual_includes[x] + " ");
							}
						}

						Collections.sort(includes);

						fout = new File("MANIFEST.MF");
						fos = new FileOutputStream(fout);
						bw = new BufferedWriter(new OutputStreamWriter(fos));
						System.out.println(prefix);
						bw.write(prefix);

						for (int x = 0; x < includes.size(); x++) {
							bw.write(includes.get(x));
							System.out.println(includes.get(x));
							bw.newLine();
							bw.flush();
						}

						bw.flush();

						fos.close();
						fout = null;

						System.out.println("\nComplete.");

					}
				} catch (IOException e) {
					e.printStackTrace();
				}

			} else {
				System.out.println(test.getAbsolutePath() + " not found.\n");
				System.out.println("\n");
				System.exit(1);
			}
		}
		System.exit(0);
	}

	public static void topLevel(File sourceFile) {

		dirTree(sourceFile);

	}

	public static void dirTree(File dir) {

		File[] subdirs = dir.listFiles();
		for (File subdir : subdirs) {
			if (subdir.isDirectory()) {
				//Only include lib folder and root
				if ((subdir.getAbsolutePath().toLowerCase().endsWith("target"+File.separator+"dependency"))==false)
				{
					dirTree(subdir);
				}
			} else {
				doFile(subdir);
			}
		}
	}

	public static String replaceNullStringwithBlank(String value) {
		if (value == null) {
			value = "";
		}

		return value;
	}

	public static void doFile(File file) {
		if (file.getAbsolutePath().endsWith(".DS_Store") == false) {

			if (file.getAbsolutePath().endsWith(".jar") == true) {

				boolean include = true;
				if (excludes.length == 0) {
					include = true;
				} else {
					for (int x = 0; x < excludes.length; x++) {
						if (file.getAbsolutePath().toLowerCase().endsWith(excludes[x].toLowerCase())) {
							include = false;
						}
					}
				}

				if (include) {

					try {
						includes.add(" " + file.getAbsolutePath().substring(source.length() + 1) + " ");
					} catch (Exception e) {

						e.printStackTrace();
					}

				}

			}

		}
	}
}

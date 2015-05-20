package com.winssoft.filetest;

import java.io.File;

public class FileTest03 {
	public static void main(String[] args) {
		File file = new File("d:\\");
		list(file);
		
	}
	
	static void list(File file) {
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				list(files[i]);
			}
		}
		else {
			System.out.println(file.getName());
		}
	}
}

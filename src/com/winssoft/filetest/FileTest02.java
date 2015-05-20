package com.winssoft.filetest;

import java.io.File;

public class FileTest02 {
	public static void main(String[] args) {
		File file = new File("c:\\");
		
		File[] files = file.listFiles();
		for (File fileeach : files) {
			System.out.println(fileeach.getName());
		}
	}
}

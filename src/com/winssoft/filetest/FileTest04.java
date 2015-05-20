package com.winssoft.filetest;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest04 {
	public static void main(String[] args) {
		File file = new File("D:\\Java_workspace\\Test\\src\\com\\winssoft\\filetest");
		File[] files = file.listFiles(new MyFilter());
		
		for (File file2 : files) {
			System.out.println(file2.getName());
		}
	}
}

class MyFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		boolean result = false;
		if (name.endsWith("java")) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
	
}
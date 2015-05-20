package com.winssoft.filetest;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
	public static void main(String[] args) throws IOException {
//		File f = new File("c:\\d\\e\\f");
//		if (!f.exists()) {
//			f.mkdirs();
//		}
//		if (f.exists()) {
//			f.delete();
//		}
//		File file = new File("c:\\abc.txt");
//		if (file.exists()) {
//			file.delete();
//		}
//		else {
//			file.createNewFile();
//		}
//		File file = new File("c:\\a\\b\\abc.txt");
//		System.out.println("filename: " + file.getName());
//		System.out.println("filepath: " + file.getPath());
//		System.out.println("fileAbsPath: " + file.getAbsolutePath());
//		System.out.println("parent: " + file.getParent());
//		
//		File file2 = new File("c:\\a\\b\\abc1.txt");
//		file.renameTo(file2);
//		System.out.println("filename: " + file.getName());
		
		File file = new File("c:\\abc.txt");
		System.out.println("can Read: " + file.canRead());
		System.out.println("can Write: " + file.canWrite());
		System.out.println("isHidden: " + file.isHidden());
		System.out.println("isfile: " + file.isFile());
		System.out.println("isDir: " + file.isDirectory());
		System.out.println("...");
	}
}

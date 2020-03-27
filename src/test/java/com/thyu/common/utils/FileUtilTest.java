package com.thyu.common.utils;

import java.io.File;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetFileSuffixName() {
		File file = new File("C:\\Users\\dell\\Desktop\\啊啊啊.txt");
		System.out.println(file.exists());
		System.out.println(FileUtil.getUUIDFileName(file));
	}
	@Test
	public void testDeleteFile() {
		File file = new File("C:\\Users\\dell\\Desktop\\thyuUtils");
		System.out.println(file.exists());
		System.out.println(FileUtil.deleteFile(file));
	}
	@Test
	public void testGetSystemProperty() {
		System.out.println(FileUtil.getClassPath());
	}
}

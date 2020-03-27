package com.thyu.common.utils;

import java.io.File;

import org.junit.Test;

public class IOUtilTest {

	@Test
	public void testClose() {
		
	}

	@Test
	public void testCopyFile() {
		File from = new File("C:\\Users\\dell\\Desktop\\于天昊3.27日考备份\\于天昊3.27作业效果.mp4");
		File to = new File("C:\\Users\\dell\\Desktop\\今天作业效果.mp4");
		boolean success = IOUtil.copyFile(from, to, true);
		System.out.println(success);
	}
	@Test
	public void testReadFileByLine() {
		File file = new File("C:\\Users\\dell\\Desktop\\IOUtilTest.java");
		IOUtil.readFileByChar(file);
	}
	@Test
	public void testWrite() {
		File file = new File("C:\\Users\\dell\\Desktop\\IOUtilTest.java");
		File to = new File("C:\\Users\\dell\\Desktop\\啊啊啊.txt");
		IOUtil.writeFileByBuffered(file, to);
	}

}

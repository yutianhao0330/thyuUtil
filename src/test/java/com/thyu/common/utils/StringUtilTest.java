package com.thyu.common.utils;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String src = " ";
		System.out.println(StringUtil.hasLength(src));
	}

	@Test
	public void testHasText() {
		String src = " ";
		System.out.println(StringUtil.hasText(src));
	}

	@Test
	public void testRandomChineseString() throws UnsupportedEncodingException {
		System.out.println(StringUtil.randomChineseString(5));
	}

	@Test
	public void testGenerateChineseName() {
		System.out.println(StringUtil.generateChineseName());
	}
	@Test
	public void testIsphone() {
		System.out.println(StringUtil.isPhone("18120299911"));
	}
	@Test
	public void testIsEmail() {
		System.out.println(StringUtil.isEmail("thyusjtu@sjtu.edu.cn"));
	}
	@Test
	public void test() {
		System.out.println(StringUtil.randomString(10000));
	}
}
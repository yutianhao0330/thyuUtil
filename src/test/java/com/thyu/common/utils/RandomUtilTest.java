package com.thyu.common.utils;

import java.util.Arrays;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int random = RandomUtil.random(5, 12);
		System.out.println(random);
	}

	@Test
	public void testSubRandom() {
		int[] subRandom = RandomUtil.subRandom(2, 10, 5);
		System.out.println(Arrays.toString(subRandom));
	}

	@Test
	public void testRandomCharacter() {
		System.out.println(RandomUtil.randomCharacter());
	}

	@Test
	public void testRandomString() {
		System.out.println(RandomUtil.randomString(4));
	}
	


}

package com.thyu.common.utils;

import org.junit.Test;
/**
 * 
    * @ClassName: NumberUtilTest
    * @Description: 数字工具类测试类
    * @author thyu
    * @date 2020年4月4日
    *
 */
public class NumberUtilTest {

	@Test
	public void testGetPercent() {
		int percent = NumberUtil.getPercent(1,3);
		System.out.println(percent);
	}

}

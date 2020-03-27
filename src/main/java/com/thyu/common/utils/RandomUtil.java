package com.thyu.common.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
    * @ClassName: RandomUtil
    * @Description: 随机数处理工具类
    * @author thyu
    * @date 2020年3月26日
    *
 */
public class RandomUtil {
	/**
	 * 
	    * @Title: random
	    * @Description: 返回min-max之间的随机整数（包含min和max值）
	    * @param @param min
	    * @param @param max
	    * @param @return    参数
	    * @return int    返回类型
	    * @throws
	 */
	public static int random(int min, int max){
		//TODO 实现代码
		return min + new Random().nextInt(max - min + 1);
	}
	/**
	 * 
	    * @Title: subRandom
	    * @Description: 在最小值min与最大值max之间截取subs个不重复的随机数
	    * @param @param min
	    * @param @param max
	    * @param @param subs
	    * @param @return    参数
	    * @return int[]    返回类型
	    * @throws
	 */
	public static int[] subRandom (int min, int max, int subs){
		//TODO 实现代码
		if(subs > (max - min +1)) {
			throw new RuntimeException("数组太大，无法生成随机数组！");
		}
		List<Integer> list = new ArrayList<Integer>();
		for(;;) {
			int random = random(min, max);
			if(list.contains(random)) {
				continue;
			}
			list.add(random);
			if(list.size()==subs) {
				break;
			}
		}
		int[] result = new int[subs];
		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}
		return result;
	}
	/**
	 * 
	    * @Title: randomCharacter
	    * @Description: 返回1个0-9,a-Z之间的随机字符
	    * @param @return    参数
	    * @return char    返回类型
	    * @throws
	 */
	public static char randomCharacter (){
		//TODO 实现代码
		int random = random(0, 61);
		int result = random<10?random+48:random<36?random+55:random+61;
		return (char)result;
	}
	/**
	 * 
	    * @Title: randomString
	    * @Description: 返回长度为length个数字字母字符串
	    * @param @param length
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	public static String randomString(int length){
		//TODO 实现代码
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < length; i++) {
			buffer.append(randomCharacter());
		}
		return buffer.toString();
	}
}

package com.thyu.common.utils;
/**
 * 
    * @ClassName: NumberUtil
    * @Description: 数字处理工具类
    * @author thyu
    * @date 2020年4月4日
    *
 */
public class NumberUtil {
	/**
	 * 
	    * @Title: getPercent
	    * @Description: 百分比计算方法，返回值只要整数不需要小数。
	    * @param @param current
	    * @param @param total
	    * @param @return    参数
	    * @return int    返回类型
	    * @throws
	 */
	public static int getPercent(int current, int total){
		//TODO 实现代码
		;
		return (int)(Math.round((current+0.0)*100/total));
	}
}

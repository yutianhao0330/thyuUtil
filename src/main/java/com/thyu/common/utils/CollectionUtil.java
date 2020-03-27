package com.thyu.common.utils;

import java.util.Collection;

/**
 * 
    * @ClassName: CollectionUtil
    * @Description: 集合的处理类
    * @author thyu
    * @date 2020年3月26日
    *
 */
public class CollectionUtil {
	/**
	 * 
	    * @Title: isEmpty
	    * @Description: 判断集合是否为空
	    * @param @param collection
	    * @param @return    参数
	    * @return boolean    返回类型
	    * @throws
	 */
	public static boolean isEmpty(Collection<?> collection ) {
		return null==collection || collection.isEmpty();
	}
}

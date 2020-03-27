package com.thyu.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetAge() {
		Calendar birthday = Calendar.getInstance();
		birthday.set(1993, 2, 27);
		int age = DateUtil.getAge(birthday.getTime());
		System.out.println(age);
	}

	@Test
	public void testRandomDate() throws ParseException {
		Calendar start = Calendar.getInstance();
		start.set(1993, 2, 12);
		Calendar now = Calendar.getInstance();
		Date randomDate = DateUtil.randomDate(start.getTime(), now.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 		System.out.println(sdf.format(randomDate));
	}
	@Test
	public void testGetInitMonth() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date result = DateUtil.getInitMonth(sdf.parse("2001-02-24 12:23:24"));
		System.out.println(sdf.format(result));
	}
	@Test
	public void testGetEndMonth() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date result = DateUtil.getEndMonth(sdf.parse("2001-02-24 12:23:24"));
		System.out.println(sdf.format(result));
	}
	@Test
	public void testOtherMethods() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2020, 2, 23);
		System.out.println(DateUtil.inThisWeek(calendar.getTime()));
	}
}

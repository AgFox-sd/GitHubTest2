package com.teams.mapper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
		String batchno=format.format(new Date());
		int num=(int)((Math.random()*9+1)*100000);
		System.out.println(100+batchno+num);
	}
	
}

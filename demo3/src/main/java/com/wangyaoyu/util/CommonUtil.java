package com.wangyaoyu.util;

import java.util.regex.Pattern;



public class CommonUtil {
	//判断字符串是否为数字
	public static boolean isNumber(String src){
		return Pattern.compile("\\d+").matcher(src).matches();		
	}
	
	
	
	//判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	
	public static boolean hasText(String src){
		if (!src.equals(null)||!src.equals(" ")||!src.equals("")) {
			return true;
		}
		else{
			return false;
		}
	}
	
	
	//根据url地址取出地址中的数字:"[^0-9]"
	public static int getPlaceHolder(String url,String reg){
		
		String score = Pattern.compile(reg).matcher(url).replaceAll("");
						
		return hasText(score)?Integer.parseInt(score):0;
		
	}
	public static void main(String[] args) {
		int str = CommonUtil.getPlaceHolder("jhhiohub999", "[^0-9]");
		System.out.println(str);
	}
	
}

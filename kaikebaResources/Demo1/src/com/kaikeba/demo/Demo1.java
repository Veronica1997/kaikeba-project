package com.kaikeba.demo;

import java.io.IOException;

public class Demo1 {
	//代码分为结构定义语句, 和 功能执行语句.
	//功能执行语句必须以分号结尾
	public static void main(String[] args) throws IOException {
		//(单行注释//) 注释: 注释是对代码的解释和说明,注释只是为了提高代码的可读性,注释不会被计算机作为指令执行
		//单行注释的范围:	从//开始  到 行的结束
		//关机
		//Runtime.getRuntime().exec("shutdown -s -t 1000");
		//取消关机
		Runtime.getRuntime().exec("shutdown -a");
		
	}

}

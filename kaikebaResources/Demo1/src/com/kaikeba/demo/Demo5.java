package com.kaikeba.demo;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.	用于创建接收用户输入的变量input
		Scanner input = new Scanner(System.in);
		//2.	先提示用户请输入
		System.out.println("请输入一个秒数");
		//3.	接收用户输入
		String text = input.nextLine();
		System.out.println("你输入的是:"+text);
	}

}

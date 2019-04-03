 package com.yr.util.random;
// imporjava.land.*

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		RandomEx1 ex = new RandomEx1();
		Random rd = new Random();
		int num = rd.nextInt(); //int 최소, 최대
		System.out.println(num);

		num = rd.nextInt(5);
		System.out.println(num);
		
		ex.ex2();
	}

}

package com.yr.lang;

public class Object_1_Object {

	public static void main(String[] args) {
		// Object 클래스의 객체 생성
		// 클래스명 참조변수명 = new 생성자();
		// 참조변수명.멤버변수명
		// 참조변수명.멤버메서드명();
		Object obj = new Object();
		Object obj2 = new Object();
		//접근지정자 그외지정자 리턴타입 메서드명([매개변수 선언])		
		
		boolean c = obj.equals(obj);
		System.out.println(c);
		
		String str = obj.toString();
		System.out.println(str);
		System.out.println(obj);
		
		int i = obj.hashCode();
		System.out.println(i);
		
		
	}
}

package com.yr.util.sort;

public class Member implements Comparable<Member>{
			// Member는 Comparable<Member> type이 될 수 있다.
	private String id;
	private int age;

	@Override
	public int compareTo(Member o) {
		int result=0;
		
		
		
		
		return 0;
	}

	
	
	
	
	public Member(String id ,int age) {
		this.id = id;
		this.age = age;
		System.out.println("this : " + this);
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

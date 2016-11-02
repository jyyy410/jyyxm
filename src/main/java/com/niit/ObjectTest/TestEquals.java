package com.niit.ObjectTest;

public class TestEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Single s1 = new Single(13);
		Single s2 = new Single(13);
		Pair p1 = new Pair(5, 6);
		Pair p2 = new Pair(5, 8);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));//Object的e比较方法是比较两个对象是否是同一个引用。
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));//Object的equal方法，重写后就是自己定义的比较方法。
		
		//==如果两边是变量，就是比较值是否相等，如果是两边是对象，就比较引用。
	}

}

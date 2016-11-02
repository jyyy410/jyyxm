package com.niit.ObjectTest;

public class Pair {
int x;
int y;

public Pair(int x,int y) {
	this.x=x;
	this.y=y;
}

@Override
	public boolean equals(Object obj) {
		Pair that = (Pair) obj;
		if (this.x==that.x) {
			return true;
		}
		return false;
	}
}

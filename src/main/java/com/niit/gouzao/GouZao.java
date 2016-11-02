package com.niit.gouzao;

public class GouZao {
int a;

static int b=6;
public GouZao(int a) {
	this.a = a;
}
	public static void main(String[] args) {
		System.out.println(new GouZao(5));
		GouZao.b=7;
		GouZao bGouZao=new GouZao(8);
		System.out.println(bGouZao.b);

	}
	

}

package com.sadp.desigpatterns;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj = Singleton.INSTANCE;
		Singleton obj2=Singleton.INSTANCE;
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());

	}

}

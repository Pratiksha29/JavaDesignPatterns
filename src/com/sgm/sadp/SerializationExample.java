package com.sgm.sadp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample implements Serializable {
	int a;
	int b;

	public SerializationExample(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) throws IOException {
		SerializationExample se = new SerializationExample(1, 2);
		FileOutputStream fi = new FileOutputStream(new File("D:\\obj.txt"));
		ObjectOutputStream out = new ObjectOutputStream(fi);
		out.writeObject(se);
	}
}

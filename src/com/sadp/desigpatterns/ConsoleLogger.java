package com.sadp.desigpatterns;

import java.lang.reflect.Constructor;

public class ConsoleLogger implements Logger {

	private static ConsoleLogger instance;

	@Override
	public void logger(String message) {
		System.out.println(message);

	}

	public static ConsoleLogger getInstance() {

		return SingletonHolder.INSTANCE;
	}

	private static class SingletonHolder {
		public static final ConsoleLogger INSTANCE = new ConsoleLogger();
	}
	
	//to break Singleton pattern using reflection

public static void main(String[] args) {
	ConsoleLogger instanceOne = ConsoleLogger.getInstance();
	ConsoleLogger instanceTwo = null;
	try {
	Constructor[] constructors = ConsoleLogger.class.getDeclaredConstructors();
	for (Constructor constructor : constructors) {
		constructor.setAccessible(true);
		constructor.setAccessible(true);
		instanceTwo = (ConsoleLogger) constructor.newInstance();
		break;}
	
	} catch (Exception e) {
e.printStackTrace();
	}
System.out.println(instanceOne.hashCode());
System.out.println(instanceTwo.hashCode());}}
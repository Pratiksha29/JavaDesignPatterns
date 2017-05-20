package com.sadp.AbstractFactory;

public class UnixViewImage implements ImageViewer{

	@Override
	public void viewImage(String platform) {
		System.out.println("creating image for Unix platform");		
	}

}

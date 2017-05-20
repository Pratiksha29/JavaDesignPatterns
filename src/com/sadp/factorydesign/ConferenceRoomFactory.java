package com.sadp.factorydesign;

public class ConferenceRoomFactory implements Factory {

	@Override
	public void createDoor() {
		// TODO Auto-generated method stub
		System.out.println("conference room door");
	}

	@Override
	public void createFloor() {
		System.out.println("conference room door");
	}

}

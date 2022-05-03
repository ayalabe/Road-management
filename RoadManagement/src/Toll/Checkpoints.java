package Toll;

import java.util.ArrayList;


public class Checkpoints {
	private String name;
	private String address;
	private int  positionNumberInToll;
	
	public Checkpoints(String name, String address, int positionNumberInToll) {
		this.name = name;
		this.address = address;
		this.positionNumberInToll = positionNumberInToll;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPositionNumberInToll() {
		return positionNumberInToll;
	}
	public void setPositionNumberInToll(int positionNumberInToll) {
		this.positionNumberInToll = positionNumberInToll;
	}

	

	@Override
	public String toString() {
		return "Checkpoints [name=" + name + ", address=" + address + ", positionNumberInToll=" + positionNumberInToll
				+ "]";
	}
	
	
	
}

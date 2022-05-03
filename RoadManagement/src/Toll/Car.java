package Toll;

import java.util.Random;

public class Car {
	
	private int coins;
	private float plateNumber;
	private Toll toll;
	private int numCheckPoint;
	
	
	public Car(int coins, float plateNumber, Toll toll) {
		this.coins = coins;
		this.plateNumber = plateNumber;
		this.toll = toll;
		this.numCheckPoint = 0;
	}
	
	public void draive() {
		Random rand = new Random();
		int rand1 = rand.nextInt(2);
		switch(rand1) {
		case 0:
			this.draiveNext();
			break;
		case 1:
			this.draivePrev();
			break;
		}
			
		
	}
	
	public void draiveNext() {
		if(this.numCheckPoint == Toll.NUM_CHECKPOINTS)
			draivePrev();
		else {
			this.numCheckPoint++;
		}
		
		
	}
	
	public void draivePrev() {
		if(this.numCheckPoint == 0)
			draiveNext();
		else {
			this.numCheckPoint--;
		}
	}


	public int getCoins() {
		return coins;
	}


	public void setCoins(int coins) {
		this.coins = coins;
	}


	public float getPlateNumber() {
		return plateNumber;
	}


	public void setPlateNumber(float plateNumber) {
		this.plateNumber = plateNumber;
	}


	@Override
	public String toString() {
		return "Car [coins=" + coins + ", plateNumber=" + plateNumber  + ",numCheckPoint=" + numCheckPoint +"]";
	}

	
	
}

package Toll;

import java.util.Iterator;
import java.util.LinkedList;

public class Toll {
	
	public static final int NUM_CHECKPOINTS = 6;
	LinkedList<Checkpoints> checkpoints;
	private int mony;
	
	
	public Toll(LinkedList<Checkpoints> checkpoints) {
		
		this.checkpoints = checkpoints;
		this.mony = 0;
	}
	
	public void removeCheckpoint(int index) {
		Iterator<Checkpoints> iterator = checkpoints.iterator();
		if(index < 0 || index >4)
			throw new IndexOutOfBoundsException();
		Checkpoints pointStart = checkpoints.get(index);
		while(iterator.next() != pointStart) {
			iterator.next();
		}
		
		while(iterator.hasNext()) {
			Checkpoints temp = iterator.next();
			temp.setPositionNumberInToll(temp.getPositionNumberInToll()-1);
		}
		
		this.checkpoints.remove(index);
	}
	
	public void addCheckpoint(int index, Checkpoints checkpoint) {
		Iterator<Checkpoints> iterator = checkpoints.iterator();
//		if(index < 0 || index >4)
//			throw new IndexOutOfBoundsException();
		Checkpoints pointStart = checkpoints.get(index);
		while(iterator.next() != pointStart && iterator.next() != null) {
			iterator.next();
		}
		
		while(iterator.hasNext()) {
			Checkpoints temp = iterator.next();
			temp.setPositionNumberInToll(temp.getPositionNumberInToll()+1);
		}
		
		this.checkpoints.add(index,checkpoint);
	}
	
	public void run() {
		
	}

	@Override
	public String toString() {
		return "Toll [checkpoints=" + checkpoints + "]";
	}
	
	
}

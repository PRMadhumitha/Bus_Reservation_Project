package Bus_Reservation;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity; //Get and Set Method
	
	Bus(int no,boolean ac,int cap){ // constructor
		
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	public int getBusNo(){ //accessors
		return busNo;
	}
	
	public boolean isAc(){
		return ac;
	}
	public int getCapacity(){ // accessor Method  no argument | return type
		return capacity;
	}
	
	public void setAc(boolean val) { //mutators
		ac = val;
	}
	
	public void setCapacity(int cap) { //mutator - மாற்றுபவர் argument | no return type
		capacity = cap;
	}
	
	public void displayBusInfo(){  // method calling
		System.out.println("Bus No:" + busNo + " Ac:" + ac + " Total Capacity: " + capacity);
	}
}

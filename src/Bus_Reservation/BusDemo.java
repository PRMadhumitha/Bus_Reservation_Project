package Bus_Reservation;

import java.util.Scanner; //nested package/ hierarchical package
import java.util.ArrayList;

public class BusDemo {

	public static void main(String[] args) {
		System.out.println("Bus Reservation Project......");
	
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(101,true,2));//sample
		buses.add(new Bus(102,false,50));
		buses.add(new Bus(103,true,48));
		buses.add(new Bus(104,true,24));
		buses.add(new Bus(105,true,50));
		buses.add(new Bus(106,true,60));
		
		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		
		while(userOpt==1) {
			
			System.out.println("Enter 1 to Book and 2 to exit");
			userOpt = scanner.nextInt();
			if(userOpt == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) { //method call pandrom
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else
					System.out.println("Sorry. Bus is full. Try another bus or date.");
			}
		}
	}

}

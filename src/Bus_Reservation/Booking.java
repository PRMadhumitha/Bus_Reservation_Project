package Bus_Reservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Passenger Name ");
		passengerName = scanner.next();//name automatically stored in PassengerName
		System.out.println("Enter bus Name: ");
		busNo = scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput = scanner.next(); //date store in string
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); //Convert string to date using SimpleDateFormat Method
		
		try {
			date = dateFormat.parse(dateInput); //code automatically generated for convert date
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) { //buses la irruthu than capacity kadaikum
		int capacity = 0;
		for(Bus bus:buses) { //for each loop
			if(bus.getBusNo() == busNo)
				capacity = bus.getCapacity();
		}
		
		int booked = 0;
		for(Booking b:bookings) {
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		
		return booked<capacity?true:false;
		
	}
}

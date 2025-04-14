package booking;

public class BookingReceiver {
	private String action = "";   // BOOK, CANCEL, EXTEND
    private double amount = 0.0;  // total or extra cost
    private double deposit = 0.0;

    public String getAction() { 
    	return action; 
    }
    public double getAmount() { 
    	return amount; 
    }
    public  double getDeposit() { 
    	return deposit; 
    }


	public double getRate(UserType userType) {
        switch (userType) {
            case STUDENT:
            	return 5.0;
            case FACULTY:
            	return 8.0;
            case NON_FACULTY:
            	return 10.0;
            case VISITOR:
            	return 15.0;
            default:
            	return 0.0;
        }
    }
	
	
	
	public void bookSpace(String userID, String licensePlate, int hours, UserType userType) {
        double rate = getRate(userType);
        double deposit = rate;  // Deposit is first hour only
        double total = rate * hours;

        action   = "BOOK";
        amount   = total;
        this.deposit  = deposit;
        
        System.out.printf("Booked %dh for %s [%s]%n", hours, userID, licensePlate);
    }
	
	


    public void cancelBooking(String userID, String licensePlate) {
    	action = "CANCEL";
        amount = 0.0;
        System.out.println("Canceled booking for " + userID + " [" + licensePlate + "]");
    }

    public void extendBooking(String userID, String licensePlate, int extraHours, UserType userType) { 
    	double extra = getRate(userType) * extraHours;
        action = "EXTEND";
        amount = extra;
        System.out.println("Extended booking for " + userID + " [" + licensePlate + "]");
    }

}

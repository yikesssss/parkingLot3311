package booking;

public class BookCommand implements ICommand {

	private BookingReceiver receiver;
    private String userID;
    private String licensePlate;
    private int hours; // how many hours the user wants
    private UserType userType;

    public BookCommand(BookingReceiver receiver, String userId, String licensePlate, int hours, UserType userType ) {
        this.receiver = receiver;
        this.userID = userId;
        this.licensePlate = licensePlate;
        this.hours = hours;
        this.userType = userType;
    }

    @Override
    public void doAction() {
        // The command delegates work to the receiver
        receiver.bookSpace(userID, licensePlate, hours, userType);
    }

}

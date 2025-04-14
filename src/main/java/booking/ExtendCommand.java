package booking;

public class ExtendCommand implements ICommand{
	private BookingReceiver receiver;
    private String userID;
    private String licensePlate;
    private int extraHours;
    private final UserType userType;

    public ExtendCommand(BookingReceiver receiver, String userId, String licensePlate, int extraHours, UserType userType) {
        this.receiver = receiver;
        this.userID = userId;
        this.licensePlate = licensePlate;
        this.extraHours = extraHours;
        this.userType = userType;
    }

    @Override
    public void doAction() {
        receiver.extendBooking(userID, licensePlate, extraHours,userType);
    }
}

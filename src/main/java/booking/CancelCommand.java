package booking;

public class CancelCommand implements ICommand {
	private BookingReceiver receiver;
    private String userID;
    private String licensePlate;

    public CancelCommand(BookingReceiver receiver, String userId, String licensePlate) {
        this.receiver = receiver;
        this.userID = userId;
        this.licensePlate = licensePlate;
    }

    @Override
    public void doAction() {
        receiver.cancelBooking(userID, licensePlate);
    }

}

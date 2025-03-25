
interface ICommand {
    // The main action method each command will implement
    void doAction();
}


class BookingReceiver {

    public void bookSpace(String userID, String licensePlate, int hours) {
       
        //  Check if a space is available
        //  Charge deposit for first hour
        //  Record booking details for 'hours'
        System.out.println("BookingReceiver: Booking " + hours + " hour(s) for " + userID + " [Plate: " + licensePlate + "].");
        System.out.println("Deposit for first hour has been charged.");
    }

    public void cancelBooking(String userID, String licensePlate) {
        //  Validate that booking is still before start time
        System.out.println("BookingReceiver: Canceling booking for " + userID + " [Plate: " + licensePlate + "].");
    }

    public void extendBooking(String userID, String licensePlate, int extraHours) {
        //  Check that booking not expired
        System.out.println("BookingReceiver: Extending booking by " + extraHours + " hour(s) for " + userID + " [Plate: " + licensePlate + "].");
    }
}

class BookCommand implements ICommand {
    private BookingReceiver receiver;
    private String userID;
    private String licensePlate;
    private int hours; // how many hours the user wants

    public BookCommand(BookingReceiver receiver, String userId, String licensePlate, int hours) {
        this.receiver = receiver;
        this.userID = userId;
        this.licensePlate = licensePlate;
        this.hours = hours;
    }

    @Override
    public void doAction() {
        // The command delegates work to the receiver
        receiver.bookSpace(userID, licensePlate, hours);
    }
}

class CancelCommand implements ICommand {
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


class ExtendCommand implements ICommand {
    private BookingReceiver receiver;
    private String userID;
    private String licensePlate;
    private int extraHours;

    public ExtendCommand(BookingReceiver receiver, String userId, String licensePlate, int extraHours) {
        this.receiver = receiver;
        this.userID = userId;
        this.licensePlate = licensePlate;
        this.extraHours = extraHours;
    }

    @Override
    public void doAction() {
        receiver.extendBooking(userID, licensePlate, extraHours);
    }
}

class CommandInvoker {
    private ICommand command;

    // Assign a command (BookCommand, CancelCommand, ExtendCommand)
    public void setCommand(ICommand cmd) {
        this.command = cmd;
    }

    // execute command
    public void executeCommand() {
        if (command != null) {
            command.doAction();
        }
    }
}



public class Main {
    public static void main(String[] args) throws Exception {
        BookingReceiver bookingReceiver = new BookingReceiver();

        // The invoker that calls "doAction" on whichever command is set
        CommandInvoker invoker = new CommandInvoker();

       
        ICommand bookCmd = new BookCommand(bookingReceiver, "Client A", "DDLW-031", 4);
        invoker.setCommand(bookCmd);
        invoker.executeCommand();

        
        ICommand extendCmd = new ExtendCommand(bookingReceiver, "Client A", "DDLW-031", 1);
        invoker.setCommand(extendCmd);
        invoker.executeCommand();

        
        ICommand cancelCmd = new CancelCommand(bookingReceiver, "Client A", "DDLW-031");
        invoker.setCommand(cancelCmd);
        invoker.executeCommand();
    }
}

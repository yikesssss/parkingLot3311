package booking;

public class CommandInvoker {
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

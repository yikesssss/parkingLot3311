class ManagementTeamMember extends UserConcrete {
    public ManagementTeamMember(String email, String username, String password) {
        super(email, username, password, "Management Team");
    }

    public void approveUser(User user) {
        System.out.println("Approved user: " + user);
    }

    public void rejectUser(User user) {
        System.out.println("Rejected user: " + user);
    }

    public void verifyLicencePlate() {
        System.out.println("Verifying license plate...");
    }

    public void addParkingLot() {
        System.out.println("Adding a new parking lot...");
    }

    public void disableParkingLot() {
        System.out.println("Disabling a parking lot...");
    }

    public void enableParkingLot() {
        System.out.println("Enabling a parking lot...");
    }

    public void enableParkingSpace() {
        System.out.println("Enabling a parking space...");
    }

    public void disableParkingSpace() {
        System.out.println("Disabling a parking space...");
    }

    public void receiveError(String errorMsg) {
        System.out.println("Received error: " + errorMsg);
    }

    public void processManualInput(String input) {
        System.out.println("Processing manual input: " + input);
    }
}

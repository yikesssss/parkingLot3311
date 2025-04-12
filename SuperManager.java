package com;
class SuperManager extends ManagementTeamMember {
    private static SuperManager instance;

    private SuperManager() {
        super("supermanager@example.com", "SuperManager", "adminPass");
    }

    public static SuperManager getInstance() {
        if (instance == null) {
            instance = new SuperManager();
        }
        return instance;
    }

    public void generateManagementAccount(String email, String username, String password) {
        User newManager = new ManagementTeamMember(email, username, password);
        Database.getInstance("users.csv").users.add(newManager);
        try {
            Database.getInstance("users.csv").update("users.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("New Management Account Created: " + email);
    }
}

class SuperManager extends UserConcrete {
    private static SuperManager instance;
    private SuperManager() {
        super("supermanager@example.com", "SuperManager", "adminPass", "Super Manager");
    }
    public static SuperManager getInstance() {
        if (instance == null) {
            instance = new SuperManager();
        }
        return instance;
    }
}

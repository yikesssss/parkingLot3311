class Database {
    private static Database instance;
    public ArrayList<User> users = new ArrayList<>();
    private String path;

    private Database(String path) {
        this.path = path;
        try {
            load(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Database getInstance(String path) {
        if (instance == null) {
            instance = new Database(path);
        }
        return instance;
    }

    public void load(String path) throws Exception {
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();
        
        while (reader.readRecord()) {
            User user = new User();
            user.setName(reader.get("name"));
            user.setId(Integer.parseInt(reader.get("id")));
            user.setEmail(reader.get("email"));
            user.setPassword(reader.get("password"));
            users.add(user);
        }
        reader.close();
    }

    public void update(String path) throws Exception {
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
            csvOutput.write("name");
            csvOutput.write("id");
            csvOutput.write("email");
            csvOutput.write("password");
            csvOutput.endRecord();

            for (User u : users) {
                csvOutput.write(u.getName());
                csvOutput.write(String.valueOf(u.getId()));
                csvOutput.write(u.getEmail()); 
                csvOutput.write(u.getPassword());
                csvOutput.endRecord();
            }
            csvOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

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

	public static void resetInstance() {
		instance = null;
	}

    public void load(String path) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;

        // Skip header
        reader.readLine();

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 4) {
                String email = parts[0];
                String username = parts[1];
                String password = parts[2];
                String userType = parts[3];

                User user = new UserConcrete(email, username, password, userType);
                users.add(user);
            }
        }
        reader.close();
    }

    public void update(String path) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path, false));

       
        writer.write("email,username,password,userType");
        writer.newLine();

        for (User u : users) {
            if (u instanceof UserConcrete uc) {
                String line = uc.getEmail() + "," +
                              uc.getUsername() + "," +
                              uc.getPassword() + "," +
                              uc.getUserType();
                writer.write(line);
                writer.newLine();
            }
        }

        writer.close();
    }
}

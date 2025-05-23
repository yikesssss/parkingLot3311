package user;

import database.*;

public class UserConcrete implements User{

	  protected String email;
	  protected String username;
	  protected String password;
	  protected String userType;
	 
	  public static String csvPath = "users.csv";
	 
	  public UserConcrete(String email, String username, String password, String userType) {
	      this.email = email;
	      this.username = username;
	      this.password = password;
	      this.userType = userType;
	  }
	 
	  @Override
	 public void register() {
	      Database db = Database.getInstance(csvPath);
	 
	      for (User u : db.users) {
	          if (u instanceof UserConcrete uc && uc.email.equals(this.email)) {
	              System.out.println("Error: Email already registered.");
	              return;
	          }
	      }
	 
	      db.users.add(this);
	      try {
	          db.update(csvPath);
	          System.out.println(userType + " account successfully registered: " + email);
	      } catch (Exception e) {
	          System.out.println("Error registering user: " + e.getMessage());
	      }
	  }
	 
	  @Override
	 public boolean login(String email, String password) {
	      Database db = Database.getInstance(csvPath);
	 
	      for (User u : db.users) {
	          if (u instanceof UserConcrete uc && uc.email.equals(email) && uc.password.equals(password)) {
	              System.out.println("Login successful: " + email);
	              return true;
	          }
	      }
	 
	      System.out.println("Login failed: Invalid email or password.");
	      return false;
	  }
	 
	  @Override
	 public boolean validateEmail() {
	      return email.contains("@");
	  }
	 
	  @Override
	 public boolean validatePassword() {
	      return password.length() >= 6;
	  }
	 
	  @Override
	 public String getEmail() {
	      return email;
	  }
	 
	  public String getUsername() {
	      return username;
	  }
	 
	  @Override
	 public String getPassword() {
	      return password;
	  }
	 
	  public String getUserType() {
	      return userType;
	  }
//	protected String email;
//    protected String username;
//    protected String password;
//    protected String userType;
//    protected String id;
//
//    public UserConcrete(String email, String username, String password, String userType) {
//        this.email = email;
//        this.username = username;
//        this.password = password;
//        this.userType = userType;
//    }
//
//   
//    public void register() {
//        Database db = Database.getInstance("users.csv");
//        
//        
//        for (User u : db.users) {
//            if (u.getEmail().equals(this.email)) {
//                System.out.println("Error: Email already registered.");
//                return;
//            }
//        }
//
//        db.users.add(this);
//        try {
//            db.update("users.csv");
//            System.out.println(userType + " account successfully registered: " + email);
//        } catch (Exception e) {
//            System.out.println("Error registering user: " + e.getMessage());
//        }
//    }
//
//    public boolean login(String email, String password) {
//        Database db = Database.getInstance("users.csv");
//
//        for (User u : db.users) {
//            if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
//                System.out.println("Login successful: " + email);
//                return true;
//            }
//        }
//
//        System.out.println("Login failed: Invalid email or password.");
//        return false;
//    }
//    public boolean validateEmail() {
//        return email.contains("@");
//    }
//
//    public boolean validatePassword() {
//        return password.length() >= 6;
//    }
//
//
//	@Override
//	public void setName(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	@Override
//	public void setId(int parseInt) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	@Override
//	public void setEmail(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	@Override
//	public void setPassword(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	@Override
//	public String getName() {
//		return this.username;
//	}
//
//
//	@Override
//	public String getId() {
//		return this.id;
//	}
//
//
//	@Override
//	public String getEmail() {
//		return this.email;
//	}
//
//
//	@Override
//	public String getPassword() {
//		return this.password;
//	}
//


}

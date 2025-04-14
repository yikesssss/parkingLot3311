package user;

public interface User {

//	void register();
//    boolean login(String email, String password);
//    boolean validateEmail();
//    boolean validatePassword();
//	void setName(String string);
//	void setId(int parseInt);
//	void setEmail(String string);
//	void setPassword(String string);
//	String getName();
//	String getId();
//	String getEmail();
//	String getPassword();
	
	 void register();
     boolean login(String email, String password);
     boolean validateEmail();
     boolean validatePassword();
 
     String getEmail();
     String getPassword();

}

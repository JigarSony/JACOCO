package appFeature;

public class AppLogin {
	
	public boolean login(String usr,String pwd) {
		
		boolean login_status = false;
		
		if(usr.equals("admin") && pwd.equals("admin")) {
			login_status = true;
		}
		else if(!usr.equals("admin") && !pwd.equals("admin")) {
			login_status = false;
		}
		return login_status;
		
	}
}

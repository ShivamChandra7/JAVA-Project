package studentManager;

public class AdminLogin {
	private String user="admin";
	private String password="admin123";
	public boolean Login(String user,String pass) {
		if(this.password.equals(pass)) {
			return true;
		}
		else 
			return false;
	}
}

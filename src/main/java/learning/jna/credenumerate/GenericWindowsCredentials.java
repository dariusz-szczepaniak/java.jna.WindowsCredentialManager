package learning.jna.credenumerate;

public class GenericWindowsCredentials {
	private String address;
	private String username;
	private String password;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {		
		return "address:[" + getAddress() + "], username:[" + getUsername() + "], password:[" + getPassword() + "]"; 
	}
	
	
}	

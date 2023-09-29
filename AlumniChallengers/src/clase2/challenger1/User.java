package clase2.challenger1;

import java.util.Arrays;

public class User {
	
	private String email;
	
	private String password;
	
	private Persona[] persona;
	
	public User(String email, String password, Persona[] persona) {
		this.email = email;
		this.password = password;
		this.persona = persona;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Persona[] getPersona() {
		return persona;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", persona=" + Arrays.toString(persona) + "]";
	}

	public void setPersona(Persona[] persona) {
		this.persona = persona;
	}
	
	
}

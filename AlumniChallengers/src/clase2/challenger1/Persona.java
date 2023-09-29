package clase2.challenger1;

public class Persona {
	
	private String firstName;
	
	private String lastName;
	
	private byte type;
	
	private Long numbers;
	
	public Persona() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public byte getType() {
		return type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	public Long getNumbers() {
		return numbers;
	}

	public void setNumbers(Long numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return "Persona [firstName=" + firstName + ", lastName=" + lastName + ", type=" + type + ", numbers=" + numbers
				+ "]";
	}
	
	
}

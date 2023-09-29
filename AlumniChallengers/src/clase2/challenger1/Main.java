package clase2.challenger1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner into = new Scanner(System.in);
		String email = null, password = null, cantidad = null;
		Boolean start = false;
		
		while (!start) {
			System.out.println("Enter Username");
			email = into.nextLine();
			
			System.out.println("Enter password");	
			password = into.nextLine();
			start = auth(email, password);
		}
		
			System.out.println("Cantidad de personas");
			cantidad = into.nextLine();

			Persona[] personas = new Persona[Integer.parseInt(cantidad)];
			
			for (int i = 0;  i < Integer.parseInt(cantidad); i++) {
				
				Persona persona = new Persona();
				
				System.out.println("Indique el nombre:");
				persona.setFirstName(into.nextLine());
				
				System.out.println("Indique el Apellido:");
				persona.setLastName(into.nextLine());
				
				System.out.println("Indique el tipo de documento:");
				persona.setType(into.nextByte());
				
				System.out.println("Indiquer el numero");
				persona.setNumbers(into.nextLong());
				
				personas[i] = persona;
			}
			User user = new User(email, password, personas);
			for (Persona persona : user.getPersona()) {
				System.out.println(persona);
			}
			into.close();
		
		
	}
	
	public static Boolean auth(String email, String password) {
		if (email.contains("educacionit.com") && password.startsWith(password.toUpperCase().substring(0, 1)) && validPassword(password)) {
			return true;
		} else {
			return false;
		}		
	}
	
	public static Boolean validPassword(String password) {
		String[] symbols = {"*", ".", "-", "_"};
		
		for (String symbol : symbols) {
			if (password.contains(symbol)) return true;
		}
		
		
		return false;
	}
}

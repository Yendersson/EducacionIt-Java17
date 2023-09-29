package clase1;


public class Challenger1 {

	public static void main(String[] args) {
		int cant = 5;
		elements(cant);
		
	}
	public static void elements(int cantidad) {
		int i =0;
		int[] array = new int[cantidad];
		
		while (i !=cantidad) {
			array[i] = (int) (Math.random() * cantidad) +1;
			i++;
		}
		
		for (int num : array) {
			if (num % 5 == 0) { 	
				System.out.println("FUzzz");
			} else if (num % 3 == 0) { 	
				System.out.println("Fizz");
			} else {
				System.out.println(num);
			}
		}
	}

}

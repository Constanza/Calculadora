import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float resultado = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Ingrese primer operando: ");
		int numUno = scanner.nextInt();
		
		System.out.print("Ingrese segundo operando: ");
		int numDos = scanner.nextInt();
		
		System.out.print("Operaciones disponibles (+ - /  *)" +  
		" \nIngrese la operacion a realizar: ");
		String operacion = scanner.next();
		
		switch (operacion) {
		case "+":
			resultado = numUno + numDos;
			break;
		case "-":
			resultado = numUno - numDos;
			break;
		case "/":
			resultado = numUno / numDos;
			break;
		case "*":
			resultado = numUno * numDos;
			break;

		default:
			break;
		}
		
		System.out.println("Resultado: " + resultado);
		
	}
	
	

}

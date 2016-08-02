

import com.kodea.calc.oper.Operador;
import com.kodea.calc.user.Usuario;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario user = new Usuario();
		Operador oper = new Operador();
		double result = 0;
		
		switch (user.pedirOperador()) {
		case "+":
			result = oper.add(user.pedirPrimerOperando(), user.pedirSegundoOperando());
			break;
		case "-":
			result = oper.substract(user.pedirPrimerOperando(), user.pedirSegundoOperando());
			break;
		case "/":
			result = oper.divide(user.pedirPrimerOperando(), user.pedirSegundoOperando());
			break;
		case "*":
			result = oper.multiply(user.pedirPrimerOperando(), user.pedirSegundoOperando());
			break;
		}
		
		System.out.println("Resultado: " + result);
	}
	
	

}

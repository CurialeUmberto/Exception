
public class Throw {

	public static void Accesso(int age) {

		if (age < 18) {
			throw new ArithmeticException("ACCESSO NEGATO --- Hai meno di 18 anni");
		} else {
			System.out.println("ACCESSO CONCESSO --- Sei maggiorenne");
		}
	}

	public static void main(String[] args) {

		Throw.Accesso(18);
	}

}


public class BlockTryCatch {

	public static void main(String[] args) {
		try {

			int myNumbers[] = { 1, 2, 3 };
			System.out.println(myNumbers[5]);
		} catch (Exception array) {
			System.out.println("Potrebbe esserci un errore");
		}

	}

}

/*
L' tryistruzione consente di definire un blocco di codice da testare per errori durante l'esecuzione.
L' catch istruzione consente di definire un blocco di codice da eseguire, se si verifica un errore nel blocco try.
Le parole chiave trye catchvengono fornite in coppia
*/
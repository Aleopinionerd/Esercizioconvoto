package registrostudenti;

import java.util.ArrayList; //importare librerie
import java.util.Scanner;

public class Registro {

	Scanner scanner = new Scanner(System.in); // aprire lo scanner
	// Array list
	ArrayList<Studenti> registro = new ArrayList<>();
	int scelta;

	public void mostraMenu() {
		do {
			// stampe di output per il menu del registro
			System.out.println("\nMenu registro studenti");
			System.out.println("1. Aggiungi studente");
			System.out.println("2. Visualizza tutti gli studenti registrati");
			System.out.println("3. Cerca uno studente dalla matricola");
			System.out.println("4. Esci dal registro");
			System.out.print("Scegli opzione da 1 a 4: ");

			scelta = scanner.nextInt();// scelta con il valore che da l'utente
			scanner.nextLine();

			boolean trovato = false;
			switch (scelta) {
			case 1: // aggiungere uno studente al registro con i parametri nome, cognome, matricola

				System.out.print("Inserisci il nome dello studente: ");
				String nome = scanner.nextLine();
				System.out.print("Inserisci il cognome dello studente: ");
				String cognome = scanner.nextLine();
				System.out.print("Inserisci la matricola dello studente: ");
				String matricola = scanner.nextLine();

				// Verifica se lo studente è già stato registrato tramite la matricola
				boolean matricolaEsistente = false;
				for (Studenti studente : registro) {
					if (studente.getMatricola().equals(matricola)) {
						matricolaEsistente = true; // Se la matricola esiste già, segnalo la condizione
						break;
					}
				}

				if (matricolaEsistente) { // ciclo di controllo se lo studente è già stato registrato
					System.out.println("Errore: Matricola già registrata!");
				} else {
					// Crea un nuovo studente e aggiungilo al registro
					Studenti nuovoStudente = new Studenti(nome, cognome, matricola);
					registro.add(nuovoStudente);
					System.out.println("Studente aggiunto con successo!");
				}
				break;
			case 2: // Visualizzare tutti gli studenti registrati
				if (registro.isEmpty()) { // controllare se il registro è vuoto
					System.out.println("Non ci sono studenti registrati."); // stampa output
				} else {
					System.out.println("Elenco degli studenti registrati:");// stampa output
					for (Studenti studente : registro) {
						System.out.println(studente); // Stampa ogni studente nel registro
					}
				}
				break;
				
			case 3: // Cercare uno studente tramite la matricola
				System.out.print("Inserisci la matricola dello studente da cercare: ");
				String matricolaUnivoca = scanner.nextLine(); // Leggi la matricola da cercare
				// Cerca lo studente nel registro e stampa il risultato
				for (Studenti studente : registro) {
					if (studente.getMatricola().equals(matricolaUnivoca)) {
						System.out.println("Studente trovato: " + studente);
					    trovato = true; //inizializzarlo con false
						break; // Esce dal metodo, evitando di continuare a cercare
					}
				}

				 if (!trovato) {// Se non è stato trovato nessuno studente con quella matricola
				System.out.println("Studente non trovato con la matricola: " + matricolaUnivoca);
				 }
				break;
				

			case 4: // Uscire dal programma
				System.out.println("Attendere stai per uscire dal registro...");
				break;
			default:
				System.out.println("Opzione non valida! Riprova.");
				break;
			}
		} while (scelta != 4); // Continua a visualizzare il menu finché l'utente non sceglie di uscire
		scanner.close(); // chiamato solo alla fine
	}
}
 

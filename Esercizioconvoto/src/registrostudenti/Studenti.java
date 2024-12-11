package registrostudenti;

public class Studenti {
	/*Gestione di un Registro di Studenti
	Creare un programma Java che consenta di gestire un registro degli studenti. Il programma deve:

	Registrare nuovi studenti con:
	Nome,
	Cognome,
	Matricola (univoca).
	Visualizzare l'elenco degli studenti.
	Cercare uno studente tramite la matricola.
	Requisiti Tecnici:
	Creare una classe Studente con i campi necessari.
	Utilizzare un ArrayList per memorizzare gli studenti.
	Creare un menu testuale che permetta all'utente di:

	Aggiungere uno studente.
	Visualizzare tutti gli studenti.
	Cercare uno studente per matricola.
	Uscire dal programma
	*/
	
	//creazione della classe studenti con i parametri principali richiesti
	private String nome; //restrizione dell'accesso alle variabili ai solo metodi all'interno della classe Studenti
	private String cognome;
	private String matricola;//per ogni studente la matricola deve essere diversa, valuta se lasciarla in stringa o in int
//bisogna creare il costruttore Studente, ricorda di inserire nelle parentesi quanto dichiarato prima
	public Studenti (String nome, String cognome, String matricola) { //ricorda il costruttore va con la parentesi
    this.nome = nome; //oggetto correlato alla classe
    this.cognome = cognome;
    this.matricola = matricola;
    
	}
	//getter per dare l'accesso alle variabili private 
	public String getNome () {
		return nome;
	}
	public String getCognome () {
		return cognome;
	}
	public String getMatricola () {
		return matricola;
	}
	/*@Override
	public String toString () {
		return "Studenti ( Nome:"+ nome + "Cognome: "+ cognome + "Matricola: " + matricola);
	*/
	}
	

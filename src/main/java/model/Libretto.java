package model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
private List<Voto> voti;

public Libretto() {
	
this.voti=new ArrayList<>();	

}

public void add(Voto v) {
voti.add(v);	
}

public void stampaVotiUguali(int punteggio) {
	//il Libretto stampa da solo i voti
}

public String VotiUguali(int punteggio) {
	//calcola una stringa che contiene i voti
	//sarà poi il chiamante a stamparli
	//-> Solo il nome?
	//-> Tutto il voto.toString()?
	
	return null;
}

public List<Voto> listaVotiUguali(int punteggio){
	//restituisce solo i voti uguali al criterio
	
	List<Voto> risultato=new ArrayList<>();
	for(Voto v:this.voti) {
		if(v.getVoto()==punteggio) {
			risultato.add(v);
		}
	}
	return risultato;
}

public Libretto librettoVotiUguali(int punteggio) {
	Libretto risultato=new Libretto();
	for(Voto v:this.voti)
		if(v.getVoto()==punteggio)
			risultato.add(v);
    return risultato;	
}

/**
 * Ricerca un Voto del corso di cui è specificato il nome.
 * Se il corso non esiste, restituisce null.
 * @param nomeCorso
 * @return
 */
public Voto ricercaCorso(String nomeCorso) {
	Voto risultato=null;
	for (Voto v:this.voti) {
		if(v.getNome().equals(nomeCorso))
			risultato=v;
		break;
	}
	return risultato;
}

public String toString() {
String s ="";
for(Voto v:this.voti) {
	s =s + v.toString()+ "\n";
}
return s;
}

}

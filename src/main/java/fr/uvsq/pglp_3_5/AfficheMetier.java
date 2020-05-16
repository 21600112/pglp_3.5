package fr.uvsq.pglp_3_5;
import java.time.LocalDateTime;

public class AfficheMetier implements InterfaceAfficheMetier{
	
	//Methode affiche le début du traitement
	public void afficheDebut() {
		System.out.println(LocalDateTime.now() + "Début de afficheDebut");
	}
	
	//Methode affiche le fin du traitement
	public void afficheFin() {
		System.out.println(LocalDateTime.now() + "Début de afficheFin");
	}
	
}

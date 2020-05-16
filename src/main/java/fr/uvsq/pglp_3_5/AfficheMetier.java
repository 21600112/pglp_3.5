package fr.uvsq.pglp_3_5;
import java.time.LocalDateTime;

public class AfficheMetier implements InterfaceAfficheMetier{

	public void afficheDebut() {
		System.out.println(LocalDateTime.now() + "Début de afficheDebut");
		
	}
	
	public void afficheFin() {
		System.out.println(LocalDateTime.now() + "Début de afficheFin");
	}
	
}

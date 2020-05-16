package fr.uvsq.pglp_3_5;

public class UneClasseMetier {

	private AfficheMetier a;
	
	//Construteur
	public UneClasseMetier(final AfficheMetier pA) {
		this.a = pA;
	}
	
	public void afficheInfo()
	{
		a.afficheDebut();
		//Traitement
		a.afficheFin();
	}
	
}

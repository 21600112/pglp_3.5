package fr.uvsq.pglp_3_5;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AfficheMetier a = new AfficheMetier();
        UneClasseMetier ucm = new UneClasseMetier(a);
        ucm.afficheInfo();
        
    }
}

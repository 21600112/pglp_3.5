package fr.uvsq.pglp_3_5;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	@Test
	public void robotAvanceNord()
	{	
		AfficheMetier a = new AfficheMetier();
		UneClasseMetier ucm = new UneClasseMetier(a);
		ucm.afficheInfo();
	}
	
	
}

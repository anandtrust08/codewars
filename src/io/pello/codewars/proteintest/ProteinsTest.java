package io.pello.codewars.proteintest;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class ProteinsTest {
	private Random random = new Random();
  @Test
  public void test() {
    Proteins proteins = new Proteins();

    for (int i = 0; i< 50; i++ ) { // 1000000 = 4,72 secs
    	long r1 = random.nextInt(100000000);
    	long r2 = random.nextInt(100000000);
	    proteins.addAminoAcids(r1, "Asn", "Gly", "Met", "Sec", "Ser", "Val");
	    proteins.addAminoAcids(r2, "Asn", "Gly", "Met", "Sec", "Ser", "Val");
	    proteins.addAminoAcids(r2, "Ala", "Leu", "Tyr");
	    proteins.addAminoAcids(r2, "Gly", "Pyl", "Tyr");
    }
    


    assertFalse(proteins.containsAminoAcid(12345L, "Gly"));
    assertFalse(proteins.containsAminoAcid(12345L, "Sec"));
    proteins.addAminoAcids(12345L, "Asn", "Gly", "Met", "Sec", "Ser", "Val");
    assertTrue(proteins.containsAminoAcid(12345L, "Gly"));
    assertTrue(proteins.containsAminoAcid(12345L, "Sec"));
    assertTrue(proteins.containsAminoAcid(12345L, "Val"));
    assertFalse(proteins.containsAminoAcid(12345L, "Lys"));
    assertFalse(proteins.containsAminoAcid(12345L, "Trp"));

    assertFalse(proteins.containsAminoAcid(67890L, "Ala"));
    assertFalse(proteins.containsAminoAcid(67890L, "Pyl"));
    proteins.addAminoAcids(67890L, "Ala", "Leu", "Tyr");
    assertTrue(proteins.containsAminoAcid(67890L, "Ala"));
    assertTrue(proteins.containsAminoAcid(67890L, "Tyr"));
    assertFalse(proteins.containsAminoAcid(67890L, "Asn"));
    assertFalse(proteins.containsAminoAcid(67890L, "Pyl"));
    proteins.addAminoAcids(67890L, "Gly", "Pyl", "Tyr");
    assertTrue(proteins.containsAminoAcid(67890L, "Leu"));
    assertTrue(proteins.containsAminoAcid(67890L, "Pyl"));
    assertTrue(proteins.containsAminoAcid(67890L, "Tyr"));
    assertFalse(proteins.containsAminoAcid(67890L, "Asn"));
    assertFalse(proteins.containsAminoAcid(67890L, "Pro"));
  }
}

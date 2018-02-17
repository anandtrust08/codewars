package io.pello.codewars.proteintest;

import java.util.Hashtable;


public class Proteins {
	private Hashtable<Long, String> proteins = new Hashtable<Long, String>();

	public void addAminoAcids(long proteinId, String... aminoAcids) {
		String protein = (proteins.containsKey(proteinId)) ? proteins.get(proteinId) : "";
		int i = 0;
		while (protein.length() < 66 && i<aminoAcids.length) {
				if (protein.indexOf(aminoAcids[i]) == -1)
					protein += aminoAcids[i];
				i++;
		}
		proteins.put(proteinId, protein);
	}

	public boolean containsAminoAcid(long proteinId, String aminoAcid) {
		return proteins.containsKey(proteinId) 
				&& proteins.get(proteinId).indexOf(aminoAcid) != -1;
	}

}
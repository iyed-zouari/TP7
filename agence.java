package TP6_ex2;

public class agence {
	private Voiture [] voitures;
	private int nbrV=0; 
	public agence(Voiture[] v) {
		this.voitures =new Voiture[5];
	}
	public void afficheSelection(Critere c) {
		for (int i=0;i<voitures.length;i++) {
			if (c.estSatisfait(voitures[i]))
				System.out.println("les voitures satisfais est: "+voitures[i]);
		}
	}
	public void ajoutVoiture(Voiture v) {
		if (nbrV>5)
			System.out.println("le nombre le max");
		else {
			voitures[nbrV]=v;
			nbrV++;
			}
	}
	
}

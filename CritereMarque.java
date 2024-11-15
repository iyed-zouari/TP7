package TP6_ex2;

public class CritereMarque implements Critere {
	private String marque;
	public CritereMarque(String marque) {
		this.marque=marque;
	}

	@Override
	public boolean estSatisfait(Voiture v) {
		return v.getMarque().equalsIgnoreCase(marque);
	}

}

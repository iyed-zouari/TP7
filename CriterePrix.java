package TP6_ex2;

public class CriterePrix {
private int prix;
public CriterePrix(int prix) {
	this.prix=prix;
}
public boolean estSatisfait(Voiture v) {
	if (v.getPrix()<prix)
		return true;
	return false;
}
}

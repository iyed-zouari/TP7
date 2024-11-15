package TP6_ex2;

public class Voiture {
protected String marque;
protected String nom;
protected int annee;
protected int prix;
public Voiture(String m,String n,int a,int p) {
	this.annee=a;
	this.marque=m;
	this.nom=n;
	this.prix=p;
}
public String toString() {
	return ("le marque: "+marque+" le nom: "+nom+" le prix de loccation"+prix);
}
public String getMarque() {
	return this.marque;
}
public int getPrix() {
	return this.prix;
}
}

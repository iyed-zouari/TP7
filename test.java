package TP6_ex2;

public class test {

	public static void main(String[] args) {
		Voiture [] vs=new Voiture[5];
		vs[0] =new Voiture("BMW","E46",2012,70);
		vs[1]=new Voiture("KIA","RIO",2020,100);
		vs[2]=new Voiture("piggo","308",2011,60);
		vs[3]=new Voiture("AUDI","A4",2015,90);
		vs[4]=new Voiture("MARCIDES","A200",2022,160);
		agence a=new agence(vs);
		System.out.println("les voiture le prix <100");
		CriterePrix p=new CriterePrix(100);
		CritereMarque m=new CritereMarque("piggo");
		for (int i=0;i<vs.length;i++) {
			if(p.estSatisfait(vs[i]))
				System.out.println(vs[i]);
		}
		System.out.println("afficher les voiture a marque piggo");
		for (int i=0;i<vs.length;i++) {
			if(m.estSatisfait(vs[i]))
				System.out.println(vs[i]);
		}
	}

}

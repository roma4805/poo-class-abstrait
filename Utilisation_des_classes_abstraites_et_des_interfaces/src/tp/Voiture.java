package tp;

public class Voiture extends Vehicule implements Roulant{
	
	public Voiture(String nom, String typeCarburant) {
		super(nom,typeCarburant);
	}
	
	public void demarrer() {
		 System.out.println(nom + " démarre.");
		
	}
    public void arreter() {
        System.out.println(nom + " s'arrête.");
    }

    @Override
    public void rouler() {
        System.out.println(nom + " roule sur la route.");
    }

}

package tp;

public class Bateau  extends Vehicule implements Flottant{
	 public Bateau(String nom, String typeCarburant) {
	        super(nom, typeCarburant);
	    }

	    @Override
	    public void demarrer() {
	        System.out.println(nom + " démarre sur l'eau.");
	    }

	    @Override
	    public void arreter() {
	        System.out.println(nom + " s'arrête sur l'eau.");
	    }

	    @Override
	    public void flotter() {
	        System.out.println(nom + " flotte sur l'eau.");
	    }

}

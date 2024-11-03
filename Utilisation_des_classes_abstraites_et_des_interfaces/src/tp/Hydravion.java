package tp;

public class Hydravion extends Vehicule implements Volant, Flottant {
	 public Hydravion(String nom, String typeCarburant) {
	        super(nom, typeCarburant);
	    }

	    @Override
	    public void demarrer() {
	        System.out.println(nom + " démarre pour le décollage.");
	    }

	    @Override
	    public void arreter() {
	        System.out.println(nom + " s'arrête.");
	    }

	    @Override
	    public void voler() {
	        System.out.println(nom + " vole dans les airs.");
	    }

	    @Override
	    public void flotter() {
	        System.out.println(nom + " flotte sur l'eau.");
	    }

}

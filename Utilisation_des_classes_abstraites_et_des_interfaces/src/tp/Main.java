package tp;

public class Main {
	public static void main(String[] args) {
        // Créer un tableau de véhicules avec polymorphisme
        Vehicule[] vehicules = new Vehicule[3];
        vehicules[0] = new Voiture("Voiture", "Essence");
        vehicules[1] = new Bateau("Bateau", "Diesel");
        vehicules[2] = new Hydravion("Hydravion", "Kérosène");

        // Utiliser le polymorphisme pour appeler demarrer() et arreter() sur chaque véhicule
        for (Vehicule vehicule : vehicules) {
            vehicule.afficherInfos();
            vehicule.demarrer();
            vehicule.arreter();
            System.out.println();
        }

        // Utiliser le polymorphisme d'interface pour appeler les méthodes spécifiques
        for (Vehicule vehicule : vehicules) {
            if (vehicule instanceof Roulant) {
                ((Roulant) vehicule).rouler();
            }
            if (vehicule instanceof Flottant) {
                ((Flottant) vehicule).flotter();
            }
            if (vehicule instanceof Volant) {
                ((Volant) vehicule).voler();
            }
            System.out.println();
        }
    }

}

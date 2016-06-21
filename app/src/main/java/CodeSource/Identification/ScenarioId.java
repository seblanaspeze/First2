package CodeSource.Identification;

import java.util.ArrayList;

/**
 * Created by Lanas on 21/06/2016.
 */
public class ScenarioId {

    public static ArrayList<Utilisateur> scenario(){

        ArrayList<Utilisateur> liste = new ArrayList<Utilisateur>();

        Utilisateur nico = new Utilisateur("Nicolas", "nico", "profil_nico");
        Utilisateur lina = new Utilisateur("Lina", "lina", "profil_lina");
        Utilisateur seb = new Utilisateur("Sebastien", "seb", "profil_seb");

        liste.add(nico);
        liste.add(lina);
        liste.add(seb);

       return liste;
    }


}

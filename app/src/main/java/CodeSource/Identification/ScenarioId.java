package CodeSource.Identification;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by Lanas on 21/06/2016.
 */
public class ScenarioId {

    public static ArrayList<Utilisateur> scenario(){

        ArrayList<Utilisateur> liste = new ArrayList<Utilisateur>();
        String path = "C:/Users/Lanas/AndroidStudioProjects/First0.1/app/src/main/res/drawable-hdpi";

        String path1 = path + "profil_nico";
        String path2 = path + "photo_profil";
        String path3 = path + "profil_seb";


        Utilisateur nico = new Utilisateur("Nicolas", "nico", Drawable.createFromPath(path1) );
        Utilisateur lina = new Utilisateur("Lina", "lina", Drawable.createFromPath(path2));
        Utilisateur seb = new Utilisateur("Sebastien", "seb", Drawable.createFromPath(path3));

        liste.add(nico);
        liste.add(lina);
        liste.add(seb);

       return liste;
    }


}

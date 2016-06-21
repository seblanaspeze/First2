package CodeSource.Identification;

import java.util.ArrayList;

/**
 * Created by Lanas on 21/06/2016.
 */
public class listeUtilisateur{

    private ArrayList<Utilisateur> listeUtilisateur;

    public listeUtilisateur(){
        listeUtilisateur = new ArrayList<Utilisateur>();
    }

    public ArrayList<Utilisateur> getListeUtilisateur() {
        return listeUtilisateur;
    }

    public void setListeUtilisateur(ArrayList<Utilisateur> listeUtilisateur) {
        this.listeUtilisateur = listeUtilisateur;
    }

    public void add(Utilisateur utilisateur){
        listeUtilisateur.add(utilisateur);
    }
}

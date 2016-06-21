package CodeSource.Identification;

import android.graphics.drawable.Drawable;

/**
 * Created by Lanas on 21/06/2016.
 */
public class Utilisateur {

    private String id;
    private String password;
    private Drawable photo;

    public Utilisateur(String id, String password, Drawable photo){
        this.id = id;
        this.password = password;
        this.photo = photo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Drawable getPhoto() {
        return photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }
}

package CodeSource.Identification;

/**
 * Created by Lanas on 21/06/2016.
 */
public class Utilisateur {

    private String id;
    private String password;
    private String pathName;

    public Utilisateur(String id, String password, String pathName){
        this.id = id;
        this.password = password;
        this.pathName = pathName;
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

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }
}

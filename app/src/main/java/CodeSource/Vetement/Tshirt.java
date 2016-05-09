package CodeSource.Vetement;

/**
 * Created by Lanas on 09/05/2016.
 */
public class Tshirt extends Vetement {

    public Tshirt() {
        this.setType('T');
    }

    public Tshirt(String nom, String col1, String col2, String col3, boolean favori, String pathName) {
        super(nom, 'T', col1, col2, col3, favori, pathName);

    }

}

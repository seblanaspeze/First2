package com.example.lanas.first01;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.Hashtable;

import CodeSource.Identification.ScenarioId;
import CodeSource.Identification.Utilisateur;
import CodeSource.init.initLed;
import CodeSource.init.tabledeHashage;


public class MainActivity extends AppCompatActivity {

    // Ecran d'identification
    // Layout
    RelativeLayout ecranID;
    ImageButton facebook ;
    ImageButton twitter;
    ImageButton pinterest;
    ImageButton linkedin;
    ImageButton eclair;
    ImageButton photo;
    ImageButton fleche;
    EditText identifiant;
    EditText password;

    //Compteur
    int compteurF;
    int compteurT;
    int compteurP;
    int compteurL;

    ArrayList<Utilisateur> utilisateurs;

    int compteurPlus;
    //jhhhdzhzdhd

    // Ecran des t-shirt
    RelativeLayout iconeTri;
    ImageButton horloge;
    ImageButton etoile;
    ImageButton random;
    RelativeLayout layoutTri;
    ImageButton trie; boolean compteurTri;
    RelativeLayout bouton;
    ImageButton plus; boolean etatPlus;
    ImageButton validate;
    ImageButton power;
    RelativeLayout tShirt;
    ImageView tShirt1;
    ImageView tShirt2;
    ImageView tShirt3;
    ImageView tShirt4;

    // Menu plus

    RelativeLayout menuPlus;
    ImageButton dessiner;
    ImageButton store;
    ImageButton mesphoto;
    RelativeLayout tShirtPlus;

    //Ecran de dessin

    RelativeLayout tShirtDessin;
    RelativeLayout led;
    ArrayList<Integer> ledAllumer;
    Hashtable<Integer, Integer> table;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialisation de l'écran d'identificaiton

        ecranID = (RelativeLayout) findViewById(R.id.ecranid);
        facebook = (ImageButton) findViewById(R.id.facebook);
        twitter = (ImageButton) findViewById(R.id.twitter);
        pinterest = (ImageButton) findViewById(R.id.pinterest);
        linkedin = (ImageButton) findViewById(R.id.linkedin);
        eclair = (ImageButton) findViewById(R.id.eclair);
        photo = (ImageButton) findViewById(R.id.photo);
        fleche = (ImageButton) findViewById(R.id.fleche);
        identifiant = (EditText) findViewById(R.id.identifiant);
        password = (EditText) findViewById(R.id.password);

        compteurF = 0; compteurL = 0; compteurP = 0; compteurT = 0;

        utilisateurs  = ScenarioId.scenario();

        // Initialisation de l'ecran des t-shirt

        iconeTri = (RelativeLayout) findViewById(R.id.iconestri);
        horloge = (ImageButton) findViewById(R.id.horloge);
        etoile = (ImageButton) findViewById(R.id.etoile);
        random = (ImageButton) findViewById(R.id.random);
        layoutTri = (RelativeLayout) findViewById(R.id.layouttri);
        trie = (ImageButton) findViewById(R.id.tri);
        bouton = (RelativeLayout) findViewById(R.id.boutons); compteurTri = true;
        plus = (ImageButton) findViewById(R.id.plus); etatPlus = true;
        validate = (ImageButton) findViewById(R.id.validate);
        power = (ImageButton) findViewById(R.id.power);
        tShirt = (RelativeLayout) findViewById(R.id.tshirts);
        tShirt1 = (ImageView) findViewById(R.id.tshirt1);
        tShirt2 = (ImageView) findViewById(R.id.tshirt2);
        tShirt3 = (ImageView) findViewById(R.id.tshirt3);
        tShirt4 = (ImageView) findViewById(R.id.tshirt4);

        //Menu plus

        menuPlus = (RelativeLayout) findViewById(R.id.menuplus);
        dessiner = (ImageButton) findViewById(R.id.dessiner);
        store = (ImageButton) findViewById(R.id.store);
        mesphoto =(ImageButton) findViewById(R.id.mesphotos);
        tShirtPlus = (RelativeLayout) findViewById(R.id.tshirtplus);

        //Ecran de dessin

        tShirtDessin = (RelativeLayout) findViewById(R.id.tshirtdessin);
        led = (RelativeLayout) findViewById(R.id.leds);
        ledAllumer = initLed.initLED();
        table = tabledeHashage.table();

        // Initialisation

        ecranID.setVisibility(View.VISIBLE);
        iconeTri.setVisibility(View.INVISIBLE);
        layoutTri.setVisibility(View.INVISIBLE);
        bouton.setVisibility(View.INVISIBLE);
        menuPlus.setVisibility(View.INVISIBLE);
        tShirtPlus.setVisibility(View.INVISIBLE);
        tShirtDessin.setVisibility(View.INVISIBLE);
        led.setVisibility(View.INVISIBLE);
        tShirt.setVisibility(View.INVISIBLE);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void facebook(View v){

        if (compteurF == 0){
            facebook.setBackgroundResource(R.drawable.facebook);
            compteurF = 1;
        }
        else{
            facebook.setBackgroundResource(R.drawable.facebook40);
            compteurF = 0;
        }
    }

    public void twitter(View v){

        if (compteurF == 0){
            twitter.setBackgroundResource(R.drawable.twitter);
            compteurT = 1;
        }
        else{
            twitter.setBackgroundResource(R.drawable.twitter40);
            compteurT = 0;
        }
    }
    public void pinterest(View v){

        if (compteurP == 0){
            pinterest.setBackgroundResource(R.drawable.pinterest);
            compteurP = 1;
        }
        else{
            pinterest.setBackgroundResource(R.drawable.pinterest40);
            compteurP = 0;
        }
    }
    public void linkedin(View v){

        if (compteurL == 0){
            linkedin.setBackgroundResource(R.drawable.linkedin);
            compteurL = 1;
        }
        else{
            linkedin.setBackgroundResource(R.drawable.linkedin40);
            compteurL = 0;
        }
    }

    public void eclair(View v){

        facebook.setBackgroundResource(R.drawable.facebook);
        twitter.setBackgroundResource(R.drawable.twitter);
        pinterest.setBackgroundResource(R.drawable.pinterest);
        linkedin.setBackgroundResource(R.drawable.linkedin);

        compteurF = 1; compteurL = 1; compteurP = 1; compteurT = 1;
    }



    public void password(View v){

        String name = identifiant.getText().toString();
        int s = utilisateurs.size();
        int photo_profil = 0;

        for(int i = 0; i < s; i++){

            if (utilisateurs.get(i).getId().compareTo(name) == 0){
                photo_profil = utilisateurs.get(i).getPhoto();
            }

        }


        photo.setBackgroundResource(photo_profil);

    }

    public void fleche(View v){

        String name = identifiant.getText().toString();
        String pass = password.getText().toString();
        int s = utilisateurs.size();


        for(int i = 0; i < s; i++){

            if (utilisateurs.get(i).getId().compareTo(name) == 0){
                if (utilisateurs.get(i).getPassword().compareTo(pass) == 0){

                    ecranID.setVisibility(v.INVISIBLE);
                    layoutTri.setVisibility(v.VISIBLE);
                    bouton.setVisibility(v.VISIBLE);
                    tShirt.setVisibility(v.VISIBLE);

                }
                else{
                    identifiant.setText("identifiant invalide");
                }
            }

        }
    }
    public void tri (View v){

        if (compteurTri == true){
            iconeTri.setVisibility(v.VISIBLE);
            compteurTri = false;
        }
        else{
            iconeTri.setVisibility(v.INVISIBLE);
            compteurTri = true;
        }

    }

    public  void plus (View v){

        if (etatPlus == true){

            layoutTri.setVisibility(v.INVISIBLE);
            iconeTri.setVisibility(v.INVISIBLE);
            eclair.setVisibility(v.INVISIBLE);
            power.setVisibility(v.INVISIBLE);
            tShirtDessin.setVisibility(v.INVISIBLE);
            led.setVisibility(v.INVISIBLE);
            tShirt.setVisibility(v.INVISIBLE);

            menuPlus.setVisibility(v.VISIBLE);
            tShirtPlus.setVisibility(v.VISIBLE);
            plus.setBackgroundResource(R.drawable.annuler);
            etatPlus = false;
        }
        else{

            layoutTri.setVisibility(v.VISIBLE);
            eclair.setVisibility(v.VISIBLE);
            power.setVisibility(v.VISIBLE);
            tShirt.setVisibility(v.VISIBLE);

            menuPlus.setVisibility(v.INVISIBLE);
            tShirtPlus.setVisibility(v.INVISIBLE);
            iconeTri.setVisibility(v.INVISIBLE);
            tShirtDessin.setVisibility(v.INVISIBLE);
            led.setVisibility(v.INVISIBLE);
            plus.setBackgroundResource(R.drawable.plus);
            etatPlus = true;
        }


    }

    public void dessiner (View v){

        menuPlus.setVisibility(v.INVISIBLE);
        tShirtPlus.setVisibility(v.INVISIBLE);

        tShirtDessin.setVisibility(v.VISIBLE);
        led.setVisibility(v.VISIBLE);
    }



    public void led (View v){

    System.out.println("je rentre dans la méthode led");
    int test = v.getId();
    ;

        if (Build.VERSION.SDK_INT > 16){
            int ledd = v.getLabelFor();
            System.out.println(ledd);
            System.out.println(table.get(test));
            System.out.println(table.get(1));
            String etat = (String) v.getContentDescription();

            if (etat.compareTo("a") == 0){

                v.setContentDescription("e");
                v.setBackgroundResource(R.drawable.led1);
                ledAllumer.set(table.get(test),0);
            }
            else{

                v.setContentDescription("a");
                v.setBackgroundResource(R.drawable.ledactive);
                ledAllumer.set(table.get(test),1);
            }
        }
        else{
            System.out.println("je ne peux pas utiliser labelfor");
        }


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings1) {
            return true;
        }
        if (id == R.id.action_settings2) {
            return true;
        }
        if (id == R.id.action_settings3) {
            return true;
        }
        if (id == R.id.action_settings4) {
            return true;
        }
        if (id == R.id.action_settings5) {
            return true;
        }
        if (id == R.id.action_settings6) {
            return true;
        }
        if (id == R.id.action_settings7) {

            ecranID.setVisibility(View.VISIBLE);
            password.setText("");
            identifiant.setText("Name");

            iconeTri.setVisibility(View.INVISIBLE);
            layoutTri.setVisibility(View.INVISIBLE);
            bouton.setVisibility(View.INVISIBLE);
            menuPlus.setVisibility(View.INVISIBLE);
            tShirtPlus.setVisibility(View.INVISIBLE);
            tShirtDessin.setVisibility(View.INVISIBLE);
            led.setVisibility(View.INVISIBLE);
            tShirt.setVisibility(View.INVISIBLE);

        }


        return super.onOptionsItemSelected(item);
    }
}

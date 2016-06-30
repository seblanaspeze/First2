package com.example.lanas.first01;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
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

import CodeSource.Identification.ScenarioId;
import CodeSource.Identification.Utilisateur;


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
    ImageButton plus;
    ImageButton validate;
    ImageButton power;
    RelativeLayout tShirt;
    ImageView tShirt1;
    ImageView tShirt2;
    ImageView tShirt3;
    ImageView tShirt4;


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
        plus = (ImageButton) findViewById(R.id.plus);
        validate = (ImageButton) findViewById(R.id.validate);
        power = (ImageButton) findViewById(R.id.power);
        tShirt = (RelativeLayout) findViewById(R.id.tshirts);
        tShirt1 = (ImageView) findViewById(R.id.tshirt1);
        tShirt2 = (ImageView) findViewById(R.id.tshirt2);
        tShirt3 = (ImageView) findViewById(R.id.tshirt3);
        tShirt4 = (ImageView) findViewById(R.id.tshirt4);
        

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
            linkedin.setBackgroundResource(R.drawable.linkedin);
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


    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public void password(View v){

        String name = identifiant.getText().toString();
        int s = utilisateurs.size();
        Drawable photo_profil = null;

        for(int i = 0; i < s; i++){

            if (utilisateurs.get(i).getId().compareTo(name) == 0){
                photo_profil = utilisateurs.get(i).getPhoto();
            }

        }


        photo.setBackground(photo_profil);

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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

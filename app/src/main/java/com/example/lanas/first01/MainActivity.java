package com.example.lanas.first01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    // Ecran d'identification
    // Layout
    RelativeLayout ecranID;
    ImageButton facebook ;
    ImageButton twitter;
    ImageButton pinterest;
    ImageButton linkedin;
    ImageButton eclair;
    EditText identifiant;
    EditText password;

    //Compteur
    int compteurF;
    int compteurT;
    int compteurP;
    int compteurL;


    //jhhhdzhzdhd

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ecranID = (RelativeLayout) findViewById(R.id.ecranID);
        facebook = (ImageButton) findViewById(R.id.facebook);
        twitter = (ImageButton) findViewById(R.id.twitter);
        pinterest = (ImageButton) findViewById(R.id.pinterest);
        linkedin = (ImageButton) findViewById(R.id.linkedin);
        eclair = (ImageButton) findViewById(R.id.eclair);
        identifiant = (EditText) findViewById(R.id.identifiant);
        password = (EditText) findViewById(R.id.password);

        compteurF = 0; compteurL = 0; compteurP = 0; compteurT = 0;
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

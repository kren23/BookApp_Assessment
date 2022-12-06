package rgu.appdev.bookapp_assessment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class loadingScreen extends AppCompatActivity {

    //Some small java code to launch the loading screen before loading the app
    //Not required at all but looks pretty
    //For this to load first manifest MUST be changed to load this before main activity

    //TODO Loading screen still shows Android loading screen. Investigate if it can be removed?

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        //Hide the top bar while it shows
        getSupportActionBar().hide();

        //Making the app load the loading screen & then the main activity after

        final Intent i = new Intent(loadingScreen.this, MainActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                startActivity(i);
                finish();
            }
        }, 2000); //Delays the app for 2 seconds showing loading screen
    }
}
package jerika.com.sacbookstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {
    long Delay = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        TextView tv = (TextView) findViewById(R.id.splash_title);
        tv.startAnimation(AnimationUtils.loadAnimation(splash.this, R.anim.bounce));

        Timer RunSplash = new Timer();

        // Task to do when the timer ends
        TimerTask ShowSplash = new TimerTask() {
            @Override
            public void run() {
                // Close SplashScreenActivity.class
                // Start MainActivity.class
                Intent myIntent = new Intent(splash.this,MainActivity.class);

                startActivity(myIntent);

            }
        };
        TimerTask finiish= new TimerTask() {

            @Override
            public void run() {

                finish();


            }
        };

        // Start the timer
        RunSplash.schedule(ShowSplash, Delay);
        Timer fin = new Timer();
        fin.schedule(finiish,Delay);
    }
}

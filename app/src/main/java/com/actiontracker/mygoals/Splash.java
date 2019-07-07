package com.actiontracker.mygoals;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

    private Thread splashThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        StartSplash();
    }

    // Showing splash scrren of Tire Rack with animation
    private void StartSplash() {

        splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 3500) {
                        sleep(100);
                        waited += 100;
                    }
                    Intent intent = new Intent(Splash.this,
                            DetailsScreen.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    finish();
                }
            }
        };
        splashThread.start();
    }
}
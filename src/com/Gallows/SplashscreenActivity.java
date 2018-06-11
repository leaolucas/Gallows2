package com.Gallows;

import com.Gallows.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashscreenActivity extends Activity implements Runnable {

    private final int DELAY = 5000;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Handler handler = new Handler();
        handler.postDelayed(this, DELAY);
    }

    public void run() {
        Intent i = new Intent(SplashscreenActivity.this, MainActivity.class);
        startActivity(i);
        SplashscreenActivity.this.finish();
    }
}
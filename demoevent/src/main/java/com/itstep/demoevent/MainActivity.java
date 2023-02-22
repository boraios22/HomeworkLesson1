package com.itstep.demoevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonClick = findViewById(R.id.buttonClickMe);

        LinearLayout mainLayout = findViewById(R.id.mainLayout);

        mainLayout.setOnTouchListener(new View.OnTouchListener() {
            private static final String TAG = "MainActivity";

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    Log.d(TAG, "onTouch: x = " + motionEvent.getX());
                    Log.d(TAG, "onTouch: y = " + motionEvent.getY());
                }
                return true;
            }
        });


//        buttonClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        buttonClick.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Click me executed", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}
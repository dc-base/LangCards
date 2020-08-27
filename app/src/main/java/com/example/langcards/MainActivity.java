package com.example.langcards;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.os.Build;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        enter_set_activity();

    }
    //Enters SetsView after 2 second delay
    public void enter_set_activity(){

        //TimerTask waiting delay before entering Activity
        new Timer().schedule(new TimerTask(){
            public void run() {
                Intent intent = new Intent(MainActivity.this, SetsView.class);
                startActivity(intent);
                finish();
            }
        }, 2000 );
        //Use of animation start for API 21+. Checks for animation end before entering activity
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            System.out.println("Entered Transition");
//            startActivity(intent,
//                    ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
//        } else {
//            startActivity(intent);
//        }

    }
}
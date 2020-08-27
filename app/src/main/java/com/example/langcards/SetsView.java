package com.example.langcards;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.view.View;

import java.util.ArrayList;

public class SetsView extends AppCompatActivity {

    private FloatingActionButton newSet;
    private ArrayList<oneset> cardSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sets_view);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setsScreen();
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
    }

    public void setsScreen(){
        SetDialog diag = new SetDialog();
        diag.show(getSupportFragmentManager(), "Create Set");



        //Button test to set a color
        CoordinatorLayout layout = (CoordinatorLayout) findViewById(R.id.sets_view_background);
        layout.setBackgroundColor(Color.parseColor("#8e44ad"));
    }
}
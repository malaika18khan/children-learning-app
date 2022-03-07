package com.classprojects.childrenlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import colors.Intro_Colors;
import english_letters.Intro_Eng;
import numbers_pack.Intro_Numbers;
import shapes.Intro_Shape;
import urdu_letters.Intro_Urdu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView eng_menu_btn = findViewById(R.id.english_balloon);
        eng_menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eng_menu = new Intent(getApplicationContext(), Intro_Eng.class);
                startActivity(eng_menu);
            }
        });

        ImageView urdu_menu_btn = findViewById(R.id.urdu_balloon);
        urdu_menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urdu_menu = new Intent(getApplicationContext(), Intro_Urdu.class);
                startActivity(urdu_menu);
            }
        });

        ImageView col_menu_btn = findViewById(R.id.color_balloon);
        col_menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent col_menu = new Intent(getApplicationContext(), Intro_Colors.class);
                startActivity(col_menu);
            }
        });

        ImageView numb_menu_btn = findViewById(R.id.balloon_number);
        numb_menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numb_menu = new Intent(getApplicationContext(), Intro_Numbers.class);
                startActivity(numb_menu);
            }
        });

        ImageView shape_menu_btn = findViewById(R.id.shapes_balloon);
        shape_menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shap_menu = new Intent(getApplicationContext(), Intro_Shape.class);
                startActivity(shap_menu);
            }
        });


    }
}
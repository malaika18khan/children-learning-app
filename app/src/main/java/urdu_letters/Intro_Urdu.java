package urdu_letters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.classprojects.childrenlearningapp.MainActivity;
import com.classprojects.childrenlearningapp.R;

import english_letters.Intro_Eng;
import english_letters.MainEng;

public class Intro_Urdu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_urdu);

        Button next = findViewById(R.id.start_btn);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main_int = new Intent(Intro_Urdu.this, MainUrdu.class);
                startActivity(main_int);
            }
        });

        Button back = findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_int = new Intent(Intro_Urdu.this, MainActivity.class);
                startActivity(back_int);
            }
        });
    }
}
package english_letters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.classprojects.childrenlearningapp.MainActivity;
import com.classprojects.childrenlearningapp.R;

public class Intro_Eng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_eng);

        Button next = findViewById(R.id.start_btn);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main_int = new Intent(Intro_Eng.this, MainEng.class);
                startActivity(main_int);
            }
        });

        Button back = findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_int = new Intent(Intro_Eng.this, MainActivity.class);
                startActivity(back_int);
            }
        });

    }
}
package colors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.classprojects.childrenlearningapp.MainActivity;
import com.classprojects.childrenlearningapp.R;

import shapes.Intro_Shape;

public class Intro_Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_colors);

        Button next = findViewById(R.id.start_btn);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main_int = new Intent(Intro_Colors.this, MainColors.class);
                startActivity(main_int);
            }
        });

        Button back = findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_int = new Intent(Intro_Colors.this, MainActivity.class);
                startActivity(back_int);
            }
        });
    }
}
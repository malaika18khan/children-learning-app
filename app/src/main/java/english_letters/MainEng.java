package english_letters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.classprojects.childrenlearningapp.R;

public class MainEng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_eng);

        FragmentManager fragmang = getSupportFragmentManager();

        TextView letter_a = findViewById(R.id.btn_a);
        letter_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmang.beginTransaction().replace(R.id.fragmentContainerView, LetterA.class, null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });

        TextView letter_b = findViewById(R.id.btn_b);
        letter_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmang.beginTransaction().replace(R.id.fragmentContainerView, LetterB.class, null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
    }
}
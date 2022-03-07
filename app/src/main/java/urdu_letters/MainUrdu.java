package urdu_letters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.classprojects.childrenlearningapp.R;

import english_letters.LetterA;
import english_letters.LetterB;

public class MainUrdu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_urdu);

        FragmentManager fragmang = getSupportFragmentManager();

        TextView letter_alif = findViewById(R.id.btn_alif);
        letter_alif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmang.beginTransaction().replace(R.id.fragmentContainerView, alifLetter.class, null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });

        TextView letter_bay = findViewById(R.id.btn_bay);
        letter_bay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmang.beginTransaction().replace(R.id.fragmentContainerView, beyLetter.class, null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
    }
}
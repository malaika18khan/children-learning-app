package numbers_pack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.classprojects.childrenlearningapp.R;

import english_letters.LetterA;
import english_letters.LetterB;

public class MainNumbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_numbers);

        FragmentManager fragmang = getSupportFragmentManager();

        TextView number_one = findViewById(R.id.btn_one);
        number_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmang.beginTransaction().replace(R.id.fragmentContainerView, NumberOne.class, null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });

        TextView number_two = findViewById(R.id.btn_two);
        number_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmang.beginTransaction().replace(R.id.fragmentContainerView, NumberTwo.class, null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
    }
}
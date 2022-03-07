package colors;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.classprojects.childrenlearningapp.R;

import numbers_pack.NumberOne;
import numbers_pack.NumberTwo;

public class MainColors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_colors);

        FragmentManager fragmang = getSupportFragmentManager();

        TextView color_pink = findViewById(R.id.btn_pink);
        color_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmang.beginTransaction().replace(R.id.fragmentContainerView, ColorPink.class, null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });

        TextView color_violet = findViewById(R.id.btn_violet);
        color_violet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmang.beginTransaction().replace(R.id.fragmentContainerView, ColorViolet.class, null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
    }
}
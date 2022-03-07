package shapes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.classprojects.childrenlearningapp.R;

import numbers_pack.NumberOne;
import numbers_pack.NumberTwo;

public class MainShapes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_shapes);

        FragmentManager fragmang = getSupportFragmentManager();

        TextView shape_circle = findViewById(R.id.btn_circle);
        shape_circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmang.beginTransaction().replace(R.id.fragmentContainerView, ShapeCircle.class, null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });

        TextView shape_square = findViewById(R.id.btn_square);
        shape_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmang.beginTransaction().replace(R.id.fragmentContainerView, ShapeSquare.class, null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
    }
}
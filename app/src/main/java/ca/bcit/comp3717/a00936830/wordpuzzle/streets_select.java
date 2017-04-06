package ca.bcit.comp3717.a00936830.wordpuzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class streets_select extends AppCompatActivity {
    Button level1, level2, level3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks_select);

        level1 =(Button)findViewById(R.id.level1);
        level2 = (Button)findViewById(R.id.level2);
        level3 = (Button)findViewById(R.id.level3);

        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(streets_select.this, parks_level1.class);
                startActivity(intent1);
                finish();
            }
        });

        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(streets_select.this, parks_level2.class);
                startActivity(intent1);
                finish();
            }
        });

        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(streets_select.this, parks_level3.class);
                startActivity(intent1);
                finish();
            }
        });
    }


}

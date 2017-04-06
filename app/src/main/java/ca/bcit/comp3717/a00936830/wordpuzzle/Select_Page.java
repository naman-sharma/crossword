package ca.bcit.comp3717.a00936830.wordpuzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class Select_Page extends AppCompatActivity {
    Button street_btn;
    Button art_btn;
    Button park_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__page);
        street_btn=(Button)findViewById(R.id.street);
        street_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent1 = new Intent(Select_Page.this, streets_select.class);
                startActivity(intent1);
                finish();
            }
        });

        art_btn=(Button)findViewById(R.id.art);
        art_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent1 = new Intent(Select_Page.this, publicart_select.class);
                startActivity(intent1);
                finish();
            }
        });

        park_btn=(Button)findViewById(R.id.park);
        park_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent1 = new Intent(Select_Page.this, parks_select.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}

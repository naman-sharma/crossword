package ca.bcit.comp3717.a00936830.wordpuzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Failure extends AppCompatActivity {
    Button retry;
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_failure);
        retry = (Button) findViewById(R.id.retry);
        home = (Button) findViewById(R.id.home);
       retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Failure.this, parks_level1.class);
                startActivity(intent);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Failure.this, StartPage.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

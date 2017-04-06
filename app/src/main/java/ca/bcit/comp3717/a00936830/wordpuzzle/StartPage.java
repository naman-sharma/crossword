package ca.bcit.comp3717.a00936830.wordpuzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartPage extends AppCompatActivity {
    Button start_btn;
    Button test_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        start_btn=(Button)findViewById(R.id.button2);
        test_btn=(Button)findViewById(R.id.test_btn);

        start_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(StartPage.this, Select_Page.class);
                startActivity(intent);

            }
        });

        test_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(StartPage.this, ABOUT.class);
                startActivity(intent);

            }
        });
    }
}

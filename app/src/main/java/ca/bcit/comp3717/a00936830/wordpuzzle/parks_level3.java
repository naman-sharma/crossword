package ca.bcit.comp3717.a00936830.wordpuzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class parks_level3 extends AppCompatActivity {
    Button done13;
    EditText W_waterfront;
    EditText A_waterfront;
    EditText T1_waterfront;
    EditText E_waterfront;
    EditText R1_waterfront;
    EditText F_waterfront;
    EditText R2_waterfront;
    TextView O_waterfront;
    TextView N_waterfront;
    EditText T2_waterfront;

    EditText V_victoria;
    TextView I1_victoria;
    EditText C_victoria;
    EditText T_victoria;
    TextView O_victoria;
    EditText R_victoria;
    EditText I2_victoria;
    TextView A_victoria;

    EditText C_clinton;
    EditText L_clinton;
    TextView I_clinton;
    EditText N1_clinton;
    EditText T_clinton;
    EditText O_clinton;
    EditText N2_clinton;

    EditText C_cityhall;
    EditText I_cityhall;
    EditText T_cityhall;
    EditText Y_cityhall;
    EditText H_cityhall;
    TextView A_cityhall;
    EditText L1_cityhall;
    EditText L2_cityhall;

    boolean cityhall = false, waterfall = false, clinton = false, victoria = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks_3);
        done13=(Button)findViewById(R.id.done11);
        W_waterfront = (EditText)findViewById(R.id.W_waterfront);
        A_waterfront= (EditText)findViewById(R.id.A_waterfront);
        T1_waterfront= (EditText)findViewById(R.id.T1_waterfront);
        E_waterfront= (EditText)findViewById(R.id.E_waterfront);
        R1_waterfront= (EditText)findViewById(R.id.R1_waterfront);
        F_waterfront= (EditText)findViewById(R.id.F_waterfront);
        R2_waterfront= (EditText)findViewById(R.id.R2_waterfront);
        O_waterfront= (TextView)findViewById(R.id.O_waterfront);
        N_waterfront= (EditText)findViewById(R.id.N_waterfront);
        T2_waterfront= (EditText)findViewById(R.id.T2_waterfront);

        V_victoria= (EditText)findViewById(R.id.V_victoria);
        I1_victoria= (TextView)findViewById(R.id.I1_victoria);
        C_victoria= (EditText)findViewById(R.id.C_victoria);
        T_victoria= (EditText)findViewById(R.id.T_victoria);
        O_victoria= (TextView) findViewById(R.id.O_victoria);
        R_victoria= (EditText)findViewById(R.id.R_victoria);
        I2_victoria= (EditText)findViewById(R.id.I2_victoria);
        A_victoria= (TextView) findViewById(R.id.A_victoria);

        C_clinton= (EditText)findViewById(R.id.C_clinton);
        L_clinton= (EditText)findViewById(R.id.L_clinton);
        I_clinton= (TextView) findViewById(R.id.I_clinton);
        N1_clinton= (EditText)findViewById(R.id.N1_clinton);
        T_clinton= (EditText)findViewById(R.id.T_clinton);
        O_clinton= (EditText)findViewById(R.id.O_clinton);
        N2_clinton= (EditText)findViewById(R.id.N2_clinton);

        C_cityhall= (EditText)findViewById(R.id.C_cityhall);
        I_cityhall= (EditText)findViewById(R.id.I_cityhall);
        T_cityhall= (EditText)findViewById(R.id.T_cityhall);
        Y_cityhall= (EditText)findViewById(R.id.Y_cityhall);
        H_cityhall= (EditText)findViewById(R.id.H_cityhall);
        A_cityhall= (TextView)findViewById(R.id.A_cityhall);
        L1_cityhall= (EditText)findViewById(R.id.L1_cityhall);
        L2_cityhall= (EditText)findViewById(R.id.L2_cityhall);

        W_waterfront.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A part of town that borders a body of water", Toast.LENGTH_SHORT).show();
            }
        });
        A_waterfront.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A part of town that borders a body of water", Toast.LENGTH_SHORT).show();
            }
        });
        T1_waterfront.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A part of town that borders a body of water", Toast.LENGTH_SHORT).show();
            }
        });
        E_waterfront.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A part of town that borders a body of water", Toast.LENGTH_SHORT).show();
            }
        });
        R1_waterfront.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A part of town that borders a body of water", Toast.LENGTH_SHORT).show();
            }
        });
        F_waterfront.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A part of town that borders a body of water", Toast.LENGTH_SHORT).show();
            }
        });
        R2_waterfront.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A part of town that borders a body of water", Toast.LENGTH_SHORT).show();
            }
        });
        O_waterfront.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A part of town that borders a body of water", Toast.LENGTH_SHORT).show();
            }
        });
        N_waterfront.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A part of town that borders a body of water", Toast.LENGTH_SHORT).show();
            }
        });
        T2_waterfront.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A part of town that borders a body of water", Toast.LENGTH_SHORT).show();
            }
        });

        V_victoria.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Name of an island along BC's coast", Toast.LENGTH_SHORT).show();
            }
        });
        I1_victoria.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Name of an island along BC's coast", Toast.LENGTH_SHORT).show();
            }
        });
        C_victoria.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Name of an island along BC's coast", Toast.LENGTH_SHORT).show();
            }
        });
        T_victoria.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Name of an island along BC's coast", Toast.LENGTH_SHORT).show();
            }
        });
        O_victoria.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Name of an island along BC's coast", Toast.LENGTH_SHORT).show();
            }
        });
        R_victoria.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Name of an island along BC's coast", Toast.LENGTH_SHORT).show();
            }
        });
        I2_victoria.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Name of an island along BC's coast", Toast.LENGTH_SHORT).show();
            }
        });
        A_victoria.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Name of an island along BC's coast", Toast.LENGTH_SHORT).show();
            }
        });

        C_clinton.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Name of a recent former president of the USA", Toast.LENGTH_SHORT).show();
            }
        });
        L_clinton.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Name of a recent former president of the USA", Toast.LENGTH_SHORT).show();
            }
        });
        I_clinton.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Name of a recent former president of the USA", Toast.LENGTH_SHORT).show();
            }
        });
        N1_clinton.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Name of a recent former president of the USA", Toast.LENGTH_SHORT).show();
            }
        });
        T_clinton.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Name of a recent former president of the USA", Toast.LENGTH_SHORT).show();
            }
        });
        O_clinton.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Name of a recent former president of the USA", Toast.LENGTH_SHORT).show();
            }
        });
        N2_clinton.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Name of a recent former president of the USA", Toast.LENGTH_SHORT).show();
            }
        });

        C_cityhall.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: The administration building of a municipality", Toast.LENGTH_SHORT).show();
            }
        });
        I_cityhall.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: The administration building of a municipality", Toast.LENGTH_SHORT).show();
            }
        });
        T_cityhall.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: The administration building of a municipality", Toast.LENGTH_SHORT).show();
            }
        });
        Y_cityhall.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: The administration building of a municipality", Toast.LENGTH_SHORT).show();
            }
        });
        H_cityhall.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: The administration building of a municipality", Toast.LENGTH_SHORT).show();
            }
        });
        A_cityhall.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: The administration building of a municipality", Toast.LENGTH_SHORT).show();
            }
        });
        L1_cityhall.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: The administration building of a municipality", Toast.LENGTH_SHORT).show();
            }
        });
        L2_cityhall.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: The administration building of a municipality", Toast.LENGTH_SHORT).show();
            }
        });


        done13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(parks_level3.this,Select_Page.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

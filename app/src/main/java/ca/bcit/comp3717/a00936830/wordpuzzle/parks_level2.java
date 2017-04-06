package ca.bcit.comp3717.a00936830.wordpuzzle;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class parks_level2 extends AppCompatActivity {
    Button done11;
    EditText R_redboat;
    EditText E_redboat;
    EditText D_redboat;
    EditText B_redboat;
    TextView O_redboat;
    EditText A_redboat;
    EditText T_redboat;

    EditText C_community;
    TextView O_community ;
    EditText M1_community;
    EditText M2_community;
    EditText U_community;
    EditText N_community;
    TextView I_community;
    EditText T_community;
    EditText Y_community;

    EditText G_gateway;
    EditText A1_gateway;
    EditText T_gateway;
    TextView E_gateway;
    EditText W_gateway;
    EditText A2_gateway;
    EditText Y_gateway;

    EditText R1_riverside;
    EditText I1_riverside;
    EditText V_riverside;
    TextView E1_riverside;
    EditText R2_riverside;
    EditText S_riverside;
    TextView I2_riverside;
    EditText D_riverside;
    EditText E2_riverside;


    boolean redboat = false, community = false, riverside = false, gateway = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks_2);
        done11=(Button)findViewById(R.id.done11);
        R_redboat = (EditText)findViewById(R.id.R_redboat);
        E_redboat = (EditText)findViewById(R.id.E_redboat);
        D_redboat= (EditText)findViewById(R.id.D_redboat);
        B_redboat = (EditText)findViewById(R.id.B_redboat);
        O_redboat = (TextView) findViewById(R.id.O_redboat);
        A_redboat =  (EditText)findViewById(R.id.A_redboat);
        T_redboat =  (EditText)findViewById(R.id.T_redboat);

        C_community = (EditText)findViewById(R.id.C_community);
        O_community = (TextView)findViewById(R.id.O_community);
        M1_community = (EditText)findViewById(R.id.M1_community);
        M2_community = (EditText)findViewById(R.id.M2_community);
        U_community= (EditText)findViewById(R.id.U_community);
        N_community= (EditText)findViewById(R.id.N_community);
        I_community= (TextView)findViewById(R.id.I_community);
        T_community= (EditText)findViewById(R.id.T1_community);
        Y_community= (EditText)findViewById(R.id.Y_community);

        G_gateway= (EditText)findViewById(R.id.G_gateway);
        A1_gateway= (EditText)findViewById(R.id.A1_gateway);
        T_gateway= (EditText)findViewById(R.id.T_gateway);
        E_gateway = (TextView)findViewById(R.id.E_gateway);
        W_gateway= (EditText)findViewById(R.id.W_gateway);
        A2_gateway = (EditText)findViewById(R.id.A2_gateway);
        Y_gateway = (EditText)findViewById(R.id.Y_gateway);

        R1_riverside = (EditText)findViewById(R.id.R1_riverside);
        I1_riverside = (EditText)findViewById(R.id.I1_riverside);
        V_riverside = (EditText)findViewById(R.id.V_riverside);
        E1_riverside = (TextView)findViewById(R.id.E1_riverside);
        R2_riverside= (EditText)findViewById(R.id.R2_riverside);
        S_riverside = (EditText)findViewById(R.id.S_riverside);
        I2_riverside= (TextView)findViewById(R.id.I2_riverside);
        D_riverside = (EditText)findViewById(R.id.D_riverside);
        E2_riverside= (EditText)findViewById(R.id.E2_riverside);



        R_redboat.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Small vessel propelled on water(of a crimson hue)", Toast.LENGTH_SHORT).show();
            }
        });
        E_redboat.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Small vessel propelled on water(of a crimson hue)", Toast.LENGTH_SHORT).show();
            }
        });
        D_redboat.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Small vessel propelled on water(of a crimson hue)", Toast.LENGTH_SHORT).show();
            }
        });
        B_redboat.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Small vessel propelled on water(of a crimson hue)", Toast.LENGTH_SHORT).show();
            }
        });
        O_redboat.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Small vessel propelled on water(of a crimson hue)", Toast.LENGTH_SHORT).show();
            }
        });
        A_redboat.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Small vessel propelled on water(of a crimson hue)", Toast.LENGTH_SHORT).show();
            }
        });
        T_redboat.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Small vessel propelled on water(of a crimson hue)", Toast.LENGTH_SHORT).show();
            }
        });

        C_community.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: a group of people living in the same place", Toast.LENGTH_SHORT).show();
            }
        });
        O_community.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: a group of people living in the same place", Toast.LENGTH_SHORT).show();
            }
        });
        M1_community.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: a group of people living in the same place", Toast.LENGTH_SHORT).show();
            }
        });
        M2_community.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: a group of people living in the same place", Toast.LENGTH_SHORT).show();
            }
        });
        U_community.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: a group of people living in the same place", Toast.LENGTH_SHORT).show();
            }
        });
        N_community.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: a group of people living in the same place", Toast.LENGTH_SHORT).show();
            }
        });
        I_community.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: a group of people living in the same place", Toast.LENGTH_SHORT).show();
            }
        });
        T_community.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: a group of people living in the same place", Toast.LENGTH_SHORT).show();
            }
        });
        Y_community.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: a group of people living in the same place", Toast.LENGTH_SHORT).show();
            }
        });

        G_gateway.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A means of access or entry to a place", Toast.LENGTH_SHORT).show();
            }
        });
        A1_gateway.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A means of access or entry to a place", Toast.LENGTH_SHORT).show();
            }
        });
        T_gateway.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A means of access or entry to a place", Toast.LENGTH_SHORT).show();
            }
        });
        E_gateway.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A means of access or entry to a place", Toast.LENGTH_SHORT).show();
            }
        });
        W_gateway.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A means of access or entry to a place", Toast.LENGTH_SHORT).show();
            }
        });
        A2_gateway.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A means of access or entry to a place", Toast.LENGTH_SHORT).show();
            }
        });
        Y_gateway.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: A means of access or entry to a place", Toast.LENGTH_SHORT).show();
            }
        });

        R1_riverside.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: The ground along a riverbank", Toast.LENGTH_SHORT).show();
            }
        });
        I1_riverside.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: The ground along a riverbank", Toast.LENGTH_SHORT).show();
            }
        });
        V_riverside.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: The ground along a riverbank", Toast.LENGTH_SHORT).show();
            }
        });
        E1_riverside.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: The ground along a riverbank", Toast.LENGTH_SHORT).show();
            }
        });
        R2_riverside.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: The ground along a riverbank", Toast.LENGTH_SHORT).show();
            }
        });
        S_riverside.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(), "Hint: The ground along a riverbank", Toast.LENGTH_SHORT).show();
            }
        });
        I2_riverside.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: The ground along a riverbank", Toast.LENGTH_SHORT).show();
            }
        });
        D_riverside.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: The ground along a riverbank", Toast.LENGTH_SHORT).show();
            }
        });
        E2_riverside.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: The ground along a riverbank", Toast.LENGTH_SHORT).show();
            }
        });


        done11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if((R_redboat.getText().toString().matches("R"))
                        && (E_redboat.getText().toString().matches("E"))
                        && (D_redboat.getText().toString().matches("D"))
                        && (B_redboat.getText().toString().matches("B"))
                        && (O_redboat.getText().toString().matches("O"))
                        && (A_redboat.getText().toString().matches("A"))
                        && (T_redboat.getText().toString().matches("T")))
                  redboat = true;

              if((C_community.getText().toString().matches("C"))
                        && (O_community.getText().toString().matches("O"))
                        && (M1_community.getText().toString().matches("M"))
                        && (M2_community.getText().toString().matches("M"))
                        && (U_community.getText().toString().matches("U"))
                        && (N_community.getText().toString().matches("N"))
                        && (I_community.getText().toString().matches("I"))
                        && (T_community.getText().toString().matches("T"))
                        && (Y_community.getText().toString().matches("Y")))
                  community = true;

              if((G_gateway.getText().toString().matches("G"))
                        && (A1_gateway.getText().toString().matches("A"))
                        && (T_gateway.getText().toString().matches("T"))
                        && (E_gateway.getText().toString().matches("E"))
                        && (W_gateway.getText().toString().matches("W"))
                        && (A2_gateway.getText().toString().matches("A"))
                        && (Y_gateway.getText().toString().matches("Y")))
                  gateway = true;

              if((R1_riverside.getText().toString().matches("R"))
                        && (I1_riverside.getText().toString().matches("I"))
                        && (V_riverside.getText().toString().matches("V"))
                        && (E1_riverside.getText().toString().matches("E"))
                        && (R2_riverside.getText().toString().matches("R"))
                        && (S_riverside.getText().toString().matches("S"))
                        && (I2_riverside.getText().toString().matches("I"))
                        && (D_riverside.getText().toString().matches("D"))
                        && (E2_riverside.getText().toString().matches("E")))
                  riverside = true;


                if(riverside == true && redboat == true && gateway == true && community == true ){
                    Intent intent = new Intent(parks_level2.this,Success.class);
                    startActivity(intent);
                    finish();
                }else {
                    Intent intent2 = new Intent(parks_level2.this, Failure.class);
                    startActivity(intent2);
                    finish();

                }
            }
        });
    }
}

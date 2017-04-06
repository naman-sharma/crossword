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


public class parks_level1 extends AppCompatActivity {
    Button done11;
    EditText P_pier;
    EditText I_pier;
    EditText E_pier;
    TextView R_pier;

    EditText Q_queen;
    EditText U_queen;
    TextView E1_queen;
    EditText E2_queen;
    EditText N_queen;

    EditText S1_sunset;
    EditText U_sunset;
    TextView N_sunset;
    EditText S2_sunset;
    TextView E_sunset;
    EditText T_sunset;

    EditText T1_toronto;
    EditText O1_toronto;
    TextView R_toronto;
    EditText O2_toronto;
    TextView N_toronto;
    EditText T2_toronto;
    EditText O3_toronto;

    boolean pier = false, queen = false, sunset = false, toronto = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks_1);
        done11=(Button)findViewById(R.id.done11);

        P_pier=(EditText)findViewById(R.id.P_pier);
        I_pier=(EditText)findViewById(R.id.I_pier);
        E_pier=(EditText)findViewById(R.id.E_pier);
        R_pier=(TextView)findViewById(R.id.R_pier);

        Q_queen=(EditText)findViewById(R.id.Q_queen);
        U_queen=(EditText)findViewById(R.id.U_queen);
        E1_queen=(TextView)findViewById(R.id.E1_queen);
        E2_queen=(EditText)findViewById(R.id.E2_queen);
        N_queen=(EditText)findViewById(R.id.N_queen);

        S1_sunset=(EditText)findViewById(R.id.S1_sunset);
        U_sunset=(EditText)findViewById(R.id.U_sunset);
        N_sunset=(TextView)findViewById(R.id.N_sunset);
        S2_sunset=(EditText)findViewById(R.id.S2_sunset);
        E_sunset=(TextView)findViewById(R.id.E_sunset);
        T_sunset=(EditText)findViewById(R.id.T_sunset);

        T1_toronto=(EditText) findViewById(R.id.T1_toronto);
        O1_toronto=(EditText)findViewById(R.id.O1_toronto);
        R_toronto=(TextView)findViewById(R.id.R_toronto);
        O2_toronto=(EditText)findViewById(R.id.O2_toronto);
        N_toronto=(TextView)findViewById(R.id.N_toronto);
        T2_toronto=(EditText)findViewById(R.id.T2_toronto);
        O3_toronto=(EditText)findViewById(R.id.O3_toronto);


        P_pier.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Landing Stage for boats", Toast.LENGTH_SHORT).show();
            }
        });
        I_pier.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Landing Stage for boats", Toast.LENGTH_SHORT).show();
            }
        });
         E_pier.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    Toast.makeText(getApplicationContext(),"Hint: Landing Stage for boats", Toast.LENGTH_SHORT).show();
                }
            });
        R_pier.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Landing Stage for boats", Toast.LENGTH_SHORT).show();
            }
        });

        Q_queen.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Female ruler of state", Toast.LENGTH_SHORT).show();
            }
        });
        U_queen.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Female ruler of state", Toast.LENGTH_SHORT).show();
            }
        });
        E1_queen.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Female ruler of state", Toast.LENGTH_SHORT).show();
            }
        });
        E2_queen.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Female ruler of state", Toast.LENGTH_SHORT).show();
            }
        });
        N_queen.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Female ruler of state", Toast.LENGTH_SHORT).show();
            }
        });


        S1_sunset.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: When daylight fades", Toast.LENGTH_SHORT).show();
            }
        });
        U_sunset.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: When daylight fades", Toast.LENGTH_SHORT).show();
            }
        });
        N_sunset.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: When daylight fades", Toast.LENGTH_SHORT).show();
            }
        });
        S2_sunset.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: When daylight fades", Toast.LENGTH_SHORT).show();
            }
        });
        E_sunset.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: When daylight fades", Toast.LENGTH_SHORT).show();
            }
        });
        T_sunset.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: When daylight fades", Toast.LENGTH_SHORT).show();
            }
        });


        T1_toronto.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Captital of Ontario", Toast.LENGTH_SHORT).show();
            }
        });
        O1_toronto.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Captital of Ontario", Toast.LENGTH_SHORT).show();
            }
        });
        R_toronto.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Captital of Ontario", Toast.LENGTH_SHORT).show();
            }
        });
        O2_toronto.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Captital of Ontario", Toast.LENGTH_SHORT).show();
            }
        });
        N_toronto.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Captital of Ontario", Toast.LENGTH_SHORT).show();
            }
        });
        T2_toronto.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Captital of Ontario", Toast.LENGTH_SHORT).show();
            }
        });
        O3_toronto.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(),"Hint: Captital of Ontario", Toast.LENGTH_LONG).show();
            }
        });


        done11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((P_pier.getText().toString().matches("P"))
                        && (I_pier.getText().toString().matches("I"))
                        && (E_pier.getText().toString().matches("E"))
                        && (R_pier.getText().toString().matches("R")))
                    pier = true;

                if((Q_queen.getText().toString().matches("Q"))
                        && (U_queen.getText().toString().matches("U"))
                        && (E1_queen.getText().toString().matches("E"))
                        && (E2_queen.getText().toString().matches("E"))
                        && (N_queen.getText().toString().matches("N")))
                    queen = true;


                if((S1_sunset.getText().toString().matches("S"))
                        && (U_sunset.getText().toString().matches("U"))
                        && (N_sunset.getText().toString().matches("N"))
                        && (S2_sunset.getText().toString().matches("S"))
                        && (E_sunset.getText().toString().matches("E"))
                        && (T_sunset.getText().toString().matches("T")))
                    sunset = true;

                if((T1_toronto.getText().toString().matches("T"))
                        && (O1_toronto.getText().toString().matches("O"))
                        && (R_toronto.getText().toString().matches("R"))
                        && (O2_toronto.getText().toString().matches("O"))
                        && (N_toronto.getText().toString().matches("N"))
                        && (T2_toronto.getText().toString().matches("T"))
                        && (O3_toronto.getText().toString().matches("O")))
                    toronto = true;


                if(pier == true && toronto == true && sunset == true && queen == true ){
                    Intent intent = new Intent(parks_level1.this,Success.class);
                    startActivity(intent);
                    finish();
                }else {
                    Intent intent2 = new Intent(parks_level1.this, Failure.class);
                    startActivity(intent2);
                    finish();

                }
            }
        });
    }
}

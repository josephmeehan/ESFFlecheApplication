package com.blogspot.joemeehan.esfflecheapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageButton;
import android.view.View;
import android.view.View.OnClickListener;



public class MainActivity extends AppCompatActivity {

    EditText tempsbase;
    EditText handicap;
    EditText temps;
    TextView tempsref;
    TextView or, vermeil, argent, bronze, flechettechamois, skiopen;
    ImageButton btnAddFleche;

    Double num1,num2,num3,sum, sum1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tempsbase = (EditText)findViewById(R.id.editText2);
        handicap = (EditText)findViewById(R.id.editText5);
        tempsref = (TextView)findViewById(R.id.editText3);
        or = (TextView)findViewById(R.id.editText);
        vermeil = (TextView)findViewById(R.id.editText4);
        argent = (TextView)findViewById(R.id.editText6);
        bronze = (TextView)findViewById(R.id.editText8);
        flechettechamois = (TextView)findViewById(R.id.editText9);
        temps = (EditText)findViewById(R.id.editText7);
        skiopen = (TextView)findViewById(R.id.editText10);
        btnAddFleche = (ImageButton)findViewById(R.id.imageButton);

        btnAddFleche.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                num1 = Double.parseDouble(tempsbase.getText().toString());
                num2 = Double.parseDouble(handicap.getText().toString());
                //num3 = Double.parseDouble(temps.getText().toString());
                sum = num1 / (1+num2/100);
                tempsref.setText(String.format("%.2f",sum));
                sum1 = sum*(1.15);
                or.setText(String.format("%.2f",sum1));
                sum1 = sum*(1.28);
                vermeil.setText(String.format("%.2f",sum1));
                sum1 = sum*(1.40);
                argent.setText(String.format("%.2f",sum1));
                sum1 = sum*(1.50);
                bronze.setText(String.format("%.2f",sum1));
                sum1 = sum*(1.55);
                flechettechamois.setText(String.format("%.2f",sum1));
                //sum1 = (num3/sum-1)*100;
                //skiopen.setText(String.format("%.2f",sum1));
            }
        });

    }
}



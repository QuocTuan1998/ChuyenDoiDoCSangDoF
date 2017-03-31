package com.example.quoctuan.chuyendoidocsangdof;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText txtC,txtF;

    Button btnFToC,btnCToF,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {

        btnFToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HandleFConvertToC();
            }
        });
        btnCToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleCConvertToF();
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtC.setText("");
                txtF.setText("");
            }
        });


    }

    private void handleCConvertToF() {

        double C = Double.parseDouble(txtC.getText().toString());
        double F = (C*1.8) + 32;
        txtF.setText(F+"");
        txtC.setText("0");

    }

    private void HandleFConvertToC() {

        double F = Double.parseDouble(txtF.getText().toString());
        double C = (F - 32) / 1.8f;
        DecimalFormat format = new DecimalFormat("#.##");
        txtC.setText(format.format(C) + "");
        txtF.setText("0");

    }


    private void addControls() {

        txtC = (EditText) findViewById(R.id.txtC);
        txtF = (EditText) findViewById(R.id.txtF);

        btnFToC = (Button) findViewById(R.id.btnFToC);
        btnCToF = (Button) findViewById(R.id.btnCtoF);
        btnClear = (Button) findViewById(R.id.btnClear);

    }
}

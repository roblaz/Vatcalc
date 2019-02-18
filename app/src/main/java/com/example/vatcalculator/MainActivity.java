package com.example.vatcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick (View v) {
        EditText stringNum = (EditText) findViewById(R.id.editText);
        TextView resText = (TextView) findViewById(R.id.Result);

        double intNum = Double.parseDouble(stringNum.getText().toString());
        double res = intNum * 0.2;
        resText.setText(Double.toString(res));

    }
}

package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public void convertAmount(View view){
        EditText usdAmount = (EditText)findViewById(R.id.editTextUSD);
        Float    value = Float.parseFloat(usdAmount.getText().toString());
        value  = value/4;
        EditText cedisAmount = (EditText)findViewById(R.id.editTextCedis);
        cedisAmount.setText(value.toString());



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

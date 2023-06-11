package com.oguzhanakduman.first_resume_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNumberEditText;
    EditText secondNumberEditText;
    TextView sonucTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberEditText = findViewById(R.id.firstNumberEditText);
        secondNumberEditText = findViewById(R.id.secondNumberEditText);
        sonucTextView = findViewById(R.id.sonucTextView);
    }

    public void sum(View view){

        if (firstNumberEditText.getText().toString().matches("") || secondNumberEditText.getText().toString().matches("")){
            sonucTextView.setText("Geçerli Değer Gir!");
        } else{
            int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
            int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());

            int result = firstNumber + secondNumber;

            sonucTextView.setText("Result: " + result);
        }

    }

    public void deduct(View view){
        if (firstNumberEditText.getText().toString().matches("") || secondNumberEditText.getText().toString().matches("")){
            sonucTextView.setText("Geçerli Değer Gir!");
        } else{
            int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
            int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());

            int result = firstNumber - secondNumber;

            sonucTextView.setText("Result: " + result);
        }
    }

    public void multiply(View view){
        if (firstNumberEditText.getText().toString().matches("") || secondNumberEditText.getText().toString().matches("")){
            sonucTextView.setText("Geçerli Değer Gir!");
        } else{
            int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
            int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());

            int result = firstNumber * secondNumber;

            sonucTextView.setText("Result: " + result);
        }
    }

    public void divide(View view){
        if (firstNumberEditText.getText().toString().matches("") || secondNumberEditText.getText().toString().matches("")){
            sonucTextView.setText("Geçerli Değer Gir!");
        } else{
            int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
            int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());

            int result = firstNumber / secondNumber;

            sonucTextView.setText("Result: " + result);
        }
    }

}
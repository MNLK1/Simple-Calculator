//Пушкарский 303
package com.example.simplecalculator.pushkarskiy303;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextA;
    EditText editTextB;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        textViewResult = findViewById(R.id.textViewResult);
    }
    
    public void button_click(View v) {
        float a = Float.parseFloat(editTextA.getText().toString());
        float b = Float.parseFloat(editTextB.getText().toString());
        float c = 0.0f;

        if (v.getId() == R.id.buttonAdd) {
            c = a + b;
        } else if (v.getId() == R.id.buttonSub) {
            c = a - b;
        } else if (v.getId() == R.id.buttonMul) {
            c = a * b;
        } else if (v.getId() == R.id.buttonDiv) {
            try {
                c = a / b;
            } catch (Exception e) {
                return;
            }
        }
        textViewResult.setText(String.valueOf(c));
    }
}
//Пушкарский 303
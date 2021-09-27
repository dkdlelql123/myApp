package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnAddClicked(View view) {
        EditText num1 = findViewById(R.id.activity_main__editTextNum1);
        EditText num2 = findViewById(R.id.activity_main__editTextNum2);

        num1.setText( num1.getText().toString().trim() );
        num2.setText( num2.getText().toString().trim() );

        if(num1.getText().toString().length()== 0){
            toastMsg("숫자1을 작성해주세요.");
            num1.requestFocus();
            return;
        }

        if(num2.getText().toString().length()== 0){
            toastMsg("숫자2을 작성해주세요.");
            num2.requestFocus();
            return;
        }

        int number1 = Integer.parseInt( num1.getText().toString() );
        int number2 = Integer.parseInt( num2.getText().toString() );
        int rs = number1 + number2;

        toastMsg("결과 :"+rs);
    }

    void toastMsg(String msg){
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
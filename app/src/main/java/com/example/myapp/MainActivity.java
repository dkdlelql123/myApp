package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextNum1 ;
    EditText editTextNum2 ;
    TextView textViewRs ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNum1 = findViewById(R.id.activity_main__editTextNum1);
        editTextNum2 = findViewById(R.id.activity_main__editTextNum2);
        textViewRs = findViewById(R.id.activity_main__textViewRs);
    }

    public boolean EditTextChecked(){
        editTextNum1.setText( editTextNum1.getText().toString().trim() );
        editTextNum2.setText( editTextNum2.getText().toString().trim() );

        if(editTextNum1.getText().toString().length()== 0){
            toastMsg("숫자1을 작성해주세요.");
            editTextNum1.requestFocus();
            return false;
        }

        if(editTextNum2.getText().toString().length()== 0){
            toastMsg("숫자2을 작성해주세요.");
            editTextNum2.requestFocus();
            return false;
        }

        return true;
    }

    public void btnAddClicked(View view) {
        if(EditTextChecked() == false) return;

        int number1 = Integer.parseInt( editTextNum1.getText().toString() );
        int number2 = Integer.parseInt( editTextNum2.getText().toString() );
        int rs = number1 + number2;

        toastMsg("결과 :"+rs);
        textViewRs.setText("결과 :"+rs);
    }

    public void btnMinusClicked(View view) {

        if(EditTextChecked() == false) return;

        int number1 = Integer.parseInt( editTextNum1.getText().toString() );
        int number2 = Integer.parseInt( editTextNum2.getText().toString() );
        int rs = number1 - number2;

        toastMsg("결과 :"+rs);
        textViewRs.setText("결과 :"+rs);
    }

    public void btnClearClicked(View view) {

        editTextNum1.setText("");
        editTextNum2.setText("");
        
        toastMsg("지우기완료");
        textViewRs.setText("초기화");
         
    }
    
    void toastMsg(String msg){
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

}
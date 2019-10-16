package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editText;
    TextView textView;
    Button btnSeven, btnEight, btnNine, btnPlus, btnFour, btnFive, btnSix, btnMinus, btnOne, btnTwo, btn3, btnMultiply, btn0, btnEquals, btnCancel, btnDivision;

    String displayNum ="";
    int num1,num2;
    int result;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.result);
        editText = findViewById(R.id.edit);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btn3 = findViewById(R.id.btn3);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btn0 = findViewById(R.id.btnZero);
        btnCancel = findViewById(R.id.btnCancel);
        btnEquals = findViewById(R.id.btnEquals);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivision = findViewById(R.id.btnDivision);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivision.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnOne:
                displayNum +=1;
                editText.setText(displayNum);
                break;

            case R.id.btnTwo:
                displayNum +=2;
                editText.setText(displayNum);
                break;
            case R.id.btn3:
                displayNum +=3;
                editText.setText(displayNum);
                break;

            case R.id.btnFour:
                displayNum +=4;
                editText.setText(displayNum);
                break;
            case R.id.btnFive:
                displayNum +=5;
                editText.setText(displayNum);
                break;
            case R.id.btnSix:
                displayNum +=6;
                editText.setText(displayNum);
                break;
            case R.id.btnSeven:
                displayNum +=7;
                editText.setText(displayNum);
                break;

            case R.id.btnEight:
                displayNum +=8;
                editText.setText(displayNum);
                break;

            case R.id.btnNine:
                displayNum +=9;
                editText.setText(displayNum);
                break;

            case R.id.btnZero:
                displayNum +=0;
                editText.setText(displayNum);
                break;

            case R.id.btnPlus:
                num1 = Integer.parseInt(displayNum);
                displayNum = "";
                operator = "+";
                break;

            case  R.id.btnMinus:
                num1 = Integer.parseInt(displayNum);
                displayNum = "";
                operator = "-";
                break;

            case R.id.btnMultiply:
                num1 = Integer.parseInt(displayNum);
                displayNum = "";
                operator = "*";
                break;

            case R.id.btnDivision:
                num1 = Integer.parseInt(displayNum);
                displayNum = "";
                operator = "/";
                break;

            case R.id.btnEquals:
                num2 = Integer.parseInt(displayNum);
                result = getResult(operator, num1,num2);
                textView.setText(String.valueOf(result));
                break;

            case R.id.btnCancel:
                editText.setText("");
                textView.setText("");
                displayNum = "";
                break;
        }
    }

    private  int getResult(String operator, int n1, int n2 ){
        switch(operator){
            case"+":
                return n1 + n2;

            case "-":
                return n1-n2;

            case "*":
                return n1*n2;

            case "/":
                return n1/n2;

                default:
                    return 0;
        }
    }
}

package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private Button substract;
    private Button multiply;
    private Button divide;
    private TextView result;
    private TextView please;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        add = (Button) findViewById(R.id.add);
        substract = (Button) findViewById(R.id.substract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        result = (TextView) findViewById(R.id.result);
        please = (TextView) findViewById(R.id.please);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!num1.getText().toString().equals("") && !num2.getText().toString().equals("")) {
                    //kalo kedua inputannya ga kosong dia kerjain perhitungannya

                    int number1 = Integer.parseInt(num1.getText().toString());
                    int number2 = Integer.parseInt(num2.getText().toString());

                    int sum = number1 + number2;
                    result.setText("Addition: " + String.valueOf(sum));
                } else {
                    result.setText("Invalid Operation, Please Input Number.");
                }

            }
        });

        substract.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             if (!num1.getText().toString().equals("") && !num2.getText().toString().equals("")) {
                                                 //kalo kedua inputannya ga kosong dia kerjain perhitungannya

                                                 int number1 = Integer.parseInt(num1.getText().toString());
                                                 int number2 = Integer.parseInt(num2.getText().toString());

                                                 int min = number1 - number2;
                                                 result.setText("Substraction: " + String.valueOf(min));
                                             } else {
                                                 result.setText("Invalid Operation, Please Input Number.");
                                             }
                                         }

                                     }
        );

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!num1.getText().toString().equals("") && !num2.getText().toString().equals("")) {
                    //kalo kedua inputannya ga kosong dia kerjain perhitungannya

                    int number1 = Integer.parseInt(num1.getText().toString());
                    int number2 = Integer.parseInt(num2.getText().toString());

                    int multi = number1 * number2;
                    result.setText("Multiply: " + String.valueOf(multi));

                } else {
                    result.setText("Invalid Operation, Please Input Number.");
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          if (!num1.getText().toString().equals("") && !num2.getText().toString().equals("")) {
                                              //kalo kedua inputannya ga kosong dia kerjain perhitungannya

                                              double number1 = Double.parseDouble(num1.getText().toString());
                                              double number2 = Double.parseDouble(num2.getText().toString());

                                              double div = number1 / number2;
                                              result.setText("Divide: " + String.valueOf(div));
                                          } else {
                                              result.setText("Invalid Operation, Please Input Number.");
                                          }
                                          if(num2.getText().toString().equals("0")){
                                              result.setText("Cannot Divide By Zero !");
                                          }
                                      }
                                  }


        );


    }
}
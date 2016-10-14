package com.bignerdranch.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculatorActivity extends AppCompatActivity {

    private Button mfunc_a;
    private Button mfunc_s;
    private Button mfunc_m;
    private Button mfunc_d;
    private TextView manswer_true;
    private EditText mnumber_1;
    private EditText mnumber_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

       // calculatorActivity d=new calculatorActivity();

        manswer_true= (TextView)findViewById(R.id.answer_key);
        mnumber_1=(EditText)findViewById(R.id.input1);
        mnumber_2=(EditText)findViewById(R.id.input2);

        mfunc_a = (Button) findViewById(R.id.function_add);
        mfunc_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int txt1 = Integer.parseInt(mnumber_1.getText().toString());
                int txt2 = Integer.parseInt(mnumber_2.getText().toString());
                int ans = txt1 + txt2;
                String ans2 = String.valueOf(ans);
                manswer_true.setText(ans2);
            }
        });
        //Addfunction();
        mfunc_s = (Button) findViewById(R.id.function_subtract);
        mfunc_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int txt1 = Integer.parseInt(mnumber_1.getText().toString());
                int txt2 = Integer.parseInt(mnumber_2.getText().toString());
                int ans = txt1 - txt2;
                String ans2 = String.valueOf(ans);
                manswer_true.setText(ans2);
            }
        });
        mfunc_m = (Button) findViewById(R.id.function_multiply);
        mfunc_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int txt1 = Integer.parseInt(mnumber_1.getText().toString());
                int txt2 = Integer.parseInt(mnumber_2.getText().toString());
                int ans = txt1 * txt2;
                String ans2 = String.valueOf(ans);
                manswer_true.setText(ans2);
            }
        });
        mfunc_d = (Button) findViewById(R.id.function_divide);
        mfunc_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float txt1 =Float.parseFloat(mnumber_1.getText().toString());
                float txt2 = Float.parseFloat(mnumber_2.getText().toString());
                float ans = txt1 / txt2;
                String ans2 = String.valueOf(ans);
                manswer_true.setText(ans2);
            }
        });
    }
    /*public void Addfunction()
    {
        int ans;
        ans=Integer.parseInt(mnumber_1.getText().toString())+Integer.parseInt(mnumber_2.getText().toString());
        manswer_true.setText(ans);
    }*/
}

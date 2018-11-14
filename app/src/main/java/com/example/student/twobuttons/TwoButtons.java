package com.example.student.twobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TwoButtons extends AppCompatActivity {


    TextView textView = null;
    TextView textView2 = null;
    Button button = null;
    Button button2 = null;
    View.OnClickListener onClick = null;
    View.OnClickListener onClick2 = null;
    int add_1 = 0;
    int add_2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_buttons);
        button = (Button) findViewById(R.id.button1);
        button = (Button) findViewById(R.id.button2);
        textView = (TextView) findViewById(R.id.counterOne);
        textView2 = (TextView) findViewById(R.id.counterTwo);
        onClick = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                add_1 = add_1 + 1;
                String addOne = "" + add_1;
                textView.setText(addOne);
            }
        };
        onClick2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add_2 = add_2 + 1;
                String addTwo = "" + add_2;
                textView.setText(addTwo);
            }
        };

        button.setOnClickListener(onClick);
        button2.setOnClickListener(onClick2);

    }
}

package com.example.naye.myapplication;

import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class Main2Activity extends AppCompatActivity {
    protected DBHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button ok;
        ok=(Button)findViewById(R.id.button2); //xml과 연결
        ok.setOnClickListener(new View.OnClickListener() { //o
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        TimePicker tp=(TimePicker) findViewById(R.id.timePicker);


    }



}

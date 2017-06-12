package com.example.naye.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ArrayAdapter객체를 생성해서 레이아웃과 데이터를 매핑
        String[] str=getResources().getStringArray(R.array.spinnerArray);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>//행레이아웃과 스트링 배열 객체 사용
                (this, android.R.layout.simple_spinner_dropdown_item,str);
        Spinner spi=(Spinner)findViewById(R.id.spinner);
        spi.setAdapter(adapter);
        spi.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected
                            (AdapterView<?> parent,View view, int position,long id){
                        print(view,position);

                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        // TODO Auto-generated method stub
                    }

                }

        );




        Button set; //버튼 변수지정
        set=(Button)findViewById(R.id.button); //xml과 연결
        set.setOnClickListener(new View.OnClickListener() { //btm1
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }



        public void print(View v,int position){
            Spinner sp=(Spinner)findViewById(R.id.spinner);
            String res="";
            if(sp.getSelectedItemPosition()>0){
                res=(String)sp.getAdapter().getItem(sp.getSelectedItemPosition());

            }
            if(res!=""){

            }
        }



}

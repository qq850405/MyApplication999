package com.example.imcycu.myapplication999;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity{
    String func[] ={"BMI","健康中心","最新消息","離開"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list =  (ListView) findViewById(R.id.list);

        ArrayAdapter adapter =new ArrayAdapter(this,android.R.layout.simple_list_item_1,func);
        list.setAdapter(adapter);

        list.setOnItemClickListener(myOnItemClickListener);

    }


    AdapterView.OnItemClickListener myOnItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

            switch (position)
            {
                case 0:
                    Intent myIntent = new Intent();
                    myIntent.setClass(MainActivity.this, BmiCalculatorActivity.class);
                    startActivity(myIntent);
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    finish();
                    break;
            }

        }
    };








}

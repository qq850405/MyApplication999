package com.example.imcycu.myapplication999;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class BmiCalculatorActivity extends AppCompatActivity {

    private EditText edWeight;
    private EditText edHeight;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);


        findViews();

    }

    private void findViews() {
        edWeight =(EditText) findViewById(R.id.ed_weight);
        edHeight =(EditText) findViewById(R.id.ed_height);
    }


    public void bmi(View v){

        String w = edWeight.getText().toString();
        String h = edHeight.getText().toString();

        float weight =Float.parseFloat(w);
        float height =Float.parseFloat(h)/100;

        float bmi = weight/(height*height);


        //Log.d("BMI",String.valueOf(bmi)  );


        //Toast.makeText(this,String.valueOf(bmi),Toast.LENGTH_LONG).show();


        /*AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setMessage(String.valueOf(bmi));
        builder.show();*/


        new AlertDialog.Builder(this)
                .setMessage(String.valueOf(bmi))
                .setTitle("BMI運算")
                .setPositiveButton("OK",null)
                .setNeutralButton("Cancel",null)
                .show();



    }



}

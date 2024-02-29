package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;


public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);
    }

    public void onClickFindDrink(View view){
        TextView list = (TextView) findViewById(R.id.List);
        Spinner color = (Spinner) findViewById(R.id.color);
        String prodType = String.valueOf(color.getSelectedItemId());

        if(prodType.equals("0")){
            String temp = "1. Productos quimicos" +
                    "\n2. Productos de construccion";

            list.setText(temp);
        }
        if(prodType.equals("1")){
            String temp = "1. Cereales" +
                    "\n2. Frutales" +
                    "\n3. leguminosas";
            list.setText(temp);
        }
        if(prodType.equals("2")){
            String temp = "1. Agua" +
                    "\n2. Gasolina" +
                    "\n3. Petroleo";
            list.setText(temp);
        }

    }
}

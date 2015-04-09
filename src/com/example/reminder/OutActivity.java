package com.example.reminder;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Oleksandra on 31.03.2015.
 */
public class OutActivity extends Activity {
  //  public ListView lv;
     public  TextView textView;
    public Button button2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.out);

        DateClass a = new DateClass();
        a.main();
        Date cuurentTime = new Date();

        final TextView textView1 = (TextView)findViewById(R.id.textView);
      //  SimpleDateFormat sdf = new SimpleDateFormat("d  MMMM, EEEE,YYY");
      //  SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy ");
      //  String sDate = sdf.format(cuurentTime);
        DateFormat df;
        df = DateFormat.getDateInstance( /* dateStyle */ DateFormat.FULL
                                     );
        String sDate = df.format(cuurentTime);

        textView1.setText("Aktuelle Zeit:  " +sDate +"  Müllabfuhr für den Rest des Monats:");
        final ListView list_gold = (ListView)findViewById(R.id.listView);
       if (DateClass.liste_gold_String.isEmpty()){
            list_gold.setVisibility(View.INVISIBLE);
       }

        final ArrayAdapter<String> adapter_gold = new ArrayAdapter<String>(this,	android.R.layout.simple_list_item_1, DateClass.liste_gold_String);
        list_gold.setAdapter(adapter_gold);

        final ListView list_blue = (ListView)findViewById(R.id.listView2);
        if (DateClass.liste_blue_String.isEmpty()){
            list_gold.setVisibility(View.INVISIBLE);
        }
        final ArrayAdapter<String> adapter_blue = new ArrayAdapter<String>(this,	android.R.layout.simple_list_item_1, DateClass.liste_blue_String);
        list_blue.setAdapter(adapter_blue);

       final ListView list_green = (ListView)findViewById(R.id.listView3);
        if (DateClass.liste_green_String.isEmpty()){
            list_gold.setVisibility(View.INVISIBLE);
        }
        final ArrayAdapter<String> adapter_green = new ArrayAdapter<String>(this,	android.R.layout.simple_list_item_1, DateClass.liste_green_String);
        list_green.setAdapter(adapter_green);

        final ListView list_black = (ListView)findViewById(R.id.listView4);
        if (DateClass.liste_black_String.isEmpty()){
            list_gold.setVisibility(View.INVISIBLE);
        }
        final ArrayAdapter<String> adapter_black = new ArrayAdapter<String>(this,	android.R.layout.simple_list_item_1, DateClass.liste_black_String);
        list_black.setAdapter(adapter_black);




    button2 =(Button)findViewById(R.id.button2);
    button2.setOnClickListener(new View.OnClickListener() {


        @Override
        public void onClick(View v) {
           // ListView lv = (ListView)findViewById(R.id.listView1);
         //   lv.clearChoices();
        //   adapter_gold.clear();
            adapter_blue.clear();
           adapter_green.clear();
            adapter_black.clear();
            finish();
        }
    } );

    } }


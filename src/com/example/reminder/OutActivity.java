package com.example.reminder;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Oleksandra on 31.03.2015.
 */
public class OutActivity extends Activity {

   // public  TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.out);

        DateClass a = new DateClass();
        a.main();

        ListView lv = (ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,	android.R.layout.simple_list_item_1, DateClass.liste_String);
        lv.setAdapter(adapter);


    }
}

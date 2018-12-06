package com.example.lab605b.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] carsArray = {"BMW","Mercedes","Honda","Toyota","Jaguar","Nissan","Buick","Mazda"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.listview, R.id.label, carsArray);

        ListView listView = (ListView) findViewById(R.id.cars_list);

        listView.setAdapter(adapter);
    }
}

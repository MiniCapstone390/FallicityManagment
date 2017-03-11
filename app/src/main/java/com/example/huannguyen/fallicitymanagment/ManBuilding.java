package com.example.huannguyen.fallicitymanagment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ManBuilding extends AppCompatActivity {
    public ListView listView;      //Initialized listview




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_building);


        listView = (ListView) findViewById(R.id.WClist);


        //Create array adapter
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(ManBuilding.this,
                android.R.layout.simple_expandable_list_item_1,
                getResources().getStringArray(R.array.Bathrooms));


        //Set array adapter
        listView.setAdapter(mAdapter);



        //Set up onClick function for each items in bathroom Listview
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if(position==0) {
                   Intent intent = new Intent(view.getContext(), Bathroom1.class);
                   startActivityForResult(intent,0);
               }

               if(position==1) {
                   Intent intent = new Intent(view.getContext(), Bathroom2.class);
                   startActivityForResult(intent,0);
               }

               if(position==2) {
                   Intent intent = new Intent(view.getContext(), Bathroom3.class);
                   startActivityForResult(intent,0);
               }

               if(position==3) {
                   Intent intent = new Intent(view.getContext(), Bathroom4.class);
                   startActivityForResult(intent,0);
               }

               if(position==4) {
                   Intent intent = new Intent(view.getContext(), Bathroom5.class);
                   startActivityForResult(intent,0);
               }

           }
       });

    }
}

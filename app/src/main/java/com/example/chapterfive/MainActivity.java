package com.example.chapterfive;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        String[] attraction = {
                "Art Museum",
                "Magnificent Mile",
                "Villiw Tower",
                "Water Tower"
        };
        setListAdapter(new ArrayAdapter<String>(this,
                R.layout.activity_main,
                R.id.list_items,
                attraction));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.alfaisal.edu")));
                break;

            case 1:
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
                break;
        }
    }
}
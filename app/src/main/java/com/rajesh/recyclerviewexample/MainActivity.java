package com.rajesh.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyList[] myLists = new MyList[]{
                new MyList("Email", android.R.drawable.ic_dialog_email),
                new MyList("Info", android.R.drawable.ic_dialog_info),
                new MyList("Delete", android.R.drawable.ic_delete),
                new MyList("Alert", android.R.drawable.ic_dialog_alert),
                new MyList("Dailer", android.R.drawable.ic_dialog_dialer),
                new MyList("Info", android.R.drawable.ic_dialog_info),
                new MyList("Email", android.R.drawable.ic_dialog_email),
                new MyList("Delete", android.R.drawable.ic_delete),
                new MyList("Email", android.R.drawable.ic_dialog_email),
                new MyList("Alert", android.R.drawable.ic_dialog_alert),
                new MyList("Map", android.R.drawable.ic_dialog_map)
        };


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        MyAdapter adapter = new MyAdapter(myLists);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }
}
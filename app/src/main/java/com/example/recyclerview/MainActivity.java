package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.RecoverySystem;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<Email> emails = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emails.add(new Email("Hi", "Summary 1", "bsmith1@this.com"));
        emails.add(new Email("Hola", "Summary 2", "bsmith2@this.com"));
        emails.add(new Email("Helo", "Summary 3", "bsmith3@this.com"));
        emails.add(new Email("Hello", "Summary 4", "bsmith4@this.com"));
        emails.add(new Email("whatsup", "Summary 5", "bsmith5@this.com"));
        emails.add(new Email("Hi", "Summary 6", "bsmith6@this.com"));
        emails.add(new Email("Hi", "Summary 7", "bsmith7@this.com"));
        emails.add(new Email("Hi", "Summary 8", "bsmith8@this.com"));


        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new Email_Adapter(emails);
        recyclerView.setAdapter(mAdapter);

    }
}

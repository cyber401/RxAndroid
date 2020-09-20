package com.example.rxandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.rxandroid.databinding.ActivityMainBinding;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding activityMainBinding;
RecyclerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();// getroot() Returns the outermost View in the layout file associated with the Binding.
        setContentView(view);
        adapter=new RecyclerAdapter();
        activityMainBinding.recycle.setLayoutManager(new LinearLayoutManager(this));
        Entry entry = new Entry("20.0", "tv", "20.01.2020" );
        Entry entry1 = new Entry("20.0", "tv", "20.01.2020" );
        Entry entry2 = new Entry("20.0", "tv", "20.01.2020" );
        Entry entry3 = new Entry("20.0", "tv", "20.01.2020" );
        Entry entry4 = new Entry("20.0", "tv", "20.01.2020" );
        Entry entry5 = new Entry("20.0", "tv", "20.01.2020" );
        Entry entry6 = new Entry("20.0", "tv", "20.01.2020" );
        Entry entry7 = new Entry("20.0", "tv", "20.01.2020" );
        Entry entry8 = new Entry("20.0", "tv", "20.01.2020" );
        adapter.setEntryList(entry);
        adapter.setEntryList(entry1);
        adapter.setEntryList(entry2);
        adapter.setEntryList(entry3);
        adapter.setEntryList(entry4);
        adapter.setEntryList(entry5);
        adapter.setEntryList(entry6);
        adapter.setEntryList(entry7);
        adapter.setEntryList(entry8);

    activityMainBinding.recycle.setAdapter(adapter);
    }
}

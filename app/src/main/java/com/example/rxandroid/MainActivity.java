package com.example.rxandroid;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Bundle;
import android.view.View;
import com.example.rxandroid.databinding.ActivityMainBinding;

import java.math.BigDecimal;
import java.util.Date;

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
        Entry entry1 = new Entry(BigDecimal.valueOf(1500),"T.V", new Date()); // BigDecimal.value of() use to convert double to BigDecimal
        Entry entry2 = new Entry(BigDecimal.valueOf(1544),"Mobile", new Date());
        Entry entry3 = new Entry(BigDecimal.valueOf(1172),"Refrigerator", new Date());
        Entry entry4 = new Entry(BigDecimal.valueOf(1627),"Washing Machine", new Date());
//        adapter.setEntryList(entry);
//        adapter.setEntryList(entry1);
//        adapter.setEntryList(entry2);
//        adapter.setEntryList(entry3);
//        adapter.setEntryList(entry4);
//        adapter.setEntryList(entry5);
//        adapter.setEntryList(entry6);
//        adapter.setEntryList(entry7);
//        adapter.setEntryList(entry8);
        Observable.just(entry1,entry2,entry3,entry4).subscribe(new Consumer<Entry>() {
            @Override
            public void accept(Entry entry) throws Throwable {
                adapter.setENTRY_LIST(entry);
            }
        });
    activityMainBinding.recycle.setAdapter(adapter);
    }
}

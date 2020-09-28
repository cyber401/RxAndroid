package com.example.rxandroid;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.example.rxandroid.databinding.EntryListBinding;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private final List<Entry> ENTRY_LIST = new ArrayList<>();
    private final NumberFormat NUMBER_FORMAT =new DecimalFormat("#0.00");
    private final DateFormat DATE_FORMAT = DateFormat.getDateInstance();

    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        EntryListBinding entryListBinding = EntryListBinding.inflate(layoutInflater, parent, false);
        return new MyViewHolder(entryListBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
    Entry entry = ENTRY_LIST.get(position);
    holder.entryListBinding.productName.setText(entry.getNameOfCommodity());
    holder.entryListBinding.price.setText(NUMBER_FORMAT.format(entry.getPrice().doubleValue()));
    holder.entryListBinding.date.setText(android.text.format.DateFormat.format("yyyy-MM-dd hh:mm", entry.getDate()));// that's how Date formating work

    }
    @Override
    public int getItemCount() {
        return ENTRY_LIST.size();
    }
    void setENTRY_LIST(Entry entry){
        ENTRY_LIST.add(entry);
        notifyItemInserted(ENTRY_LIST.size()-1); // this work when we provide data in real time in recycler view
    }


    class MyViewHolder extends RecyclerView.ViewHolder{
        EntryListBinding entryListBinding;
        MyViewHolder(@NonNull EntryListBinding entryListBinding){
            super(entryListBinding.getRoot());
            this.entryListBinding = entryListBinding;
        }

    }

}


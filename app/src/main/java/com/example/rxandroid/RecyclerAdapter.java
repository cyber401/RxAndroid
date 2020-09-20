package com.example.rxandroid;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rxandroid.databinding.EntryListBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private final List<Entry> entryList = new ArrayList<>();



    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        EntryListBinding entryListBinding = EntryListBinding.inflate(layoutInflater, parent, false);
        return new MyViewHolder(entryListBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
    Entry entry = entryList.get(position);
    holder.entryListBinding.productName.setText(entry.getNameOfCommodity());
    holder.entryListBinding.price.setText(entry.getPrice());
    holder.entryListBinding.date.setText(entry.getDate());

    }

    @Override
    public int getItemCount() {
        return entryList.size();
    }
    void setEntryList(Entry entry){
        entryList.add(entry);
        notifyItemInserted(entryList.size()-1);
    }


    class MyViewHolder extends RecyclerView.ViewHolder{
        EntryListBinding entryListBinding;
        MyViewHolder(@NonNull EntryListBinding entryListBinding){
            super(entryListBinding.getRoot());
            this.entryListBinding = entryListBinding;
        }

    }

}

package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class Email_Adapter extends RecyclerView.Adapter<Email_Adapter.ViewHolder> {

    ArrayList<Email> mData;

    public Email_Adapter(ArrayList<Email> mData) {
        this.mData = mData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.email_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Email email = mData.get(position);
        holder.subject.setText(email.subject);
        holder.summary.setText(email.summary);
        holder.textViewEmail.setText(email.sender);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView subject, summary, textViewEmail;
        public ViewHolder(View itemView) {
            super(itemView);
            subject = itemView.findViewById(R.id.subject);
            summary = itemView.findViewById(R.id.summary);
            textViewEmail = itemView.findViewById(R.id.textViewEmail);


        }
    }
}

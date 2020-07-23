package com.example.proj2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class rest_adapter extends RecyclerView.Adapter<rest_adapter.restviewholder> {
    Context context;
    int restimg[];
    public rest_adapter(Context context,int restimg[])
    {
        this.context=context;
        this.restimg=restimg;
    }


    @NonNull
    @Override
    public restviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.restaurent,parent,false);
        return new restviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull restviewholder holder, int position) {
          holder.image.setImageResource(restimg[position]);
    }

    @Override
    public int getItemCount() {
        return restimg.length;
    }

    public class restviewholder extends RecyclerView.ViewHolder {
        ImageView image;
        public restviewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.restimage);
        }
    }
}

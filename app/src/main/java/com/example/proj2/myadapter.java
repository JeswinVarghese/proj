package com.example.proj2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class myadapter extends RecyclerView.Adapter<myadapter.toppicksviewholder> {
    Context context;
    String place[];
    int images[];

    public myadapter(Context context,String place[],int images[])
    {
        this.context=context;
        this.place=place;
        this.images=images;
    }

    @NonNull
    @Override
    public toppicksviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.top_places,parent,false);
        return new toppicksviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull toppicksviewholder holder, int position) {
        holder.placename.setText(place[position]);
        holder.img.setImageResource(images[position]);

    }

    @Override
    public int getItemCount()
    {
        return place.length;
    }

    public  class toppicksviewholder extends RecyclerView.ViewHolder{
        TextView placename;
        ImageView img;

        public toppicksviewholder(@NonNull View itemView) {
            super(itemView);
            placename=itemView.findViewById(R.id.placename);
            img=itemView.findViewById(R.id.placeimage);
        }
    }
}

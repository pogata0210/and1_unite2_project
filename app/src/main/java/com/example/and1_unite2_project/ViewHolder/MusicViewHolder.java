package com.example.and1_unite2_project.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.and1_unite2_project.R;


public class MusicViewHolder extends RecyclerView.ViewHolder {

    TextView tv;
    ListView lv;

    public MusicViewHolder(@NonNull View itemView) {
        super(itemView);

        tv = (TextView)itemView.findViewById(R.id.name);
        lv = (ListView)itemView.findViewById(R.id.lv);

    }
}

package com.example.and1_unite2_project;


import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and1_unite2_project.ViewHolder.MusicViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DatabaseReference databaseReference;
    FirebaseRecyclerOptions<Music> options;
    FirebaseRecyclerAdapter<Music, MusicViewHolder> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        databaseReference = FirebaseDatabase.getInstance().getReference().child("MusicList");

        options = new FirebaseRecyclerOptions.Builder<Music>()
                .setQuery(databaseReference,Music.class).build();

        adapter = new FirebaseRecyclerAdapter<Music, MusicViewHolder>(options) {

            @Override
            protected void onBindViewHolder(MusicViewHolder holder, int position, Music model) {

            }

            @NonNull
            @Override
            public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_music,parent,false);

                return new MusicViewHolder(view);
            }
        };



    }




}
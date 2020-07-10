package com.example.android_project11listrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pokemon p1 = new Pokemon("Pikachu", R.drawable.pikachu, 30, 30, 300);
        Pokemon p2 = new Pokemon("Ninetales", R.drawable.ninetales, 40, 40, 400);
        Pokemon p3 = new Pokemon("Bulbasar", R.drawable.bulbasaur, 50, 50, 500);
        Pokemon p4 = new Pokemon("Venusaur", R.drawable.venusaur, 60, 60, 600);

        ArrayList<Pokemon> myPokemons = new ArrayList<>();
        myPokemons.add(p1);
        myPokemons.add(p2);
        myPokemons.add(p3);
        myPokemons.add(p4);

        RecyclerView recyclerview = findViewById(R.id.recycleview);

        //making the RecyclerView neat
        recyclerview.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(lm);

        MyAdapter myadapter = new MyAdapter(myPokemons);
        recyclerview.setAdapter(myadapter);




    }
}
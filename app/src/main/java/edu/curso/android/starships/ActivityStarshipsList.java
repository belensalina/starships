package edu.curso.android.starships;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import edu.curso.android.starships.api.Starship;

public class ActivityStarshipsList extends AppCompatActivity implements RecyclerAdapterStarships.OnClickListener {

    private RecyclerView recyclerViewStarshipList ;
    private ArrayList<Starship> starships;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starships_list);

        recyclerViewStarshipList = findViewById(R.id.recyclerViewStarshipList);

        //Acá traigo el arraylist que pasé en el intent desde MainActivity

        starships = (ArrayList<Starship>) getIntent().getSerializableExtra("starships");

        recyclerViewStarshipList= findViewById(R.id.recyclerViewStarshipList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewStarshipList.setLayoutManager(layoutManager);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, layoutManager.getOrientation());
        recyclerViewStarshipList.addItemDecoration(dividerItemDecoration);

        RecyclerAdapterStarships recyclerAdapterStarships = new RecyclerAdapterStarships(this, starships,this);
        recyclerViewStarshipList.setAdapter(recyclerAdapterStarships);
    }

    @Override
    public void onClick(int position){
        Intent intentToStarshipDetailActivity = new Intent(this, ActivityDetail.class);
        intentToStarshipDetailActivity .putExtra("starship", starships.get(position));
        startActivity(intentToStarshipDetailActivity );
    }
}

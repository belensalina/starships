package edu.curso.android.starships;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import edu.curso.android.starships.api.RetroFitClient;
import edu.curso.android.starships.api.Starship;
import edu.curso.android.starships.api.StarshipList;
import edu.curso.android.starships.api.StarshipService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    private RecyclerView RecyclerViewStarshipsList;
    private TextView tvStarship;
    private Button btShipList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvStarship = findViewById(R.id.tvStarship);
        btShipList = findViewById(R.id.bnShipList);

        btShipList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getStarship(v);
            }
        });
    }

    private void getStarship(View v)
    {
        StarshipService starshipService = RetroFitClient.recuperarRetrofit().create(StarshipService.class);
        Call<StarshipList> call = starshipService.starshipList();
        call.enqueue(new Callback<StarshipList>() {
            @Override
            public void onResponse(Call<StarshipList> call, Response<StarshipList> response) {
                ArrayList<Starship> starships = response.body().getResults();
                System.out.println(starships);
                toStarshipListActivity(starships);
            }

            @Override
            public void onFailure(Call<StarshipList> call, Throwable t) {
                System.out.println(t + "upps error");
            }
        });
    }


    private void toStarshipListActivity(ArrayList<Starship> starships) {
        Intent intentToMainActivityStarshipsList = new Intent(this, ActivityStarshipsList.class);
        if(starships != null) {
            intentToMainActivityStarshipsList.putExtra("starships", starships);
        }
        startActivity(intentToMainActivityStarshipsList);
    }


}






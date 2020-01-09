package edu.curso.android.starships;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private RecyclerView RecyclerViewStarshipsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar_starship_list= findViewById(R.id.toolbar_starships_list);
        toolbar_starship_list.setTitle("STARSHIPS");
        setSupportActionBar(toolbar_starship_list);
        RecyclerViewStarshipsList = findViewById(R.id.RecyclerViewStarshipList);

      //  LinearLayoutManager layoutManager = new RecyclerViewStarshipsList(this);
      //  RecyclerViewStarshipsList.setLayoutManager(layoutManager);

       // DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, layoutManager.getOrientation());
       // recyclerViewContactos.addItemDecoration(dividerItemDecoration);

       // RecyclerAdapterContactos recyclerAdapterContactos = new RecyclerAdapterContactos(this, contactos);
       // recyclerViewContactos.setAdapter(recyclerAdapterContactos);
    }


}






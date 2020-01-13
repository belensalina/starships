package edu.curso.android.starships;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import edu.curso.android.starships.api.Starship;

public class ActivityDetail extends AppCompatActivity {

    private TextView tvNameDetail;
    private TextView tvModelDetail;
    private TextView tvCreditsDetail;
    private TextView tvLengthDetail;
    private TextView tvMasDetail;
    private TextView tvCrew;
    private Starship starship;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        starship = (Starship) getIntent().getSerializableExtra("starship");

        tvNameDetail = findViewById(R.id.tvNameDetail);
        tvModelDetail = findViewById(R.id.tvModelDetail);
        tvCreditsDetail = findViewById(R.id.tvCreditsDetail);
        tvLengthDetail = findViewById(R.id.tvLengthDetail);
        tvMasDetail = findViewById(R.id.tvMasDetail);
        tvCrew = findViewById(R.id.tvCrew);


        tvNameDetail.setText(starship.getName() );
        tvModelDetail.setText(starship.getModel() );
        tvCreditsDetail.setText(starship.getCostInCredits() );
        tvLengthDetail.setText(starship.getLength() );
        tvMasDetail.setText(starship.getMax_atmosphering_speed() );
        tvCrew.setText(starship.getCrew() );
    }
}

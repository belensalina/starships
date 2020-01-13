package edu.curso.android.starships.api;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class StarshipList {
    @SerializedName("results")
    private ArrayList<Starship> results;

    public ArrayList<Starship> getResults() {
        return results;
    }

}

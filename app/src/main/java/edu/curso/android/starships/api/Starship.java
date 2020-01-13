package edu.curso.android.starships.api;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

    public class Starship implements Serializable {

        @SerializedName("name")
        private String name;

        @SerializedName("model")
        private String model;

        @SerializedName("cost_in_credits")
        private String costInCredits;

        @SerializedName("length")
        private String length;

        @SerializedName("max_atmosphering_speed")
        private String max_atmosphering_speed;

        @SerializedName("crew")
        private String crew;


        public Starship() {}

        public Starship(String name, String model, String costInCredits, String length, String max_atmosphering_speed, String crew) {
            this.name = name;
            this.model = model;
            this.costInCredits = costInCredits;
            this.length = length;
            this.max_atmosphering_speed = max_atmosphering_speed;
            this.crew = crew;

        }

        public String getName() {return  name;}

        public String getModel() {return model;}

        public String getCostInCredits() {return costInCredits;}

        public String getLength() {return length;}

        public String getMax_atmosphering_speed() {return max_atmosphering_speed;}

        public String getCrew() {return crew;}

        @Override
        public String toString() {
            return "Starship{" +
                    "name='" + name + '\'' +
                    ", model='" + model + '\'' +
                    ", costInCredits='" + costInCredits + '\'' +
                    ", length='" + length + '\'' +
                    ", max_atmosphering_speed='" + max_atmosphering_speed + '\'' +
                    ", crew='" + crew + '\'' +
                    '}';
        }
    }


package com.example.miniprojecteduardosantibanez;

import android.widget.ImageView;

public class PokemonStats {
    private String name;
    private String description;
    private int id;

    public static final PokemonStats[] starters={
            new PokemonStats("House",
                    "Just a House",R.drawable.house_thumb),
            new PokemonStats("Andy",
                    "The official Mascot of Android.",R.drawable.droid_thumb),
            new PokemonStats("Squirtle",
                    "Water turtle.",R.drawable.s_thumb)
    };

    private PokemonStats(String name, String PokedexEntry,int resid){
        this.name=name;
        this.description=PokedexEntry;
        this.id=resid;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return this.name;
    }
    public int showIm(){
        return id;
    }

}

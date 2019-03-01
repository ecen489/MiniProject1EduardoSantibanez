package com.example.miniprojecteduardosantibanez;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements PokemonListFragment.PokemonListListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public void itemClicked(long id){
        PokemonDetail details=new PokemonDetail();
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        details.setPokemonid(id);
        ft.replace(R.id.fragment_container,details);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }
}

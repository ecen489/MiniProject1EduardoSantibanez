package com.example.miniprojecteduardosantibanez;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PokemonDetail extends Fragment {
    private long pokemonid;

    public PokemonDetail() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_pokemon_detail, container, false);
        Button btn1 = (Button) v.findViewById(R.id.btn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),AR.class);
                PokemonStats pokemon1=PokemonStats.starters[(int) pokemonid];
                intent.putExtra("obj",pokemon1.getName());
                System.out.println(pokemonid);
                getActivity().startActivity(intent);
            }
        });
        return v;
    }
    @Override
    public void onStart(){
        super.onStart();
        View view=getView();
        if(view!=null){
            TextView title=(TextView) view.findViewById(R.id.textTitle);
            PokemonStats pokemon=PokemonStats.starters[(int) pokemonid];
            title.setText(pokemon.getName());
            TextView description=(TextView) view.findViewById(R.id.textDescription);
            description.setText(pokemon.getDescription());
            ImageView v=(ImageView) getActivity().findViewById(R.id.prob);
            v.setImageResource(pokemon.showIm());
        }
    }
    public void setPokemonid(long id){
        this.pokemonid=id;
    }
}

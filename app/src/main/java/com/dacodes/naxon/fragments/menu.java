package com.dacodes.naxon.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.dacodes.naxon.R;
import com.dacodes.naxon.RecyclerViewClickListener;
import com.dacodes.naxon.activities.home;
import com.dacodes.naxon.adapters.menuItems;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class menu extends Fragment{

    public menu() {
        // Required empty public constructor
    }


    private int[] galeria = { R.drawable.five, R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four};
    @BindView(R.id.carouselView)
    CarouselView carouselView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_menu, container, false);
        ButterKnife.bind(this, vista);

        String [] title={getString(R.string.news), getString(R.string.match), getString(R.string.results), getString(R.string.statistics), getString(R.string.positions), getString(R.string.streaming)};
        String [] body={getString(R.string.newsBody),getString(R.string.matchBody),getString(R.string.resultsBody),getString(R.string.statisticsBody),getString(R.string.positionsBody),getString(R.string.streamingBody)};
        int [] url={R.drawable.four, R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.six,R.drawable.seven};


       //--------------------------------------------------RecyclerView
        RecyclerView recyclerView = (RecyclerView) vista.findViewById(R.id.recycler_menu);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        RecyclerViewClickListener listener = (view, position) -> {
           if(position==0){

               FragmentManager mimanejador=getFragmentManager();
               FragmentTransaction transaccion=mimanejador.beginTransaction();
               Fragment fragmento;
               fragmento = new match();//creamos un fragmment
               transaccion.replace(R.id.fragment_holder, fragmento);
               transaccion.commit();
           }
        };
        recyclerView.setAdapter(new menuItems(title, body, url, getActivity(), listener));


        //-------------------------------------------------CarouselView
        carouselView.setPageCount(galeria.length);
        carouselView.setImageListener(imageListener);

        return vista;
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(galeria[position]);
        }
    };


}

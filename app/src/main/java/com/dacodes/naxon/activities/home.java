package com.dacodes.naxon.activities;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dacodes.naxon.R;
import com.dacodes.naxon.fragments.match;
import com.dacodes.naxon.fragments.menu;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

            cambiafragment(1);

        }


        public void cambiafragment(int seccion){
            FragmentManager mimanejador=getFragmentManager();//creamos un manejador de fragments
            FragmentTransaction transaccion=mimanejador.beginTransaction();//creamos un fragment transaction para cambiar de fragments
            Fragment fragmento;
            if(seccion==1){
                fragmento = new menu();
                transaccion.replace(R.id.fragment_holder, fragmento);//reemplazar
            }else if(seccion==2){
                fragmento = new match();
                transaccion.replace(R.id.fragment_holder, fragmento);//reemplazar
            }
            transaccion.commit();
        }
}

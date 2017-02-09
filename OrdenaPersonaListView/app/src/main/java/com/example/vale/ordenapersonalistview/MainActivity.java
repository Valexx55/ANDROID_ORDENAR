package com.example.vale.ordenapersonalistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Persona> lista_personas;

    private void iniciaListaPersonas ()
    {
        lista_personas = new ArrayList<Persona>();
        Persona p = new Persona("Paco", 32);
        Persona p1 = new Persona("Alba", 28);
        Persona p2 = new Persona("Juan", 22);
        Persona p3 = new Persona("Javi", 23);
        Persona p4 = new Persona("Pedro", 29);
        Persona p5 = new Persona("Jose", 31);

        lista_personas.add(p);
        lista_personas.add(p1);
        lista_personas.add(p2);
        lista_personas.add(p3);
        lista_personas.add(p4);
        lista_personas.add(p5);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().hide();

        iniciaListaPersonas();

        ListView listView = (ListView) findViewById(R.id.lista);


        ListAdapter la = new ArrayAdapter<Persona>(this, R.layout.fila, lista_personas);

        listView.setAdapter(la);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("ORDENDAR POR EDAD");
        menu.add("ORDENDAR POR NOMBRE");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getTitle().equals("ORDENDAR POR EDAD"))
        {
            Collections.sort(lista_personas, new ComparaPersonas());
        } else
        {
            Collections.sort(lista_personas);
        }
        ListView listView = (ListView) findViewById(R.id.lista);
        ListAdapter la = new ArrayAdapter<Persona>(this, R.layout.fila, lista_personas);
        listView.setAdapter(la);

        return true;
    }
}

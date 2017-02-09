package com.example.vale.ordenapersonalistview;

import java.util.Comparator;

/**
 * Created by vale on 8/02/17.
 */
public class ComparaPersonas implements Comparator<Persona>{

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getEdad()-o2.getEdad();
    }
}

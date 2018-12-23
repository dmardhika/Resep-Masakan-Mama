package com.example.dhianadini.resepmasakanmama.data;

import java.util.ArrayList;
import java.util.List;
import com.example.dhianadini.resepmasakanmama.R;

public class Assets {

    private static final List<Integer> food = new ArrayList<Integer>() {{
        add(R.drawable.ayampedas);
        add(R.drawable.ayampenyet);
        add(R.drawable.bakso);
        add(R.drawable.capcayjamur);
        add(R.drawable.miepedas);
        add(R.drawable.nasiuduk);
        add(R.drawable.oremorem);
        add(R.drawable.pecel);
        add(R.drawable.soto);
    }};

    private static final List<Integer> beverages = new ArrayList<Integer>() {{
        add(R.drawable.angsle);
        add(R.drawable.esbuah);
        add(R.drawable.esdurian);
        add(R.drawable.estawon);
        add(R.drawable.esteler);
        add(R.drawable.pisangijo);
        add(R.drawable.wedangronde);

    }};

    private static final List<Integer> dessert = new ArrayList<Integer>() {{
        add(R.drawable.pancake);
        add(R.drawable.eskrim);
        add(R.drawable.donat);
    }};

    private static final List<Integer> all = new ArrayList<Integer>() {{
        addAll(food);
        addAll(beverages);
        addAll(dessert);
    }};


    public static List<Integer> getFood() {
        return food;
    }

    public static List<Integer> getBeverages() {
        return beverages;
    }

    public static List<Integer> getDessert() {
        return dessert;
    }

    public static List<Integer> getAll() {
        return all;
    }
}

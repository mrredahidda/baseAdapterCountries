package com.example.baseadaptertp;

import java.util.ArrayList;

public class Countries {
    private int logo;
    private String name;
    private String capitale;
    private int id;
    private double population;

    public static ArrayList<Countries> lstCountries = new ArrayList<>();

    public Countries(int logo, String name, String capitale, int id, double population) {
        this.logo = logo;
        this.name = name;
        this.capitale = capitale;
        this.id = id;
        this.population = population;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapitale() {
        return capitale;
    }

    public void setCapitale(String capitale) {
        this.capitale = capitale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }
}

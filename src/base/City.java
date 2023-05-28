package base;

import java.util.ArrayList;

public class City {

    private ArrayList<Clues> clues;
    private String cityName;

    public City(ArrayList<Clues> clues, String cityName) {
        this.clues = clues;
        this.cityName = cityName;
    }

    public ArrayList<Clues> getClues() {
        return clues;
    }

    public String getCityName() {
        return cityName;
    }

}
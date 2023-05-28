package base;
import java.util.ArrayList;

public class CitiesImage {

    private ArrayList<String> citiesImage = new ArrayList<>(); //arraylist that stores strings, cities names

    //constructor where are the strings added to the arraylist

    CitiesImage() {

        citiesImage.add("");
        citiesImage.add("New York");
        citiesImage.add("Los Angeles");
        citiesImage.add("Prague");
        citiesImage.add("Vienna");
        citiesImage.add("Paris");
        citiesImage.add("Berlin");
        citiesImage.add("Tokyo");
        citiesImage.add("Barcelona");

    }
    public String getCity(int cityNumber){
        return citiesImage.get(cityNumber);
    }
}

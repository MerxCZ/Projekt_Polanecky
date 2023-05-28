package base;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
public class GeneratingClues {

    // Arraylists with clues for each city
    ArrayList<Clues> prague = new ArrayList<>();   // Arraylist where are the clues for prague stored
    ArrayList<Clues> nyc = new ArrayList<>();      // Arraylist where are the clues for nyc stored
    ArrayList<Clues> paris = new ArrayList<>();    // Arraylist where are the clues for paris stored
    ArrayList<Clues> rome = new ArrayList<>();     // Arraylist where are the clues for rome stored
    ArrayList<Clues> vienna = new ArrayList<>();   // Arraylist where are the clues for vienna stored
    ArrayList<Clues> berlin = new ArrayList<>();   // Arraylist where are the clues for berlin stored
    ArrayList<Clues> la = new ArrayList<>();       // Arraylist where are the clues for la stored
    ArrayList<Clues> barcelona = new ArrayList<>();       // Arraylist where are the clues for barcelona stored
    ArrayList<Clues> london = new ArrayList<>();       // Arraylist where are the clues for london stored
    ArrayList<Clues> brno = new ArrayList<>();       // Arraylist where are the clues for london stored
    ArrayList<Clues> warsaw = new ArrayList<>();       // Arraylist where are the clues for warsaw stored
    ArrayList<Clues> moscow = new ArrayList<>();       // Arraylist where are the clues for moscow stored
    ArrayList<Clues> tokyo = new ArrayList<>();       // Arraylist where are the clues for tokyo stored
    ArrayList<Clues> budapest = new ArrayList<>();       // Arraylist where are the clues for budapest stored
    ArrayList<Clues> madrid = new ArrayList<>();       // Arraylist where are the clues for madrid stored
    ArrayList<Clues> amsterdam = new ArrayList<>();       // Arraylist where are the clues for amsterdam stored
    ArrayList<Clues> athens = new ArrayList<>();       // Arraylist where are the clues for athens stored
    ArrayList<Clues> dublin = new ArrayList<>();       // Arraylist where are the clues for dublin stored
    ArrayList<Clues> stockholm = new ArrayList<>();       // Arraylist where are the clues for stockholm stored
    ArrayList<Clues> helsinki = new ArrayList<>();       // Arraylist where are the clues for helsinki stored
    ArrayList<Clues> oslo = new ArrayList<>();       // Arraylist where are the clues for oslo stored
    ArrayList<Clues> copenhagen = new ArrayList<>();       // Arraylist where are the clues for copenhagen stored

    Random rn = new Random();


    //generating clues, assigns value to them and storing them into arraylist
    public GeneratingClues() {
        prague.add(new Clues("In this city you can see a building which looks like two people dancing.", 3));
        prague.add(new Clues("Famous Charles Bridge is located in this city.", 2));
        prague.add(new Clues("The city is a capital city of Czech Republic.", 1));

        nyc.add(new Clues("In this city there is Times Square.", 3));
        nyc.add(new Clues("In this city you can find a Wall Street known for finance and stock market. " , 2));
        nyc.add(new Clues("Famous Statue of Liberty is in this city.", 1));

        paris.add(new Clues("The River Seine flows through this city.", 3));
        paris.add(new Clues("The Mona Lisa painting is located in Louvre museum in this city.", 2));
        paris.add(new Clues("The city is a capital city of France.", 1));

        rome.add(new Clues("Inside this city there is located another country called Vatican.", 3));
        rome.add(new Clues("In this city you can find a famous building Colosseum.", 2));
        rome.add(new Clues("The city is a capital city of Italy.", 1));

        vienna.add(new Clues("Johann Strauss I was born in this city.", 3));
        vienna.add(new Clues("The lunapark Prather is located in this city.", 2));
        vienna.add(new Clues("The city is a capital city of Austria.", 1));

        berlin.add(new Clues("In this city you can find the East Side Gallery. ", 3));
        berlin.add(new Clues("This city is known for the Brandenburg Gate, symbol of peace during end of WW2.", 2));
        berlin.add(new Clues("The city is a capital city of Germany.", 1));

        la.add(new Clues("On the coastline of this city you can find Santa Monica and Venice Beach.", 3));
        la.add(new Clues("This city is home to the iconic Hollywood Sign.", 2));
        la.add(new Clues("In this city you can see The Walk of Fame, located along Hollywood Boulevard.", 1));

        barcelona.add(new Clues("This city is known for the Park Guell.", 3));
        barcelona.add(new Clues("In this city you can find the Sagrada Familia.", 2));
        barcelona.add(new Clues("The city is a capital city of Spain.", 1));

        london.add(new Clues("This city is known for the Big Ben.", 3));
        london.add(new Clues("In this city you can find the London Eye.", 2));
        london.add(new Clues("The city is a capital city of England.", 1));

        brno.add(new Clues("In this city you can find the Cathedral of St. Peter and Paul.", 3));
        brno.add(new Clues("This city is known for the Spilberk Castle.", 2));
        brno.add(new Clues("The city is a capital city of Moravia.", 1));

        warsaw.add(new Clues("In this city you can find the Palace of Culture and Science.", 3));
        warsaw.add(new Clues("This city is known for the Old Town Market Place.", 2));
        warsaw.add(new Clues("The city is a capital city of Poland.", 1));

        moscow.add(new Clues("In this city you can find the Red Square.", 3));
        moscow.add(new Clues("This city is known for the Kremlin.", 2));
        moscow.add(new Clues("The city is a capital city of Russia.", 1));

        tokyo.add(new Clues("In this city you can find the Huge Tower.", 3));
        tokyo.add(new Clues("This city is known for the Skytree.", 2));
        tokyo.add(new Clues("The city is a capital city of Japan.", 1));

        budapest.add(new Clues("In this city you can find the Chain Bridge.", 3));
        budapest.add(new Clues("This city is known for the Buda Castle.", 2));
        budapest.add(new Clues("The city is a capital city of Hungary.", 1));

        madrid.add(new Clues("In this city you can find the Royal Palace.", 3));
        madrid.add(new Clues("This city is known for the Plaza Mayor.", 2));
        madrid.add(new Clues("The city is a capital city of Spain.", 1));

        amsterdam.add(new Clues("In this city you can find the Rijksmuseum.", 3));
        amsterdam.add(new Clues("This city is known for the Van Gogh Museum.", 2));
        amsterdam.add(new Clues("The city is a capital city of Netherlands.", 1));

        stockholm.add(new Clues("In this city you can find the Vasa Museum.", 3));
        stockholm.add(new Clues("This city is known for the Ikea store.", 2));
        stockholm.add(new Clues("The city is a capital city of Sweden.", 1));

        oslo.add(new Clues("In this city you can find the Viking Ship Museum.", 3));
        oslo.add(new Clues("This city is known for the Holmenkollen Ski Museum.", 2));
        oslo.add(new Clues("The city is a capital city of Norway.", 1));

        helsinki.add(new Clues("In this city you can find the Suomenlinna.", 3));
        helsinki.add(new Clues("This city is known for the Seurasaari Open-Air Museum.", 2));
        helsinki.add(new Clues("The city is a capital city of Finland.", 1));

        copenhagen.add(new Clues("In this city you can find the Tivoli Gardens.", 3));
        copenhagen.add(new Clues("This city is known for the National Museum of Denmark.", 2));
        copenhagen.add(new Clues("The city is a capital city of Denmark.", 1));

        athens.add(new Clues("In this city you can find the Acropolis.", 3));
        athens.add(new Clues("This city is known for the Parthenon.", 2));
        athens.add(new Clues("The city is a capital city of Greece.", 1));

        dublin.add(new Clues("In this city you can office of the Ryanair airline.", 3));
        dublin.add(new Clues("This city is known for the St. Patrick's Cathedral.", 2));
        dublin.add(new Clues("The city is a capital city of Ireland.", 1));
    }


    //arraylist that stores all cities with clues and then picks one random arraylist
    public City randomCity() {

        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City(prague, "Prague"));
        cities.add(new City(nyc, "New York"));
        cities.add(new City(paris, "Paris"));
        cities.add(new City(rome, "Rome"));
        cities.add(new City(vienna, "Vienna"));
        cities.add(new City(berlin, "Berlin"));
        cities.add(new City(la, "Los Angeles"));
        cities.add(new City(barcelona, "Barcelona"));
        cities.add(new City(london, "London"));
        cities.add(new City(brno, "Brno"));
        cities.add(new City(warsaw, "Warsaw"));
        cities.add(new City(moscow, "Moscow"));
        cities.add(new City(tokyo, "Tokyo"));
        cities.add(new City(budapest, "Budapest"));
        cities.add(new City(madrid, "Madrid"));
        cities.add(new City(amsterdam, "Amsterdam"));
        cities.add(new City(stockholm, "Stockholm"));
        cities.add(new City(oslo, "Oslo"));
        cities.add(new City(helsinki, "Helsinki"));
        cities.add(new City(copenhagen, "Copenhagen"));
        cities.add(new City(athens, "Athens"));
        cities.add(new City(dublin, "Dublin"));


        int index = rn.nextInt(cities.size());

        return cities.get(index);
    }
}


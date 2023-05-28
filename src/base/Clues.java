package base;

public class Clues {

    private String text;
    private int points;


    public Clues(String text, int points) {
        this.text = text;
        this.points = points;
    }

    public String getText() {
        return text;
    }

    public int getPoints() {
        return points;
    }

}

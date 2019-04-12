import processing.core.PApplet;

public class Term {

    private PApplet p;
    private String value;
    private int numTimes;

    public Term(PApplet p, String word, int numTimes) {
        this.p = p;
        value = word;
        this.numTimes = numTimes;
    }

    public void display(float x, float y) {
        p.fill(PApplet.map(numTimes, 1, 10, 80, 0));
        p.textSize(PApplet.map(numTimes, 1, 10, 10, 40));
        p.text(value, x, y);
    }
}
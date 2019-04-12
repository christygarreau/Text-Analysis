import processing.core.PApplet;
import java.util.ArrayList;

public class TextAnalysisMain extends PApplet {

    private static WordBank wordBank;
    private ArrayList<Term> terms;

    public static void main(String[] args) {
        PApplet.main("TextAnalysisMain");
    }

    public TextAnalysisMain() {}

    public void settings() {
        size(1000,500);
    }

    public void setup() {
        textAlign(CENTER, CENTER);
        wordBank = new WordBank(this);
        wordBank.sort();
    }

    public void draw() {
        background(0);
        stroke(0);
        ArrayList<WordOccurrence> wordOccurrences = wordBank.getWordOccurrences();
        for(WordOccurrence wordOccurrence : wordOccurrences){
            float x = random(width);
            float y = random(height);
            float diameter = wordOccurrence.getOccurrences();
            noFill();
            //ellipse(x,y,diameter, diameter);

            textAlign(CENTER);
            textSize(diameter/50);
            fill(color(random(255),random(255),random(255)));
            text(wordOccurrence.getWord(),x,y);
        }
        noLoop();
    }
}
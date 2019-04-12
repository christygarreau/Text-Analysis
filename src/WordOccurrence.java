public class WordOccurrence {
    private String word;
    private int occurrences;

    public WordOccurrence(String word, int occurrences){
        this.word = word;
        this.occurrences = occurrences;
    }

    public int getOccurrences(){
        return occurrences;
    }

    public String getWord(){
        return word;
    }

}

package codegym.designpattern.adapter;

public class EnglishAdaptee {
    public void receive(String words) {
        System.out.println("Retrieving words from Adapter ...");
        System.out.println(words);
    }
}

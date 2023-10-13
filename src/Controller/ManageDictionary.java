package Controller;

import java.util.ArrayList;

import Common.Algorithm;
import Model.Dictionary;
import Views.Menu;

public class ManageDictionary extends Menu<String> {
    static String[] options = { "Add new word", "Delete word", "Search word", "Exit" };
    Algorithm algorithm = new Algorithm();
    ArrayList<Dictionary> dataDictionaries = new ArrayList<>();

    public ManageDictionary() {
        super("============ Dictionary program ============", options);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                algorithm.addNewWord(dataDictionaries);
                break;
            case 2:
                System.out.println(algorithm.delete(dataDictionaries));
                break;
            case 3:
                System.out.println(algorithm.translate(dataDictionaries));
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
    public static void main(String[] args) {
        new ManageDictionary().run();
    }

}

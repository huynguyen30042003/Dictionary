package Common;

import java.util.ArrayList;

import Model.Dictionary;

public class Algorithm {
    public boolean isHave(ArrayList<Dictionary> dataDictionaries, String target) {
        for (Dictionary dictionary : dataDictionaries) {
            if (dictionary.getEndlishWord().toLowerCase().equals(target.toLowerCase()))
                return true;
        }
        return false;
    }

    public boolean isContinue(String quetion, String ans1, String ans2) {
        String is;
        do {
            is = Library.validString(quetion);
        } while (!is.equalsIgnoreCase(ans1) && !is.equalsIgnoreCase(ans2));
        return is.equalsIgnoreCase(ans1);
    }

    public void addNewWord(ArrayList<Dictionary> dataDictionaries) {
        do {
            System.out.println("------------- Add -------------");
            Dictionary dictionary = new Dictionary();
            dictionary.input();
            if (isHave(dataDictionaries, dictionary.getEndlishWord())) {
                System.out.println("Dictionary had word");
            } else {
                System.out.println("Successful");
                dataDictionaries.add(dictionary);
            }
        } while (isContinue("Do you want to add?(Y/N)", "Y", "N"));
    }

    public String delete(ArrayList<Dictionary> dataDictionaries) {
        System.out.println("------------ Delete ----------------");
        String target = Library.validString("Enter English");
        for (int i = 0; i < dataDictionaries.size(); i++) {
            if (dataDictionaries.get(i).getEndlishWord().toLowerCase().equals(target.toLowerCase())) {
                dataDictionaries.remove(i);
                return "Successful.";
            }
        }
        return "does not exist in the db key.";
    }

    public String translate(ArrayList<Dictionary> dataDictionaries) {
        System.out.println("------------- Translate ------------");
        String target = Library.validString("Enter English");
        for (int i = 0; i < dataDictionaries.size(); i++) {
            if (dataDictionaries.get(i).getEndlishWord().toLowerCase().equals(target.toLowerCase())) {
                return "Vietnamese: " + dataDictionaries.get(i).getVietnamWord();
            }
        }
        return "Display empty.";
    }
}

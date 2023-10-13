package Model;

import Common.Library;

public class Dictionary {
    private String endlishWord;
    private String vietnamWord;

    public Dictionary() {
    }

    public Dictionary(String endlishWord, String vietnamWord) {
        this.endlishWord = endlishWord;
        this.vietnamWord = vietnamWord;
    }

    public String getEndlishWord() {
        return endlishWord;
    }

    public void setEndlishWord(String endlishWord) {
        this.endlishWord = endlishWord;
    }

    public String getVietnamWord() {
        return vietnamWord;
    }

    public void setVietnamWord(String vietnamWord) {
        this.vietnamWord = vietnamWord;
    }

    public void input() {
        setEndlishWord(Library.validString("Enter English"));
        setVietnamWord(Library.validString("Enter Vietnamese"));
    }

    @Override
    public String toString() {
        return "Dictionary [endlishWord=" + endlishWord + ", vietnamWord=" + vietnamWord + "]";
    }

}

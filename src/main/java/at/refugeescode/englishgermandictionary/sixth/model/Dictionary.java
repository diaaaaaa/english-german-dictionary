package at.refugeescode.englishgermandictionary.sixth.model;

import org.springframework.stereotype.Component;

@Component
public class Dictionary {
    private String englishWord;
    private String germanWord;

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getGermanWord() {
        return germanWord;
    }

    public void setGermanWord(String germanWord) {
        this.germanWord = germanWord;
    }

    @Override
    public String toString() {

        return "Dictionary{" +
                "englishWord='" + englishWord + '\'' +
                ", germanWord='" + germanWord + '\'' +
                '}';
    }
}

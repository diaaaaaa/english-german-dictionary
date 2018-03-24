package at.refugeescode.englishgermandictionary.sixth.controller;

import at.refugeescode.englishgermandictionary.sixth.model.Dictionary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LookUpWord {
    public String lookup(String word) {

        WordsParser wordsParser = new WordsParser();

        List<Dictionary> wordsInDictionary = wordsParser.getWords();
        return wordsInDictionary.stream()
                .filter(e-> e.getEnglishWord().equalsIgnoreCase(word))
                .map(e-> e.getGermanWord())
                .collect(Collectors.joining(""));

    }
}

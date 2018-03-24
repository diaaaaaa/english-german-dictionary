package at.refugeescode.englishgermandictionary.sixth.controller;

import at.refugeescode.englishgermandictionary.sixth.model.Dictionary;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class WordsParser {

    public List<Dictionary>getWords(){

    String filePath="src\\main\\java\\at\\refugeescode\\englishgermandictionary\\sixth\\data\\dictionary";
    Stream<String> dict;

    {
        try {
            dict = Files.lines(Paths.get(filePath));
            return dict.skip(1)
                    .map(line -> line.split(":"))
                    .map(toDict())
                    .collect(Collectors.toList());


        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
    }

    private Function<String[],Dictionary> toDict() {

        return columns -> {
            Dictionary dictionary = new Dictionary();
            dictionary.setEnglishWord(columns[0]);
            dictionary.setGermanWord(columns[1]);
            return dictionary;
        };
    }
}

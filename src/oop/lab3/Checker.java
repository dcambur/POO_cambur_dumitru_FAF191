package oop.lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Checker {
    private String Path;
    private final WordDictionary Dict;
    // Constructor
    public Checker(String path, WordDictionary dict) {
        this.Path = path;
        this.Dict = dict;
    }

    public int wordCount() {
        int count = 0;
        String text = scanFile();
        String[] splitWords = text.split("[ .,?!\n;:']+");
        for (String splitWord : splitWords) {
            if (this.Dict.Dictionary.contains(splitWord.toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    public void frequencyTop(int n) {
        String text = scanFile();
        String[] splitWords = text.split("[ .,?!\n;:']+");
        Map<String, Long> miniMap = new HashMap<>();
        for (String splitWord : splitWords) {
            miniMap.compute(splitWord, (k, v) -> v == null ? 1 : v + 1);
        }
        int count = 0;
        Map<String, Long> sortedMiniMap = miniMap
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                        LinkedHashMap::new));
        for (Map.Entry<String, Long> entry : sortedMiniMap.entrySet()) {
            if (count >= n) { break; }
            System.out.println(entry.getKey() + " : " + "Counted " + entry.getValue());
            count++;
        }
    }
    private String scanFile() {
        File file = new File(this.Path);
        Scanner scan = null;
        try {
            scan = new Scanner(file);
            StringBuilder info = new StringBuilder();
            while (scan.hasNextLine()) {
                info.append(scan.nextLine()).append("\n");
            }
            return info.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return "Sorry, error";
    }

    public int sentenceNumber() {
        String text = scanFile();
        return text.split("[?!.;]+").length - 1 ;
    }

    public int letterLength() {
        int count = 0;
        String text = scanFile();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)))
                count++;
        }
        return count;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        this.Path = path;
    }

}

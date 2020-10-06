package oop.lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

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

    public int frequencyTop(int n) {
        String text = scanFile();
        String[] splitWords = text.split("[ .,?!\n;:']+");
        EqualWords[] equalsFreq;
        for (String splitWord: splitWords) {
            if (splitWord )
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

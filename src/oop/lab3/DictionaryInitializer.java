package oop.lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class DictionaryInitializer {
    private String Path;
    private final File File;
    private Scanner ScanFile;
    private HashSet<String> Dict = new HashSet<String>();

    public DictionaryInitializer(String path) {
        this.Path = path;
         this.File = new File(this.Path);
        try {
            this.ScanFile = new Scanner(this.File);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (this.ScanFile.hasNextLine()) {
            this.Dict.add(this.ScanFile.nextLine());
        }
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public java.io.File getFile() {
        return File;
    }

    public Scanner getScanFile() {
        return ScanFile;
    }

    public void setScanFile(Scanner scanFile) {
        ScanFile = scanFile;
    }

    public HashSet<String> getDict() {
        return Dict;
    }

    public void setDict(HashSet<String> dict) {
        Dict = dict;
    }
}


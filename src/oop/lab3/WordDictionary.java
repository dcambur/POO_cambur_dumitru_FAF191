package oop.lab3;

import java.util.HashSet;

public class WordDictionary {
    public HashSet<String> Dictionary;
    public WordDictionary(DictionaryInitializer init) {
        this.Dictionary = init.getDict();
    }
}

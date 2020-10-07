package oop.lab3;

public class Main {

    public void display() {
        System.out.println("Calculating Method execution time:");
    }

    public static void main(String[] args) {


        Main obj = new Main();
        long start = System.nanoTime();
        obj.display();

        DictionaryInitializer init = new DictionaryInitializer("/home/dima/IdeaProjects/oop_labs/src/oop/lab3/english3.txt");
        WordDictionary dictionary = new WordDictionary(init);
        Checker check = new Checker("/home/dima/IdeaProjects/oop_labs/src/oop/lab3/heya", dictionary);

        System.out.println("Sentence Number: " + check.sentenceNumber());
        System.out.println("Word Count: " + check.wordCount());
        System.out.println("Letter Count: " + check.letterLength());
        System.out.println("Vowels Count: " + check.countVowels());
        System.out.println("Consonants Count: " + check.countConsonants());


        check.frequencyTop(5);
        long end = System.nanoTime();
        long execution = (end - start)/1_000_000_000;
        System.out.println("Execution time: " + execution + " seconds");
    }
}

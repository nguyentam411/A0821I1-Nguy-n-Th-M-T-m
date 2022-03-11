package service;

import model.Word;
import org.springframework.beans.MutablePropertyValues;

import java.util.ArrayList;
import java.util.List;

public class WordService {
    static List<Word> wordList=new ArrayList<>();
    static {
        wordList.add(new Word("blue","màu xanh dương"));
        wordList.add(new Word("red","màu đỏ"));
        wordList.add(new Word("yellow","màu vàng"));
    }

    public static List<Word> getWordList() {
        return wordList;
    }
}

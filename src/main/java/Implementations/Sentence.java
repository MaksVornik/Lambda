package Implementations;

import Interfaces.PrintAnySentence;

public class Sentence<T> implements PrintAnySentence<T> {


    @Override
    public T anySentence(T sentence) {
        return sentence;
    }
}

package org.etw.EscapeTheWoods;

import java.util.ArrayList;

public class Tokenizer {
    private final String in;
    private ArrayList<Token> toks;

    public Tokenizer(String in) {
        this.in = in;
        this.toks = new ArrayList<>();
    }

    public String getIn() {
        return this.in;
    }

    public ArrayList<Token> getToks() {
        return this.toks;
    }
}

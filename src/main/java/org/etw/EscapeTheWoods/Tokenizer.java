package org.etw.EscapeTheWoods;

import java.util.ArrayList;

public class Tokenizer {
    private final String in;
    private ArrayList<Token> toks;
    private StringBuilder builder;

    public Tokenizer(String in) {
        this.in = in.toLowerCase();
        this.toks = new ArrayList<>();
        this.builder = new StringBuilder();
    }

    private Token identifier(int start, int end) throws IllegalArgumentException {
        return switch (builder.toString()) {
            case "y", "yes" -> new Token(
                TokenType.YES,
                builder.toString(),
                start, end
            );
            case "n", "no"  -> new Token(
                TokenType.NO,
                builder.toString(),
                start, end
            );
            case "h", "help" -> new Token(
                TokenType.HELP,
                builder.toString(),
                start, end
            );
            default         -> throw new IllegalArgumentException("How did you get here?");
        };
    }

    public ArrayList<Token> tokenize() {
        int idx = 0;

        while (idx < in.length()) {
            char curr = in.charAt(idx);
            int start = idx;
            if (Character.isWhitespace(curr)) {
                builder = new StringBuilder();
                if (curr == '\n') {
                    builder = new StringBuilder();
                    toks.add(new Token(TokenType.EOI, "\n", start, idx));
                    break;
                }
                while (Character.isWhitespace(curr)) {
                    curr = in.charAt(++idx);
                }
            } else if (Character.isAlphabetic(curr)) {
                while (Character.isAlphabetic(curr)) {
                    builder.append(curr);
                    curr = in.charAt(++idx);
                }
                toks.add(identifier(start, idx));
            } else {
                System.out.println("What are you doing man?");
                break;
            }
        }

        return this.toks;
    }

    public String getIn() {
        return this.in;
    }

    public ArrayList<Token> getToks() {
        return this.toks;
    }
}

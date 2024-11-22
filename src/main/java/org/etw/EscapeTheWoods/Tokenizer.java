package org.etw.EscapeTheWoods;

import java.util.ArrayList;

/**
 * The tokenizer class for user input.
 * @see Token
 */
public class Tokenizer {
    private final String in;
    private ArrayList<Token> toks;
    private StringBuilder builder;

    /**
     * The normative constructor for the class.
     * @param in The string or file to be read in.
     */
    public Tokenizer(String in) {
        this.in = in.toLowerCase();
        this.toks = new ArrayList<>();
        this.builder = new StringBuilder();
    }

    /**
     * Generates an identifier token.
     * @param start The start column.
     * @param end The end column.
     * @return The generated and constructed identifier token.
     * @throws IllegalArgumentException In case of an error, throws.
     * @see Token
     */
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
            default         -> new Token(
                TokenType.ERROR,
                builder.toString(),
                start, end
            );
        };
    }

    /**
     * Runs the tokenization process.
     * @return The list of tokens that were generated.
     * @see Token
     */
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

    /**
     * Gets the input string.
     * @return The input string.
     */
    public String getIn() {
        return this.in;
    }

    /**
     * Gets the token list.
     * @return The token list.
     */
    public ArrayList<Token> getToks() {
        return this.toks;
    }
}

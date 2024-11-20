package org.etw.EscapeTheWoods;

/**
 * <b>This SHOULD NOT be constructed anywhere other than the tokenizer class!</b>
 * <p>
 * A class that represents a singular unit of user input.
 * It cannot be inherited from, and that is intentional.
 * @see Tokenizer
 * @see TokenType
 */
public final class Token {
    private final TokenType type;
    private final String content;
    private final int[] span = new int[2];

    /**
     * Normative constructor for the class.
     * @param type The type of the token.
     * @param content The content of the token.
     * @param start The start column of the token.
     * @param end The end column of the token.
     * @see TokenType
     */
    public Token(TokenType type, String content, int start, int end) {
        this.type = type;
        this.content = content;
        this.span[0] = start;
        this.span[1] = end;
    }

    /**
     * Returns the type of the token.
     * @return The token type.
     * @see TokenType
     */
    public TokenType getType() {
        return this.type;
    }

    /**
     * Generates a string for this class.
     */
    public String toString() {
        var builder = new StringBuilder();

        builder.append("Type: ");
        builder.append(switch (type) {
            case YES  -> "YES; ";
            case NO   -> "NO; ";
            case HELP -> "HELP; ";
            case EOI  -> "EOI; ";
        });
        builder.append("Content: ");
        builder.append(content + " ");

        return builder.toString();
    }
}

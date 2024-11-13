package org.etw.EscapeTheWoods;

public final class Token {
    private final TokenType type;
    private final String content;
    private final int[] span = new int[2];

    public Token(TokenType type, String content, int start, int end) {
        this.type = type;
        this.content = content;
        this.span[0] = start;
        this.span[1] = end;
    }

    public TokenType getType() {
        return this.type;
    }

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

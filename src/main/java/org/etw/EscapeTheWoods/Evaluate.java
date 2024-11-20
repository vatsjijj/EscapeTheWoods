package org.etw.EscapeTheWoods;

import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;

/**
 * This is an evaluation class for user input.
 * @see ProgramResult
 * @see Token
 */
public final class Evaluate {
    /**
     * Evaluates the list of tokens and returns a singular result back on top.
     * @param toks The list of tokens to evaluate.
     * @return The result of the user input.
     * @see Token
     */
    public static ProgramResult eval(ArrayList<Token> toks) {
        Queue<ProgramResult> results = new ArrayDeque<>();
        for (var i : toks) {
            results.add(switch (i.getType()) {
                case YES  -> new ProgramResult.Yes();
                case NO   -> new ProgramResult.No();
                case HELP -> new ProgramResult.Help();
                case EOI  -> new ProgramResult.Yes();
                default   -> new ProgramResult.Error("Invalid token.");
            });
        }
        return results.peek();
    }
}

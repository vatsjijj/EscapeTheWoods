package org.etw.EscapeTheWoods;

import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;

public final class Evaluate {
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

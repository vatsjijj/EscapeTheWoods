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
    public static ProgramResult eval(ArrayList<Token> toks, Player player) {
        Queue<ProgramResult> results = new ArrayDeque<>();
        for (int i = 0; i < toks.size(); i++) {
            ProgramResult tRes;
            var item = toks.get(i);
            switch (item.getType()) {
                case INV: tRes = new ProgramResult.Inventory(); break;
                case STATS: tRes = new ProgramResult.Stats(); break;
                case EAT:
                    StringBuilder builder = new StringBuilder();
                    i++;
                    item = toks.get(i);
                    if (item.getType() == TokenType.ID) {
                        while (item.getType() == TokenType.ID) {
                            builder.append(item.getContent() + " ");
                            i++;
                            item = toks.get(i);
                        }
                    }
                    tRes = new ProgramResult.Eat(
                        player.findItem(builder.toString())
                    );
                    break;
                case YES: 
                    tRes = new ProgramResult.Yes();
                    break;
                case NO: 
                    tRes = new ProgramResult.No();
                    break;
                case HELP: 
                    tRes = new ProgramResult.Help();
                    break;
                case EOI: 
                    tRes = new ProgramResult.Yes();
                    break;
                default: 
                    tRes = new ProgramResult.Error("Invalid token.");
                    break;
            }
            results.add(tRes);
        }
        return results.peek();
    }
}

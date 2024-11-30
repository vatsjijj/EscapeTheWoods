package org.etw.EscapeTheWoods;

/**
 * An interface for program results, good for user interaction,
 * and also program state. It's used in a pretty unique way:
 * <pre>
 * {@code
 *ProgramResult.Yes();
 *ProgramResult.No();
 *ProgramResult.Help();
 * }
 * </pre>
 * The error type is used in a different way:
 * <pre>
 * {@code
 *ProgramResult.Error("error message");
 * }
 * </pre>
 * @see Evaluate
 */
public sealed interface ProgramResult {
    record Yes() implements ProgramResult {};
    record No() implements ProgramResult {};
    record Help() implements ProgramResult {};
    record Inventory() implements ProgramResult {};
    record Stats() implements ProgramResult {};
    record Eat(int index) implements ProgramResult {};
    record Error(String msg) implements ProgramResult {};
}

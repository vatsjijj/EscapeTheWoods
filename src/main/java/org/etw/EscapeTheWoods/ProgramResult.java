package org.etw.EscapeTheWoods;

public sealed interface ProgramResult {
    record Yes() implements ProgramResult {};
    record No() implements ProgramResult {};
    record Help() implements ProgramResult {};
    record Error(String msg) implements ProgramResult {};
}

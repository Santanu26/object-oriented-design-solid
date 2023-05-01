package org.example.liskov_substitution.correct_way;

public abstract class Member implements TournamentJoiner, TournamentOrganizer{
    private final String name;

    protected Member(String name) {
        this.name = name;
    }
}

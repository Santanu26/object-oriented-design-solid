package org.example.liskov_substitution.violation;

public abstract class Member {
    private final String name;

    public Member(String name) {
        this.name = name;
    }

    public abstract void joinTournament(String name);
    public abstract void organizeTournament(String name);
}

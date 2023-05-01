package org.example.liskov_substitution.correct_way;

public class FreeMember implements TournamentJoiner{

    private final String name;

    public FreeMember(String name) {
        this.name = name;
    }


    @Override
    public void joinTournament() {
        System.out.println(getClass().getName() + "Member can join Tournament");
    }
}

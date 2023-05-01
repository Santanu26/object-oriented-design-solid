package org.example.liskov_substitution.violation;

public class FreeMember extends Member{
    public FreeMember(String name) {
        super(name);
    }

    @Override
    public void joinTournament(String name) {
        System.out.println(getClass().getName()+ " member can join Tournament");
    }

    // violate the rule
    @Override
    public void organizeTournament(String name) {
        System.out.println(getClass().getName()+ "member can not organize Tournament");
    }
}

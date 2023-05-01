package org.example.liskov_substitution.correct_way;

public class VipMember extends Member {

    protected VipMember(String name) {
        super(name);
    }

    @Override
    public void joinTournament() {
        System.out.println(getClass().getName()+"Member can join tournament");
    }

    @Override
    public void organizeTournament() {
        System.out.println(getClass().getName()+"Member can organize tournament");
    }
}

package org.example.liskov_substitution.violation;

public class VipMember extends Member{
    public VipMember(String name) {
        super(name);
    }

    @Override
    public void joinTournament(String name) {
        System.out.println(getClass().getName() +" member can joins Tournament");
    }

    @Override
    public void organizeTournament(String name) {
        System.out.println(getClass().getName()+ "Member can organize Tournament");

    }
}

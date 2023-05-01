package org.example.liskov_substitution.violation;

public class PremiumMember extends Member{
    public PremiumMember(String name) {
        super(name);
    }

    @Override
    public void joinTournament(String name) {
        System.out.println(getClass().getName() + "Member joins Tournament");
    }

    @Override
    public void organizeTournament(String name) {
        System.out.println(getClass().getName()+ " Member can organize Tournament");

    }
}

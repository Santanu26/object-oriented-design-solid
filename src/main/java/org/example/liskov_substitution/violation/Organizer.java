package org.example.liskov_substitution.violation;

import java.util.List;

public class Organizer {

    // complete violation the principle
    List<Member> members = List.of(new PremiumMember("Jack"),
            new VipMember("Tom john"),
            new FreeMember("Martin"));

}

package org.example.liskov_substitution.correct_way;

import java.util.List;

public class Organizer {

    List<TournamentJoiner> joiners = List.of(
            new PremiumMember("Jack"),
            new FreeMember("Martin"),
            new VipMember("Ashim"));

    List<TournamentOrganizer> organizers = List.of(
            new PremiumMember("jack"),
            new VipMember("Martin"));
}

package Day_23_Sets;

import java.util.HashSet;

public class _01_Task1_1 {
    // let's say we have a company with 2 teams:
    // team devs: Jon, Austin, Shane, Kyle, Max
    // team testers: Austin, Max, Douglas, Arya, Alice

    // find out how many people are working in the company and who are they
    // create a method that returns set of unique people -> public static HashSet<String> uniqueMembers(HashSet<String> teamA, HashSet<String> teamB) {
    // then print the set and the size of the set -> main method

    // find out how many ppl are working in both teams and who are they

    // find out how many ppl are working in single team only, and who are they
    public static void main(String[] args) {

        HashSet<String> devsTeam = new HashSet<>();
        HashSet<String> testersTeam = new HashSet<>();

        addAll(devsTeam, "Jon", "Austin", "Shane", "Kyle", "Max");
        addAll(testersTeam, "Austin", "Max", "Douglas", "Arya", "Alice");
        System.out.println("The size of Developers team is: " + devsTeam.size());
        System.out.println("Developers team " + devsTeam);

        System.out.println();

        System.out.println("The size of Testers team is: " + testersTeam.size());
        System.out.println("Testers team " + testersTeam);
        HashSet<String> setOfUniqueMembers = setOfUniqueMembers(devsTeam, testersTeam);
        System.out.println("Unique members " + setOfUniqueMembers);

        HashSet<String> intersectionTeamAAndTeamB = intersection(devsTeam, testersTeam);
        System.out.println("This people work in both team " + intersectionTeamAAndTeamB);

        HashSet<String> differences = differences(devsTeam, testersTeam);
        System.out.println(differences);

    }

    public static HashSet<String> setOfUniqueMembers(HashSet<String> teamA, HashSet<String> teamB){
        HashSet<String> result = new HashSet<>();
        result.addAll(teamA);
        result.addAll(teamB);
        return result;
    }

    public static void addAll(HashSet<String> set, String... elements){
        for (int i = 0; i < elements.length; i++) {
            set.add(elements[i]);
        }
    }
    public static HashSet<String> intersection(HashSet<String> teamA, HashSet<String> teamB){
        HashSet<String> result = new HashSet<>();
        result.addAll(teamA);
        result.retainAll(teamB);
        return result;
    }

    public static HashSet<String> differences(HashSet<String> teamA, HashSet<String> teamB){
        // find all unique members
        HashSet<String> uniqueMembers = setOfUniqueMembers(teamA, teamB);
        // find all intersecting members
        HashSet<String> intersectingMembers = intersection(teamA, teamB);
        // then remove from unique members all intersecting members
        uniqueMembers.removeAll(intersectingMembers);
        return uniqueMembers;
    }
}

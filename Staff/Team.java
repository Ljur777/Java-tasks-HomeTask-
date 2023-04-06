package Staff;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Team<T extends People> {
    private String TeamName;
    List<T> peoples = new ArrayList<T>();

    public Team(String TeamName) {
        this.TeamName = TeamName;
    }


    public void addNewTeamPlayer(T people) {
        peoples.add(people);
        System.out.println("Added new team's player: " + TeamName + ": "
                + people.getName());
    }

    public void deleteTeamPlayer(T people) {
        peoples.remove(people);
        System.out.println("Deleted team's player: " + TeamName + ": "
                + people.getName());
    }

    public void searchTeamPlayer(T people) {
        peoples.contains(people);
        System.out.println("Found team's player: " + TeamName + ": "
                + people.getName());
    }

    public void sortTeamPlayer(Team team) {
        // team.stream().sorted(peoples.()).forEach(System.out::println);
        System.out.println("Sorted team " + TeamName + ": ");
        peoples.stream()
                .sorted(new TeamComporator())
                .forEach(p -> System.out.println("Person: "
                        + p.getName() + " " + p.getAge() + " " + p.getMale()));

    }

    class TeamComporator implements Comparator<People> {
        public int compare(People a, People b) {
            return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
        }
    }


}

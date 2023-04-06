package Staff;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Ivan", 35, "male");
        JuniorDev juniorDev1 = new JuniorDev("Ljudmyla", 18, "female");
        JuniorDev juniorDev2 = new JuniorDev("Anatolij", 28, "male");
        MiddleDev middleDev0 = new MiddleDev("Mikhail", 45, "male");
        MiddleDev middleDev1 = new MiddleDev("Anton", 47, "male");
        MiddleDev middleDev2 = new MiddleDev("Stanislav", 45, "male");
        SeniorDev seniorDev = new SeniorDev("Fima", 18, "female");
        CTO cto = new CTO("Kyrylo", 21, "male");

        Team<People> team1 = new Team<>("TEAM1");
        team1.addNewTeamPlayer(manager);
        team1.addNewTeamPlayer(juniorDev1);
        team1.addNewTeamPlayer(seniorDev);
        team1.addNewTeamPlayer(middleDev0);
        team1.addNewTeamPlayer(cto);

        Team<People> team2 = new Team<>("TEAM2");
        team2.addNewTeamPlayer(manager);
        team2.addNewTeamPlayer(juniorDev2);
        team2.addNewTeamPlayer(middleDev2);
        team2.addNewTeamPlayer(middleDev1);

        System.out.println("Ищем имя джуниора разработчика в команде 1 ");
        team1.searchTeamPlayer(juniorDev1);

        System.out.println("Удаляем джуниора разработчика из команды 1 ");
        team1.deleteTeamPlayer(juniorDev1);

        System.out.println("Добавляем освободившегося джуниора разработчика в команду 2 ");
        team2.addNewTeamPlayer(juniorDev1);

        team2.sortTeamPlayer(team2);
        System.out.println("---------------");
        team1.sortTeamPlayer(team1);
    }
}

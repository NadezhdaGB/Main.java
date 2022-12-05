package lesson1;

public class Team {
    private String teamName;
    Members[] members = new Members[4];

    public String getTeamName() {
        return teamName;
    }

    public Team(String teamName) {
        this.teamName = teamName;
        members[0] = new Members("Иванов", 20, 15, 2.5);
        members[1] = new Members("Смирнов", 22, 12, 2.6);
        members[2] = new Members("Кузнецов", 25, 20, 2.1);
        members[3] = new Members("Петров", 18, 28, 2.2);
        this.members = members;

    }

    public void showResults(Course course) {
        System.out.printf("Игрок команды %s %s прошел дистанцию.\n", teamName, course.getWinnerName());
        }

    public void teamInfo() {
        for (int i = 0; i< members.length; i++) {
            System.out.printf("Игрок %s может пробежать 100м за %sс, проплыть 50м за %sс, прыгнуть в высоту на %sм\n", members[i].getName(), members[i].getRun(), members[i].getSwim(), members[i].getJump());
        }
    }

}

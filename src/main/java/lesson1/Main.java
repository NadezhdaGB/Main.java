package lesson1;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Команда №1");
        team.teamInfo();
        Course course1 = new Course(25, 16, 2.5);
        course1.doIt(team);
        team.showResults(course1);
    }
}

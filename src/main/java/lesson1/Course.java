package lesson1;

public class Course {
    private int run;
    private int swim;
    private double jump;
    private String winnerName;

    public Course(int run, int swim, double jump) {
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public String getWinnerName() {
        return winnerName;
    }

    public void doIt(Team team) {
        System.out.println(team.getTeamName() + " пройдите полосу препятствий.");
        for (int i = 0; i< team.members.length; i++) {
            if (team.members[i].getRun() <= run && team.members[i].getSwim() <= swim && team.members[i].getJump() >= jump) {
                //System.out.println(team.members[i].getName());
                winnerName = team.members[i].getName();
            }
        }
    }


}

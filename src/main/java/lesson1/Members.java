package lesson1;

public class Members {
    private String name;
    private int run;
    private int swim;
    private double jump;

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

    public double getJump() {
        return jump;
    }

    public Members(String name, int run, int swim, double jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

}

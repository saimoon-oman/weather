package firstbranch;

public class ClassInFirstBranch {
    String name;
    int roll;
    int id;

    public ClassInFirstBranch(String name, int roll, int id) {
        this.name = name;
        this.roll = roll;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

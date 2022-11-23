public class Student {
    public static int autoID = 1;
    private int id;
    private String name;
    private double scoreMath;
    private double scorePhysic;
    private double scoreChemistry;
    private double avgscore;
    private String rank;

    public Student(String name, double avgscore, String rank) {
        int temp = autoID++;
        this.id = temp;
        this.name = name;
        this.avgscore = avgscore;
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public static int getAutoID() {
        return autoID;
    }

    public static void setAutoID(int autoID) {
        Student.autoID = autoID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScorePhysic() {
        return scorePhysic;
    }

    public void setScorePhysic(double scorePhysic) {
        this.scorePhysic = scorePhysic;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(double scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }

    public double getAvgscore() {
        return avgscore;
    }

    public void setAvgscore(double avgscore) {
        this.avgscore = avgscore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Tên='" + name + '\'' +
                ", Điểm TB=" + avgscore +
                ", Xếp loại:'" + rank + '\'' +
                '}';
    }
}

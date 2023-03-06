public class Marks {
    private int score;
    private String studentID;
    private String studName;
    private String className;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Marks(int score, String studentID, String studName, String className) {
        this.score = score;
        this.studentID = studentID;
        this.studName = studName;
        this.className = className;

    }
}

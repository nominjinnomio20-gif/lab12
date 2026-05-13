public class Student implements Cloneable {
    public static final int NUM_OF_TESTS = 3;
    protected String name;
    protected int[] test;
    protected String courseGrade;

    public Student() {
        name = "";
        test = new int[NUM_OF_TESTS];
        courseGrade = "";
    }

    public Student(String name) {
        this.name = name;
        test = new int[NUM_OF_TESTS];
        courseGrade = "";
    }

    // Prototype паттерн — clone метод
    @Override
    public Student clone() {
        try {
            Student cloned = (Student) super.clone();
            cloned.test = this.test.clone(); // массивыг тусад нь хуулна
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String getCourseGrade() { return courseGrade; }
    public String getName() { return name; }
    public int getTestScore(int i) { return test[i]; }
    public void setName(String name) { this.name = name; }
    public void setTestScore(int i, int score) { test[i] = score; }
    public String computeCourseGrade() { return ""; }
}
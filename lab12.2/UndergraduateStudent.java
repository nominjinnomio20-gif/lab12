public class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name) {
        super(name);
    }
    @Override
    public String computeCourseGrade() {
        int total = 0;
        for (int i = 0; i < NUM_OF_TESTS; i++) total += test[i];
        int avg = total / NUM_OF_TESTS;
        if (avg >= 90) courseGrade = "A";
        else if (avg >= 80) courseGrade = "B";
        else if (avg >= 70) courseGrade = "C";
        else if (avg >= 60) courseGrade = "D";
        else courseGrade = "F";
        return courseGrade;
    }
}
public class Program1 {
    public static void main(String[] args) {

        // Эх объектууд үүсгэнэ
        UndergraduateStudent ug = new UndergraduateStudent("Baldan");
        ug.setTestScore(0, 85);
        ug.setTestScore(1, 90);
        ug.setTestScore(2, 78);

        GraduateStudent gr = new GraduateStudent("Bulgaa");
        gr.setTestScore(0, 92);
        gr.setTestScore(1, 88);
        gr.setTestScore(2, 95);

        // for-each давталтаар 4 объект clone хийнэ
        Student[] originals = {ug, ug, gr, gr};
        String[] names = {"Baldan2", "Baldan3", "Bulgaa2", "Bulgaa3"};

        Student[] clones = new Student[4];
        for (int i = 0; i < originals.length; i++) {
            clones[i] = originals[i].clone();
            clones[i].setName(names[i]);
        }

        // for-each давталтаар computeCourseGrade болон getCourseGrade дуудна
        System.out.println("=== Эх объектууд ===");
        for (Student s : new Student[]{ug, gr}) {
            s.computeCourseGrade();
            System.out.println(s.getName() + " -> " + s.getCourseGrade());
        }

        System.out.println("\n=== Clone объектууд ===");
        for (Student s : clones) {
            s.computeCourseGrade();
            System.out.println(s.getName() + " -> " + s.getCourseGrade());
        }
    }
}
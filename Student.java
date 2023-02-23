import java.util.HashMap;

public class Student {
    private HashMap<Integer, Integer> grades = new HashMap<Integer, Integer>();
    private String studentName;
    private String courseCode;
    private int studentNumber;

    public Student() {
    }

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public Student(String studentName, int... grades) {
        this.studentName = studentName;

        for (int a = 0; a < grades.length; a++) {
            if (grades[a] > 100 || grades[a] < 0) {
                System.out.println("This grade is not valid!");
                continue;
            }
            this.grades.put(a+1, grades[a]);
        }
    }

    public Student(String studentName, int studentNumber, String courseCode, int... grades) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.courseCode = courseCode;

        for (int a = 0; a < grades.length; a++) {
            if (grades[a] > 100 || grades[a] < 0) {
                System.out.println("This grade is not valid!");
                continue;
            }

            this.grades.put(a+1, grades[a]);
        }
    }

    public void changeStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void changeStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void changeCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void changeGrade(int assessmentNumber, int grade) {
        this.grades.put(assessmentNumber, grade);
    }

    public double getAverage() {
        double average = 0;
        for (int a : this.grades.keySet()) {
            average += ((double)this.grades.get(a));
        }

        average /= grades.size();
        
        return average;
    }

    public void getStudentInfo() {
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Student Number: " + this.studentNumber);
        System.out.println("Course Code: " + this.courseCode);
    }

    public void getStudentGrades() {
        for (int a : this.grades.keySet()) {
            System.out.println("Assessment " + a + ": " + this.grades.get(a));
        }

        System.out.println("Average Grade: " + getAverage());
    }
}

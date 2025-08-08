package week1.day1;

public class Report {


	public static void main(String[] args) {
        // Create object for Student class
        Student student = new Student();

        // Assign values
        student.studentName = "SIBI";
        student.rollNo = 199;
        student.collegeName = "M.Kumarasamy College of Engineering";
        student.markScored = 464;
        student.cgpa = 7.1f;

        // Print all variables
        System.out.println("Student Name  : " + student.studentName);
        System.out.println("Roll Number   : " + student.rollNo);
        System.out.println("College Name  : " + student.collegeName);
        System.out.println("Marks Scored  : " + student.markScored);
        System.out.println("CGPA          : " + student.cgpa);
    }

}
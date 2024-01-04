package University;

public class Course {
    
        String courseName;
        String instructor ;
        int NumberOfStudents;


        // constructor set the value 
    
    Course(String courseNameString, String newinstructor, int students) {
    courseName = courseNameString;
    instructor = newinstructor;
    NumberOfStudents= students;

}

public String getcourseName() {
    return courseName;
}

// Setter for Couse name
public void setcourseName(String newCouseName) {
    courseName = newCouseName;
}



public String getcinstructor() {
    return instructor;
}

// Setter for instructor
public void instructor(String newinstructor) {
    instructor = newinstructor;
}

public int getNumberOfStudents() {
    return NumberOfStudents;
}

// Setter for instructor
public void NumberOfStudents(int students) {
    NumberOfStudents = students ;



}
@Override
public String toString() {
    return "course Name " +"  "+ courseName +" \n instructor: "+"  " + instructor + "  \n Number of student: " + "   "+NumberOfStudents ;
}
public static void main(String[] args) throws Exception {

    Course myCourse = new Course("java", "salwa", 22);
   //System.out.println("course Name :  " + myCourse.getcourseName());
    // System.out.println("instructor:  " + myCourse.getcinstructor());
    // System.out.println("Number of Student:  " + myCourse.getNumberOfStudents());

System.out.println(myCourse);


}
}

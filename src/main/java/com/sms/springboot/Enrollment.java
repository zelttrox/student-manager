public class Enrollment {
    private Student student;
    private Course course;

    // Registers a student to a course
    public void Register(Student student, Course course) {
        this.student = student;
        this.course = course;
        course.EnrollStudent(student);
    }

    // Getters & setters
    // Student
    public void setStudent(Student student) {this.student = student;}
    public Student getStudent() {return student;}

    // Course
    public void setCourse(Course course) {this.course = course;}
    public Course getCourse() {return course;}
}

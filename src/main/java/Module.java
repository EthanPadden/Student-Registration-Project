import java.util.ArrayList;
import java.util.List;

public class Module {
    private String name;
    private ArrayList< Student > studentsEnrolled;
    private ArrayList< Course > associatedCourses;

    public Module( String name ) {
        setName( name );
        studentsEnrolled = new ArrayList< Student >();
        associatedCourses = new ArrayList< Course >();
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public ArrayList< Student > getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void addStudent( Student student ) {
        // Add new student to the students list
        studentsEnrolled.add( student );
    }

    public void removeStudent( Student student ) {
        // If the student is in the students list, remove it
        if ( studentsEnrolled.contains( student ) ) {
            studentsEnrolled.remove( student );
        }
    }

    public ArrayList< Course > getAssociatedCourses() {
        return associatedCourses;
    }

    public void addAssociatedCourse( Course course ) {
        // Add new course to the course list
        associatedCourses.add( course );
    }

    public void removeAssociatedCourse( Course course ) {
        // If the course is in the course list, remove it
        if ( associatedCourses.contains( course ) ) {
            associatedCourses.remove( course );
        }
    }
}

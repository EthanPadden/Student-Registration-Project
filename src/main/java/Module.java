import java.util.ArrayList;
import java.util.List;

public class Module {
    private String name;
    private ArrayList<Student> studentsEnrolled;
    private ArrayList<Course> associatedCourses;

    public Module( String name ) {
        setName( name );
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

    public void setStudentsEnrolled( ArrayList< Student > studentsEnrolled ) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public ArrayList< Course > getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses( ArrayList< Course > associatedCourses ) {
        this.associatedCourses = associatedCourses;
    }
}

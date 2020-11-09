import java.util.List;

public class Module {
    private String name;
    private List<Student> studentsEnrolled;
    private List<Course> associatedCourses;

    public Module( String name ) {
        setName( name );
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }
}

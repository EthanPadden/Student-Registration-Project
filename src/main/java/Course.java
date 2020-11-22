import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course {
    private String name;
    private ArrayList<Module> modules;
    private ArrayList< Student> studentsEnrolled;
    private DateTime startDate;
    private DateTime endDate;

    public Course( String name, DateTime startDate, DateTime endDate ) {
        setName( name );
        setStartDate( startDate );
        setEndDate( endDate );
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate( DateTime startDate ) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate( DateTime endDate ) {
        this.endDate = endDate;
    }

    public ArrayList< Module > getModules() {
        return modules;
    }

    public void addModule( Module module ) {
        // Add new module to the modules list
        modules.add( module );
    }

    public void removeModule( Module module ) {
        // If the module is in the modules list, remove it
        if ( modules.contains( module ) ) {
            modules.remove( module );
        }
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
}

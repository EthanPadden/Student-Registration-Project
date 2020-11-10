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

    public void setModules( ArrayList< Module > modules ) {
        this.modules = modules;
    }

    public ArrayList< Student > getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled( ArrayList< Student > studentsEnrolled ) {
        this.studentsEnrolled = studentsEnrolled;
    }
}

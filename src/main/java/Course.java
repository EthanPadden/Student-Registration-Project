import java.util.Date;
import java.util.List;

public class Course {
    private String name;
    private List<Module> modules;
    private List< Student> studentsEnrolled;
    private Date startDate;
    private Date endDate;

    public Course( String name, Date startDate, Date endDate ) {
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate( Date startDate ) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate( Date endDate ) {
        this.endDate = endDate;
    }
}

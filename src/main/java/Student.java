import org.joda.time.DateTime;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private DateTime dob;
    private long id;
    private String username;
    private ArrayList< Course > courses;
    private ArrayList< Module > modules;

    public Student( long id, String name, DateTime dob ) {
        // Set details
        setId( id );
        setName( name );
        setDob( dob );

        // Create arraylists
        courses = new ArrayList< Course >();
        modules = new ArrayList< Module >();

        // Calculate age
        int thisYear = DateTime.now().getYear();
        int age = thisYear - dob.getYear();
        setAge( age );
    }

    public long getId() {
        return id;
    }

    public void setId( long id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public DateTime getDob() {
        return dob;
    }

    public void setDob( DateTime dob ) {
        this.dob = dob;
    }

    public String getUsername() {
        return name + age;
    }

    public void setUsername( String username ) {
        this.username = username;
    }

    public ArrayList< Course > getCourses() {
        return courses;
    }

    public void addCourse( Course course ) {
        // Add new course to the course list
        courses.add( course );

        // Add all modules from that course to the modules list
        ArrayList< Module > modulesToAdd = course.getModules();
        for ( Module module : modulesToAdd ) {
            addModule( module );
        }
    }

    public void removeCourse( Course course ) {
        // If the course is in the course list, remove it
        if ( courses.contains( course ) ) {
            courses.remove( course );
        }

        // If any of the modules in that course are in the modules list, remove them
        ArrayList< Module > modulesToRemove = course.getModules();
        for ( Module module : modulesToRemove ) {
            removeModule( module );
        }
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
}

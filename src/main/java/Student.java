import org.joda.time.DateTime;

import java.util.Date;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private DateTime dob;
    private long id;
    private String username;
    private List< Course > course;
    private List< Module > modules;

    public Student( long id, String name, int age, DateTime dob ) {
        setId( id );
        setName( name );
        setAge( age );
        setDob( dob );
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
}

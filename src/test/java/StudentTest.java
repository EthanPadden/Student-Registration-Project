import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    public void constructorShouldSetValues() {
        long id = 123;
        String name = "John Doe";
        int age = 21;
        DateTime dob = new DateTime( 1999, 3, 4, 0, 0 );

        Student student = new Student( id, name, age, dob );
        assertEquals( id, student.getId() );
        assertEquals( name, student.getName() );
        assertEquals( age, student.getAge() );
        assertEquals( dob, student.getDob() );
    }

    @Test
    public void getUsernameShouldConcatenateNameAndAge() {
        long id = 123;
        String name = "John Doe";
        int age = 21;
        DateTime dob = new DateTime( 1999, 3, 4, 0, 0 );

        String expectedUsername = name + age;

        Student student = new Student( id, name, age, dob );
        assertEquals( student.getUsername(), expectedUsername );
    }
}
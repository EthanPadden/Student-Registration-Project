import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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

    @Test
    public void courseModifierMethodsShouldModifyCoursesAndModules(){
        // Create student
        long id = 123;
        String studentName = "John Doe";
        int age = 21;
        DateTime dob = new DateTime( 1999, 3, 4, 0, 0 );
        Student student = new Student( id, studentName, age, dob );

        // Create course
        String courseName = "Computer Science";
        DateTime startDate = new DateTime(2017, 9, 1, 0,0);
        DateTime endDate = new DateTime(2021, 5, 31, 0,0);
        Course course = new Course( courseName, startDate, endDate );

        // Add course modules
        Module module1 = new Module( "M1" );
        Module module2 = new Module( "M2" );
        course.addModule( module1 );
        course.addModule( module2 );

        // Add course to student
        student.addCourse( course );

        // Verify course is added
        assertEquals( course, student.getCourses().get( 0 ) );

        // Verify modules are added
        ArrayList<Module> expectedModules = new ArrayList< Module >();
        expectedModules.add( module1 );
        expectedModules.add( module2 );

        assertEquals( expectedModules, student.getModules() );

        // Remove course
        student.removeCourse( course );

        // Verify course is removed
        assertFalse( student.getCourses().contains( course ) );

        // Verify modules are removed
        assertFalse( student.getModules().contains( module1 ) );
        assertFalse( student.getModules().contains( module2 ) );
    }

    @Test
    public void moduleModifierMethodsShouldModifyModules(){
        // Create student
        long id = 123;
        String studentName = "John Doe";
        int age = 21;
        DateTime dob = new DateTime( 1999, 3, 4, 0, 0 );
        Student student = new Student( id, studentName, age, dob );

        // Add module to student
        Module module = new Module( "M1" );
        student.addModule( module );

        // Verify module is added
        assertEquals( module, student.getModules().get( 0 ) );

        // Remove module
        student.removeModule( module );

        // Verify module is removed
        assertFalse( student.getModules().contains( module ) );
    }
}
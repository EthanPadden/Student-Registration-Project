import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    @Test
    public void constructorShouldSetValues() {
        String name = "Computer Science";
        DateTime startDate = new DateTime(2017, 9, 1, 0,0);
        DateTime endDate = new DateTime(2021, 5, 31, 0,0);

        Course course = new Course( name, startDate, endDate );
        assertEquals( name, course.getName() );
        assertEquals( startDate, course.getStartDate() );
        assertEquals( endDate, course.getEndDate() );
    }

    @Test
    public void moduleModifierMethodsShouldModifyModules(){
        // Create course
        String courseName = "Computer Science";
        DateTime startDate = new DateTime(2017, 9, 1, 0,0);
        DateTime endDate = new DateTime(2021, 5, 31, 0,0);
        Course course = new Course( courseName, startDate, endDate );

        // Add module to course
        Module module = new Module( "M1" );
        course.addModule( module );

        // Verify module is added
        assertEquals( module, course.getModules().get( 0 ) );

        // Remove module
        course.removeModule( module );

        // Verify module is removed
        assertFalse( course.getModules().contains( module ) );
    }

    @Test
    public void studentModifierMethodsShouldModifyStudents() {
        // Create student
        long id = 123;
        String studentName = "John Doe";
        int age = 21;
        DateTime dob = new DateTime( 1999, 3, 4, 0, 0 );
        Student student = new Student( id, studentName, dob );

        // Create course
        String courseName = "Computer Science";
        DateTime startDate = new DateTime(2017, 9, 1, 0,0);
        DateTime endDate = new DateTime(2021, 5, 31, 0,0);
        Course course = new Course( courseName, startDate, endDate );

        // Add student to course
        course.addStudent( student );

        // Verify student is added
        assertEquals( student, course.getStudentsEnrolled().get( 0 ) );

        // Remove student
        course.removeStudent( student );

        // Verify module is removed
        assertFalse( course.getStudentsEnrolled().contains( student ) );
    }
}
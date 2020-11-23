import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {
    @Test
    public void constructorShouldSetValues() {
        String name = "CT123";

        Module module = new Module( name );
        assertEquals( name, module.getName() );
    }

    @Test
    public void studentModifierMethodsShouldModifyStudents() {
        // Create student
        long id = 123;
        String studentName = "John Doe";
        int age = 21;
        DateTime dob = new DateTime( 1999, 3, 4, 0, 0 );
        Student student = new Student( id, studentName, age, dob );

        // Add student to module
        Module module = new Module( "M1" );
        module.addStudent( student );

        // Verify student is added
        assertEquals( student, module.getStudentsEnrolled().get( 0 ) );

        // Remove student
        module.removeStudent( student );

        // Verify module is removed
        assertFalse( module.getStudentsEnrolled().contains( student ) );
    }

    @Test
    public void courseModifierMethodsShouldModifyCourses() {
        // Create course
        String courseName = "Computer Science";
        DateTime startDate = new DateTime(2017, 9, 1, 0,0);
        DateTime endDate = new DateTime(2021, 5, 31, 0,0);
        Course course = new Course( courseName, startDate, endDate );

        // Add course to module
        Module module = new Module( "M1" );
        module.addAssociatedCourse( course );

        // Verify course is added
        assertEquals( course, module.getAssociatedCourses().get( 0 ) );

        // Remove course
        module.removeAssociatedCourse( course );

        // Verify course is removed
        assertFalse( module.getAssociatedCourses().contains( course ) );
    }
}
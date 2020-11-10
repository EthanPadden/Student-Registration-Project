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
}
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
}
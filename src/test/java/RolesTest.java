import junit.framework.TestCase;

import java.util.Arrays;

public class RolesTest extends TestCase {

    public void testRoles() {
        try{
            Roles roles = new Roles(null);
            fail();
        } catch(IllegalArgumentException exception){
            assertEquals(exception.getMessage(), "Cannot add a null list of roles");
        }
    }

    public void testContains() {
        try{
            Role[] arr = { new Role("name1"), new Role("name2")};
            Roles roles = new Roles(arr);
            roles.contains(null);
            fail();
        } catch(IllegalArgumentException exception){
            assertEquals(exception.getMessage(), "Parameter cannot be null");
        }
    }
}
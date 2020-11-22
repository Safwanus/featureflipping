import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class RoleTest extends TestCase {

    public void testName() {
        Role role = new Role("name");
        assertEquals(role.name(), "name");
    }

    public void testNameNull(){
        try{
            Role role = new Role(null);
            fail();
        } catch(IllegalArgumentException exception){
            assertEquals(exception.getMessage(),"Name cannot be null");
        }
    }

    public void testNameEmpty(){
        try{
            Role role = new Role("");
            fail();
        } catch(IllegalArgumentException exception){
            assertEquals(exception.getMessage(),"Name cannot be empty");
        }
    }

    public void testNameBlank(){
        try{
            Role role = new Role("   ");
            fail();
        } catch(IllegalArgumentException exception){
            assertEquals(exception.getMessage(),"Name cannot be blank");
        }
    }

    public void testNameSpaced(){
        try{
            Role role = new Role(" name");
            fail();
        } catch(IllegalArgumentException exception){
            assertEquals(exception.getMessage(),"Name cannot contain spaces");
        }
        try{
            Role role = new Role("na me");
            fail();
        } catch(IllegalArgumentException exception){
            assertEquals(exception.getMessage(),"Name cannot contain spaces");
        }
        try{
            Role role = new Role("name ");
            fail();
        } catch(IllegalArgumentException exception){
            assertEquals(exception.getMessage(),"Name cannot contain spaces");
        }
    }

    public void testNameRegEx() {
        try{
            Role role = new Role("namenamename");
            fail();
        } catch(IllegalArgumentException exception) {
            assertEquals(exception.getMessage(), "Only characters are allowed, in a [1-10] length interval");
        }
        try{
            Role role = new Role("name1");
            fail();
        } catch(IllegalArgumentException exception) {
            assertEquals(exception.getMessage(), "Only characters are allowed, in a [1-10] length interval");
        }
    }

    public void testEquals() {
        Role role1 = new Role("ADMIN");
        Role role2 = new Role("admin");
        assertEquals(role1, role2);
    }

    public void testHashCode() {
        Role role1 = new Role("ADMIN");
        Role role2 = new Role("admin");
        assertEquals(role1.hashCode(), role2.hashCode());
    }
}
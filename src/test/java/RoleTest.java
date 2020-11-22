import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class RoleTest extends TestCase {
    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void testName() {
        Role role = new Role("name");
        assertEquals(role.name(), "name");
    }

    @Test
    public void testNameNull(){
        try{
            Role role = new Role(null);
            fail();
        } catch(IllegalArgumentException exception){
            assertEquals(exception.getMessage(),"Name cannot be null");
        }
    }

    @Test
    public void testNameEmpty(){
        try{
            Role role = new Role("");
            fail();
        } catch(IllegalArgumentException exception){
            assertEquals(exception.getMessage(),"Name cannot be empty");
        }
    }

    @Test
    public void testNameBlank(){
        try{
            Role role = new Role("   ");
            fail();
        } catch(IllegalArgumentException exception){
            assertEquals(exception.getMessage(),"Name cannot be blank");
        }
    }

    @Test
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
}
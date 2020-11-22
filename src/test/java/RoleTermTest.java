import junit.framework.TestCase;

public class RoleTermTest extends TestCase {

    public void testRoleTerm(){
        try {
            RoleTerm term = new RoleTerm(null);
            fail();
        }catch (IllegalArgumentException exception){
            assertEquals(exception.getMessage(), "Role cannot be null");
        }
    }

    public void testToPredicate() {
        Roles roles = new Roles(new Role[]{new Role("e1"),new Role("e2")});
        RoleTerm termFalse = new RoleTerm(new Role("e3"));
        RoleTerm termTrue = new RoleTerm(new Role("e1"));

        assertTrue(termTrue.toPredicate().test(roles));
        assertFalse(termFalse.toPredicate().test(roles));
    }

    public void testToString() {
        String name = "name";
        RoleTerm term = new RoleTerm(new Role(name));
        assertEquals(term.toString(), name);
    }
}
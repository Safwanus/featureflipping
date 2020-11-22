import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Roles {
    Set<Role> roles;

    public Roles(Role[] roles) {
        if (roles == null) throw new IllegalArgumentException("Cannot add a null list of roles");
        this.roles = new HashSet<Role>((Collection<? extends Role>) Arrays.asList(roles));
    }

    public boolean contains(Role role){
        if (role == null) throw new IllegalArgumentException("Parameter cannot be null");
        return roles.contains(role);
    }

}

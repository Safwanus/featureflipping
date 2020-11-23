package Role;

import RoleExpression.RoleExpression;

import java.util.function.Predicate;

public class RoleTerm implements RoleExpression {
    Role role;

    public RoleTerm(Role role) {
        if (role == null) throw new IllegalArgumentException("Role.Role cannot be null");
        this.role = role;
    }

    @Override
    public Predicate<Roles> toPredicate() {
        return roles -> roles.contains(role);
    }


    @Override
    public String toString() {
        return role.name();
    }
}

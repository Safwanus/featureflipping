package RoleExpression;
import Role.Roles;
import java.util.function.Predicate;

public interface RoleExpression {

    public Predicate<Roles> toPredicate();

    public String toString();
}

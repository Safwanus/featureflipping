import java.util.function.Predicate;

public interface RoleExpression {

    public Predicate<Roles> toPredicate();

    public String toString();
}

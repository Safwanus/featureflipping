import java.util.function.Predicate;

public class OrRoleOperator extends RoleOperator{
    private final String operation = "Or";

    @Override
    public Predicate<Roles> toPredicate() {
        Predicate<Roles> leftPredicate = roles -> leftOperand.toPredicate().test(roles);
        Predicate<Roles> rightPredicate = roles -> rightOperand.toPredicate().test(roles);
        return roles -> leftPredicate.or(rightPredicate).test(roles);
    }

    @Override
    public String toString() {
        return "operation='" + operation + '\'' +
                "leftOperand= " + leftOperand +
                ", rightOperand= " + rightOperand;
    }
}

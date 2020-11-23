package RoleExpression;

import Role.*;
import java.util.function.Predicate;

public class AndRoleOperator extends RoleOperator{
    private String operation = "And";

    public AndRoleOperator(RoleTerm leftOperand, RoleTerm rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public Predicate<Roles> toPredicate() {
        Predicate<Roles> leftPredicate = roles -> leftOperand.toPredicate().test(roles);
        Predicate<Roles> rightPredicate = roles -> rightOperand.toPredicate().test(roles);
        return roles -> leftPredicate.and(rightPredicate).test(roles);
    }

    @Override
    public String toString() {
        return "operation='" + operation + '\'' +
                "leftOperand= " + leftOperand +
                ", rightOperand= " + rightOperand;
    }
}

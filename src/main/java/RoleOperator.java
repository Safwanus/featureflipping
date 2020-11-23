import java.util.function.Predicate;

public abstract class RoleOperator implements RoleExpression{
    protected RoleTerm leftOperand;
    protected RoleTerm rightOperand;

    public RoleOperator(RoleTerm leftOperand, RoleTerm rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }
}

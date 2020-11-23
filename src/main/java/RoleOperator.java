import java.util.function.Predicate;

public abstract class RoleOperator implements RoleExpression{
    protected RoleTerm leftOperand;
    protected RoleTerm rightOperand;
}

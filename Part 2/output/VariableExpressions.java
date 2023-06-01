public class VariableExpressions extends Expr {
    public final String result;
    public VariableExpressions (String _result) {
	result = _result;
    }
    public Value eval(Env e) throws EvalError {
	return e.lookup(result);
    }
    public String toString(){
	return result;
    }
}
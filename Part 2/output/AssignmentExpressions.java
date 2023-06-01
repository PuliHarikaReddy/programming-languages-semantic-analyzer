public class AssignmentExpressions extends Expr{
	public final String result;
	public final Expr expr;
	public AssignmentExpressions (String _result, Expr e1) {
		result= _result;
		expr = e1;
	}	
	public Value eval(Env e) throws EvalError {
		
		Value value = e.lookup(result);
		Value val=expr.eval(e);
		
		if(value.getClass().isInstance(val)){
			e.updateBinding(result,val);
		}
		else throw new EvalError("Invalid datatype");
		return val;
	}
	
	public String toString() {
		
		return null;
	}
}
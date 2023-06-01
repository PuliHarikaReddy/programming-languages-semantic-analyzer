public class ApplicationExpressions extends Expr {
	String result;
	Expr exp1;
	public ApplicationExpressions (String s1, Expr e1) {
		result = s1;
		exp1 = e1;
	}
	public Value eval(Env e) throws EvalError {
		Value value = e.lookup(result);
		if (value.getClass() == FunVal.class){ 	
			Value val = exp1.eval(e);
			FunVal funval = (FunVal)value;
			return  funval.exp.eval(funval.env.addBinding(funval.funval1,val));
		}
		else throw new EvalError("Invalid arguments"); 

	}
	public String toString() {
		return null;
	}
}
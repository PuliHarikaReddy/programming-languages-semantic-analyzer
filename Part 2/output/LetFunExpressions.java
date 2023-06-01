public class LetFunExpressions extends Expr{
	public final String function,res;
	public final Expr exp,exp1;
	
	public LetFunExpressions (String s1, String s2, Expr e1, Expr e2) {
		function = s1;
		res = s2;
		exp = e1;
		exp1 = e2;
	}

	public Value eval(Env e) throws EvalError {	
		Env env1 = e.addBinding(function,new IntVal(0));
		FunVal value = new FunVal(res,exp,env1);
		env1.updateBinding(function, value);
		return exp1.eval(env1);
	}

	public String toString() {
		
		return null;
		
	}

}

public class LetValExpressions extends Expr{
	public final String str;
	public final Expr exp;
	public final Expr exp1;
	public LetValExpressions (String result, Expr e1, Expr e2) {
		str = result;
		exp = e1;
		exp1 = e2;
	}
	public Value eval(Env e) throws EvalError {		
		Env env1 = e.addBinding(str,exp.eval(e));
		return exp1.eval(env1);
	}
	public String toString() {
		return null;
	}
}
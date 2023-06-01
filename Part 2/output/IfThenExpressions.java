public class IfThenExpressions extends Expr {
    public final Expr exp;
	public final Expr exp1;
	public final Expr exp2;
    public IfThenExpressions (Expr e1, Expr e2, Expr e3) {
		exp = e1;
		exp1 = e2;
		exp2 = e3;
	
    }
    public Value eval(Env e) throws EvalError {
	Value val=exp.eval(e);
		if(val.getClass()==BoolVal.class)
		{
			if(((BoolVal)val).value)
			return exp1.eval(e);
			else
			return exp2.eval(e);
		}
		else throw new EvalError("Error due to not Boolean Type");
    }
    public String toString() {
    	
	return null;
    }
}

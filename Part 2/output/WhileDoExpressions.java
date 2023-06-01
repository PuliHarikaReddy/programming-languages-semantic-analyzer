public class WhileDoExpressions extends Expr {
	public final Expr exp;
	public final Expr exp1;
	public WhileDoExpressions (Expr e1,Expr e2) {
		exp = e1;
		exp1 = e2;
    	}
   	public Value eval(Env e) throws EvalError {
       		Value val=exp.eval(e);
			Value output=null;
			while(((BoolVal)val).value){ 
				output=exp1.eval(e);
				val=exp.eval(e); 
				}
			return output;
    	}
    public String toString(){
		return null;
    }
}

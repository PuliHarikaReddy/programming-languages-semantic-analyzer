public class SequenceExpressions extends Expr{
	public Expr exp,exp1;
	public SequenceExpressions (Expr e1,Expr e2){
		exp =e1;
		exp1 =e2;	
    }
    public Value eval(Env e) throws EvalError {
		exp.eval(e);
		return exp1.eval(e);
    }
    public String toString(){
		return  null;
    }
}

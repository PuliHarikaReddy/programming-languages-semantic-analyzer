public class BooleanConstants extends Expr{
    public final boolean result;
    public BooleanConstants(boolean _result){
	result= _result;
    }
    public Value eval(Env e) throws EvalError{
	return new BoolVal(result);
    }
    public String toString() {
	return String.valueOf(result);
    }
}

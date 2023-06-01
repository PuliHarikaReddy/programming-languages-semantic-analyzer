public class FunVal extends Value{
	
	public final String funval1;
	public final Expr exp;
	public final Env env;
	
	public FunVal(String s1, Expr e1, Env _env) {
		funval1 = s1;
		exp = e1;
		env = _env;
	}
	public String toString() {
		return funval1;
	}
}
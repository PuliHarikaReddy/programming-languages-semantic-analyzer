public class BinaryExpressions extends Expr{
	Expr exp, exp1;
	BinOp bin_op;
	

	public BinaryExpressions (Expr e1, Expr e2, BinOp binop) {
		this.exp = e1;
		this.exp1 = e2;
		this.bin_op = binop;
	}
	
	public Value eval(Env e) throws EvalError {
		int i1, i2;
		boolean b1, b2;
		switch(bin_op)
		{
		case PLUS: 
			i1 = ((IntVal)exp.eval(e)).value;
			i2 = ((IntVal)exp1.eval(e)).value;
			    return new IntVal(i1 + i2);

		case MINUS:
			i1 = ((IntVal)exp.eval(e)).value;
			i2 = ((IntVal)exp1.eval(e)).value;
			    return new IntVal(i1 - i2);

		case TIMES:
			i1 = ((IntVal)exp.eval(e)).value;
			i2 = ((IntVal)exp1.eval(e)).value;
			    return new IntVal(i1 * i2);
		case DIV:
			i1 = ((IntVal)exp.eval(e)).value;
			i2 = ((IntVal)exp1.eval(e)).value;
			if (i2 == 0){
				throw new EvalError("Division by Zero Error");
			}
			else
				return new IntVal(i1/i2);
			
		case OR:
			b1 = ((BoolVal)exp.eval(e)).value;
			if(b1)
				return new BoolVal(true);
			else {

				b2 = ((BoolVal)exp1.eval(e)).value;
				return new BoolVal(b2);
			}

		case AND:
			b1 = ((BoolVal)exp.eval(e)).value;
			if(b1) {

				b2 = ((BoolVal)exp1.eval(e)).value;
				return new BoolVal(b2);
			}
			else 
				return new BoolVal(false);
		case EQ:
			if(exp.eval(e) instanceof IntVal && exp1.eval(e) instanceof IntVal)
			{
				i1 = ((IntVal)exp.eval(e)).value;
				i2 = ((IntVal)exp1.eval(e)).value;
				if(i1 == i2)				
					return new BoolVal(true);
				else
					return new BoolVal(false);

			}
			if(exp.eval(e) instanceof BoolVal && exp1.eval(e) instanceof BoolVal)
			{
				b1 = ((BoolVal)exp.eval(e)).value;
				b2 = ((BoolVal)exp1.eval(e)).value;
				if(b1 == b2)				
					return new BoolVal(true);
				else
					return new BoolVal(false);
			}

		case LT:
			i1 = ((IntVal)exp.eval(e)).value;
			i2 = ((IntVal)exp1.eval(e)).value;
			if(i1 < i2)			
				return new BoolVal(true);
			else
				return new BoolVal(false);
		}
		return null;
	}
	
	public String toString() {
		
		return null;
	}
}

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

public class TAHMInterpreter extends TAHMBaseVisitor<Integer> {

	private Map<String, Integer> vars = new HashMap<String, Integer>();
	
	@Override
	public Integer visitVars(TAHMParser.VarsContext ctx) {
		List<TerminalNode> ids = ctx.Ident();
		for (TerminalNode tn : ids) {
			vars.put(tn.getText(), null);
		}
		return null;
	}

	@Override
	public Integer visitAssignStat(TAHMParser.AssignStatContext ctx) {
		String name = ctx.Ident().getText();
		Integer val = this.visit(ctx.expression());
		vars.put(name, val);
		return null;
	}

	@Override
	public Integer visitExpression(TAHMParser.ExpressionContext ctx) {
		int result = this.visit(ctx.term());                       // initialize result to the first term
		if (ctx.opt_sign != null && ctx.opt_sign.getText().equals("-")) {
			result *= -1;
		}
		for (TAHMParser.Opt_termContext term : ctx.opt_term() ) {  // perform additive operation for every other term
			switch (term.op.getType()) {
				case TAHMParser.PLUS:
					result += this.visit(term.term());
					break;
				case TAHMParser.MINUS:
					result -= this.visit(term.term());
					break;
				default:
					throw new RuntimeException("Expected a '+' or '-'. Instead got: " + term.op.getText());
			}
		}
		return result;
	}

	@Override
	public Integer visitPrintStat(TAHMParser.PrintStatContext ctx) {
		String id = ctx.Ident().getText();
		if (!vars.containsKey(id)) {
			throw new RuntimeException("Identifier does not exist");
		}
		System.out.println(vars.get(id));
		return null;
	}

	@Override
	public Integer visitParExpr(TAHMParser.ParExprContext ctx) {
		return this.visit(ctx.expression());
	}

	@Override
	public Integer visitNumberFactor(TAHMParser.NumberFactorContext ctx) {
		return Integer.parseInt(ctx.getText());
	}

	@Override
	public Integer visitIdentFactor(TAHMParser.IdentFactorContext ctx) {
		String id = ctx.Ident().getText();
		if (!vars.containsKey(id)) {
			throw new RuntimeException("Identifier does not exist");
		}
		return vars.get(id);
	}

	@Override
	public Integer visitIfStat(TAHMParser.IfStatContext ctx) {
		if (this.visit(ctx.condition()) == 1) {
			this.visit(ctx.statement());
		}
		return null;
	}

	@Override
	public Integer visitCondition(TAHMParser.ConditionContext ctx) {
		int left = this.visit(ctx.expression(0));
		int right = this.visit(ctx.expression(1));
		
		boolean result = false;
		switch (ctx.op.getType()) {
			case TAHMParser.GREATER_THAN:
				result = left > right;
				break;
			case TAHMParser.LESS_THAN:
				result = left < right;
				break;
			case TAHMParser.EQUAL_TO:
				result = left == right;
				break;
			default:
				throw new RuntimeException("Expected <, >, or ==. Instead got " + ctx.op.getText());
		}
		if (result) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public Integer visitWhileStat(TAHMParser.WhileStatContext ctx) {
		while (this.visit(ctx.condition()) == 1) {
			this.visit(ctx.statement());
		}
		return null;
	}
	
	
	
}

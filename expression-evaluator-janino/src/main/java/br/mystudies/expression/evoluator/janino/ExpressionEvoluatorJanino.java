package br.mystudies.expression.evoluator.janino;

import java.lang.reflect.InvocationTargetException;

import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.ExpressionEvaluator;

public class ExpressionEvoluatorJanino<T> implements ExpressionEvoluator<T> {

	private ExpressionEvaluator expressionEvaluator;


	@Override
	public T evalute(Expression<T> expression, Parameters parameters) {


		try {
			expressionEvaluator = new ExpressionEvaluator(
					expression.getExpression(),
					expression.getExpressionType(),
					expression.getParameterNames(),
					expression.getParameterTypes()
				);


			return (T) expressionEvaluator.evaluate(parameters.getValues());

		} catch (CompileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}

package br.mystudies.expression.evoluator.janino;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ExpressionTest {


	@Test
	public void test(){


		Expression<Boolean> expression = Expression.builder()
			.expression("a + b = c")
			.expressionType(Boolean.class)
			.parameterNames("a", "b", "c")
			.parameterTypes(Integer.class, Integer.class, Integer.class)
			.create();


		assertThat(expression.getExpression(), equalTo("a + b = c"));
		assertThat(expression.getExpressionType(), equalTo(Boolean.class));

		// FIXME: change the assert
/*		assertThat(expression.getParameterNames(), contains("a", "b", "c"));
		assertThat(expression.getParameterTypes(), hasSize(3));*/

	}

}

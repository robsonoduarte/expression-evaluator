package br.mystudies.expression.evoluator.janino;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExpressionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}





	@Test
	public void test(){


		Expression<Boolean> expression = Expression.builder()
			.expression("a + b = c")
			.expressionType(Boolean.class)
			.parameterNames("a", "b", "c")
			.parameterTypes(Integer.class, Integer.class, Integer.class)
			.create();


		assertThat(expression.getExpression(), equalTo("a + b = c"));
		assertThat(expression.getExpressionType(), instanceOf(Boolean.class));
		assertThat(expression.getParameterNames(), contains("a", "b", "c"));
		/*assertThat(expression.getParameterTypes(), equalTo(asList(Integer.class, Integer.class, Integer.class)))*/;

	}

}

package br.mystudies.expression.evoluator.janino;




import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExpressionEvoluatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}








	private ExpressionEvoluator expressionEvoluator;




	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}











	@Test
	public void test() {



		boolean value = expressionEvoluator.evalute(
					Expression.builder()
						.expression("a + b + c")
						.expressionType(Boolean.class)
						.parameterNames("a", "b", "c")
						.parameterTypes(Integer.class, Integer.class, Integer.class)
						.create()
				);


	}

}

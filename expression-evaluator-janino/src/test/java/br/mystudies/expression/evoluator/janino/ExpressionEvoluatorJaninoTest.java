package br.mystudies.expression.evoluator.janino;




import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Before;
import org.junit.Test;

public class ExpressionEvoluatorJaninoTest {



	private ExpressionEvoluator<Boolean> expressionEvoluator;


	@Before
	public void setUp() throws Exception {
		expressionEvoluator = new ExpressionEvoluatorJanino<Boolean>();
	}



	@Test
	public void test1() {

		boolean value = expressionEvoluator.evalute(
					Expression.builder()
						.expression("a > b")
						.expressionType(Boolean.class)
						.parameterNames("a", "b")
						.parameterTypes(Integer.class, Integer.class)
						.create(),
					Parameters.builder()
						.values(2,-10)
						.create()
				);

		assertTrue(value);
	}



	@Test
	public void test2() {

		boolean value = expressionEvoluator.evalute(
				Expression.builder()
					.expression("dividaAtiva && new java.util.Date().after(dataUltimaDiponibilizacao)")
					.expressionType(Boolean.class)
					.parameterNames("dividaAtiva", "dataUltimaDiponibilizacao")
					.parameterTypes(Boolean.class, Date.class)
					.create(),
				Parameters.builder()
					.values(true, DateUtils.addDays(new Date(), -9))
					.create()
				);

		assertTrue(value);
	}


}

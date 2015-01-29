package br.mystudies.expression.evoluator.janino;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Test;

public class ParametersTest {


	@Test
	public void test() {

		Parameters parameters =
				Parameters.builder()
					.values(1, new Date(), 3.0)
					.create();

		assertThat(parameters.getValues()[0], instanceOf(Integer.class));
		assertThat(parameters.getValues()[1], instanceOf(Date.class));
		assertThat(parameters.getValues()[2], instanceOf(Double.class));
	}

}

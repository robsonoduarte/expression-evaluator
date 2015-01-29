package br.mystudies.expression.evoluator.janino;


public class Parameters {



	private Object[] values;




	private Parameters() {}




	public Object[] getValues() {
		return values;
	}



	public static Builder builder() {
		return new Builder();
	}





	public static class Builder {

		private Parameters parameters = new Parameters();

		private Builder() {}


		public Builder values(Object... values) {
			parameters.values = values;
			return this;
		}

		public Parameters create() {
			// TODO Auto-generated method stub
			return parameters;
		}

	}














}

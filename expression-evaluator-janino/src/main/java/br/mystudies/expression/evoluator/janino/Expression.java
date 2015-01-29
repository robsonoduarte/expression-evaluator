package br.mystudies.expression.evoluator.janino;



public class Expression<T> {


	private String expression;
	private Class<T> expressionType;
	private String[] parameterNames;
	private Class[] parameterTypes;




	private Expression() {}


	public static Builder builder() {
		return new Builder();
	}



	public String getExpression() {
		return expression;
	}



	public Class<T> getExpressionType() {
		return expressionType;
	}


	public String[] getParameterNames() {
		return parameterNames;  // FIXME: NPE
	}



	public Class[] getParameterTypes() {
		return parameterTypes;
	}



	public static class Builder {

		private Builder() {}

		private Expression expression = new Expression();


		public Builder expression(String expression) {
			this.expression.expression = expression;
			return this;
		}

		public <T> Builder expressionType(Class<T> expressionType) {
			expression.expressionType = expressionType;
			return this;
		}

		public Builder parameterNames(String... parameterNames) {
			expression.parameterNames = parameterNames;
			return this;
		}

		public Builder parameterTypes(Class... parameterTypes) {
			expression.parameterTypes = parameterTypes;
			return this;
		}

		public Expression create() {
			return expression;
		}

	}


}

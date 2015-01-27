package br.mystudies.expression.evoluator.janino;

import java.util.List;


public class Expression<T> {


	private String expression;
	private Class<T> expressionType;



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



	public List<String> getParameterNames() {
		// TODO Auto-generated method stub
		return null;
	}


	public <T> List<Class<T>> getParameterTypes() {
		// TODO Auto-generated method stub
		return null;
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
			// TODO Auto-generated method stub
			return this;
		}

		public <T> Builder parameterTypes(Class<T>... parameterTypes) {
			// TODO Auto-generated method stub
			return this;
		}

		public Expression create() {
			// TODO Auto-generated method stub
			return expression;
		}

	}



























}

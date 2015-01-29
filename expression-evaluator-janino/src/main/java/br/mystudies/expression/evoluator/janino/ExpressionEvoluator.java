package br.mystudies.expression.evoluator.janino;

public interface ExpressionEvoluator<T> {

	T evalute(Expression<T> expression, Parameters parameters);
}

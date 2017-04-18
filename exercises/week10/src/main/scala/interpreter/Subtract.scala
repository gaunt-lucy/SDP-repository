package interpreter

/**
  * Created by Lucy on 18/04/2017.
  */
class Subtract (private val leftExpression: Expression,
              private val rightExpression: Expression) extends Expression {

    override def interpret(): Int =
      leftExpression.interpret() - rightExpression.interpret()

}


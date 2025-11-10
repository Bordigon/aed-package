package aed.recursion;

import es.upm.aedlib.Pair;

public interface PropTerm {
  /*
   * Devuelve true si es un variable.
   */
  public boolean isVar();
  /*
   * Devuelve true si es una negacion.
   */
  public boolean isNeg();
  /*
   * Devuelve true si es una implicacion.
   */
  public boolean isImplies();
  /*
   * Devuelve true si es una conjuncion.
   */
  public boolean isAnd();
  /*
   * Devuelve true si es una disjuncion.
   */
  public boolean isOr();

  /*
   * Devuelve el nombre de un variable.
   * raises RuntimeException si no es un variable.
   */
  public String getVar();
  /*
   * Devuelve el operando de una negacion.
   * raises RuntimeException si no es una negacion.
   */
  public PropTerm getOperand();
  /*
   * Devuelve los operandos de una conjuncion, disjuncion o implicacion.
   * raises RuntimeException si no es una conjuncion, disjuncion o implicacion.
   */
  public Pair<PropTerm,PropTerm> getOperands();
}

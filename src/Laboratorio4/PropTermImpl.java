package aed.recursion;

import es.upm.aedlib.Pair;

public class PropTermImpl implements PropTerm {

    public String var;
    public PropTerm op1, op2;
    boolean isNeg, isAnd, isOr, isImplies;

    public PropTermImpl() {
        var = null;
        op1 = null;
        op2 = null;
        isNeg = false;
        isAnd = false;
        isOr = false;
        isImplies = false;
    }

    public static PropTerm mkVar(String var) {
        PropTermImpl result = new PropTermImpl();
        result.var = var;
        return result;
    }

    public static PropTerm mkNeg(PropTerm op) {
        PropTermImpl result = new PropTermImpl();
        result.isNeg = true;
        result.op1 = op;
        return result;
    }

    public static PropTerm mkAnd(PropTerm op1, PropTerm op2) {
        PropTermImpl result = new PropTermImpl();
        result.op1 = op1;
        result.op2 = op2;
        result.isAnd = true;
        return result;
    }

    public static PropTerm mkOr(PropTerm op1, PropTerm op2) {
        PropTermImpl result = new PropTermImpl();
        result.op1 = op1;
        result.op2 = op2;
        result.isOr = true;
        return result;
    }

    public static PropTerm mkImplies(PropTerm op1, PropTerm op2) {
        PropTermImpl result = new PropTermImpl();
        result.op1 = op1;
        result.op2 = op2;
        result.isImplies = true;
        return result;
    }

    public boolean isVar() {
        return var != null;
    }

    public boolean isNeg() {
        return isNeg != false;
    }

    public boolean isImplies() {
        return isImplies != false;
    }

    public boolean isAnd() {
        return isAnd != false;
    }

    public boolean isOr() {
        return isOr != false;
    }

    public String getVar() {
        if (!isVar()) {
            throw new RuntimeException(this + " no es una variable");
        }
        return var;
    }

    public PropTerm getOperand() {
        if (!isNeg()) {
            throw new RuntimeException(this + " no es una negacion");
        }
        return op1;
    }

    public Pair<PropTerm, PropTerm> getOperands() {
        if (!isAnd() && !isOr() && !isImplies()) {
            throw new RuntimeException(this + " no es una conjuncion, disjuncion o implicacion");
        }
        return new Pair<>(op1, op2);
    }

    @Override
    public String toString() {
        if (isVar()) {
            return var; 
        }else if (isNeg()) {
            return "!" + getOperand().toString(); 
        }else {
            Pair<PropTerm, PropTerm> p = getOperands();
            String op1 = p.getLeft().toString();
            String op2 = p.getRight().toString();
            if (isAnd()) {
                return "(" + op1 + " /\\ " + op2 + ")"; 
            }else if (isOr()) {
                return "(" + op1 + " \\/ " + op2 + ")"; 
            }else if (isImplies()) {
                return "(" + op1 + " -> " + op2 + ")"; 
            }else {
                throw new RuntimeException();
            }
        }
    }

}

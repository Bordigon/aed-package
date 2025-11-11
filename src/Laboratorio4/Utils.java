package aed.recursion;

import java.util.Comparator;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.map.*;
import javax.lang.model.util.ElementScanner14;

public class Utils {

    /*public static boolean isBalanced(String s) {

        functionAux(String, char, 0)
        return true;
    }

    /*
    private static boolean balancedAux(String s, char c, int index){
        char c2 = '';
        boolean result = false;
        boolean result1 = false;
        boolean result2 = false;
        if(!(opens(c) || closes(c)) && index<(s.length-1))
            return balancedAux(s, s.charAt(index++), index++);
        else if(index<(s.length-1)){
            if(opens(c)){
                c2 = s.charAt(index++);

                if(openc(c2)){
                    result1 = balancedAux(s, c2, index++);
                    result2 = balancedAux(s, c, index++); 
                    result = result1 && result2;
                }

                else if(closes(c2)&&!matches(c, c2)){
                    return balancedAux(s, c, index++);
                }
                else
                    result = true;
            }
        
        }

    }
    
     */
    public static boolean isBalanced(String s) {
        if (s.length() == 0) {
            return true;
        }
        System.out.println(s);
        boolean result = buscaOpens(s, s.charAt(0), 0);
        return result;
    }

    private static boolean buscaOpens(String s, char c, int index) {
        if (s.length() == index + 1 && !opens(c) && !closes(c)) {
            return true;
        } else if (opens(c)) {
            return buscaClose(s, s.charAt(index + 1), index + 1, c, index, false);
        } else if (index < (s.length() - 1) && !closes(c)) {
            return buscaOpens(s, s.charAt(index + 1), index + 1);
        } else {
            System.out.println("se ha ejecutado el else que devuelve false en buscaOpens");
            return false;
        }
    }

    private static boolean buscaClose(String s, char c, int index, char opens, int inicio, boolean esDoble) {
        boolean result = true;
        System.out.println("valor de esDoble " + esDoble);
        if (s.length() == index + 1 && !opens(c)) {
            return matches(opens, c);
        } else if (closes(c)) {

            // {[]}
            System.out.println("s " + s + " c " + c + " index " + index + " opens " + opens);
            if (!matches(opens, c)) {
                if (!esDoble) {
                    return false;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                System.out.println(index + " index dentro del else de buscaClose " + esDoble + " valor de esDoble");

                if (esDoble) {
                    return true;
                } else {
                    System.out.println(index + " index dentro del else de buscaClose sin esDoble");
                    return buscaOpens(s, s.charAt(index + 1), index + 1);
                }
            }
        } else if (opens(c)) {

            result = dobleClose(s, c, index, opens, inicio);
        } else if (esDoble) {
            result = false;
        } else {
            result = buscaClose(s, s.charAt(index + 1), index + 1, opens, inicio, false);
        }
        return result;
    }

//Pair<Boolean, Integer> = (bool, index)
    private static boolean dobleClose(String s, char c1, int index, char opens, int inicioC2) {
        int contador = index + 1;
        boolean result = false;
        try {
            if (s.length() > contador) {
                System.out.println(contador + " contador de dentro del dobleClose");
                if (!buscaClose(s, s.charAt(contador), contador, c1, index, true)) {
                    result = dobleClose(s, c1, contador, opens, inicioC2);
                } else if (s.length() > contador + 1) {
                    System.out.println("Entr'o en el else de dobleClose");
                    result = buscaClose(s, s.charAt(contador + 1), contador + 1, opens, inicioC2, false);
                }
            }
        } catch (IllegalArgumentException n) {
            return result;
        }
        return result;
    }

    private static boolean opens(char c) {
        return (c == '(' || c == '{' || c == '[');
    }

    private static boolean closes(char c) {
        return (c == ')' || c == '}' || c == ']');
    }

    private static boolean matches(char c1, char c2) {
        return ((c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}') || (c1 == '[' && c2 == ']'));
    }

    static public int findPeak(Integer[] arr) {

        return 0;
    }

    public static <E> PositionList<E> merge(PositionList<E> l1, PositionList<E> l2, Comparator<E> cmp) {
        PositionList<E> nuevaL = new NodePositionList<>();
        nuevaL = funcionAux(l1, l1.first(), l2, l2.first(), nuevaL, cmp);
        return nuevaL;
    }

    private static <E> PositionList<E> funcionAux(PositionList<E> l1, Position<E> elem1, PositionList<E> l2, Position<E> elem2, PositionList<E> l3, Comparator<E> cmp) {
        Position<E> auxP;
        if (elem1 == null && elem2 == null) {
            return l3;
        } else if (elem2 == null || (elem1 != null && cmp.compare(elem1.element(), elem2.element()) < 0)) {
            l3.addLast(elem1.element());
            auxP = l1.next(elem1);
            return funcionAux(l1, auxP, l2, elem2, l3, cmp);
        } else {
            l3.addLast(elem2.element());
            auxP = l2.next(elem2);
            return funcionAux(l1, elem1, l2, auxP, l3, cmp);
        }
    }

    public static boolean calculate(PropTerm t, Map<String, Boolean> env) {
        boolean result = true;
        Pair<PropTerm, PropTerm> terms;

        if (t.isVar()) {
            if (env.get(t.getVar()) == null) {
                throw new IllegalArgumentException();
            } else {
                return env.get(t.getVar());
            }
        } else if (t.isNeg()) {
            result = !calculate(t.getOperand(), env);
        } else {
            terms = t.getOperands();
            boolean result1 = calculate(terms.getLeft(), env);
            boolean resutl2 = calculate(terms.getRight(), env);

            if (t.isAnd()) {
                result = result1 && resutl2;
            } else if (t.isOr()) {
                result = result1 || resutl2;
            } else if (t.isImplies()) {
                result = !(result1 && !resutl2);
            }
        }
        return result;
    }
}

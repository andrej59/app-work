package ru.ajana.work.common;

/**
 * Created by Андрей on 12.12.2015.
 */
public class BlackBox {
    int varA;
    int varB;
    String strVal;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        BlackBox blackBox = (BlackBox) o;

        if (varA != blackBox.varA)
            return false;
        if (varB != blackBox.varB)
            return false;
        if (strVal != null ? !strVal.equals(blackBox.strVal) : blackBox.strVal != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = varA;
        result = 31 * result + varB;
        result = 31 * result + (strVal != null ? strVal.hashCode() : 0);
        return result;
    }

    BlackBox(int varA, int varB){
        this.varA = varA;
        this.varB = varB;
    }
}

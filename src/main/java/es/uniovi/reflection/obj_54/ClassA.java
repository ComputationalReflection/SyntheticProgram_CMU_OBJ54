package es.uniovi.reflection.obj_54;

public class ClassA {
    private int intVar;

    public ClassA(int intVar) {
        this.intVar = intVar;
    }

    public int getIntVar() {
        return intVar;
    }

    private void setIntVar(int intVar) {}

    @Override
    public String toString() {
        return "ClassA{intVar=" + intVar + "}";
    }
}

package es.uniovi.reflection.obj_54.noncompliant;

public class OBJ_54_CMU_Examples_Noncompliant {
    public void setBufferToNull(){ // Local scope
        int[] buffer = new int[100];
        doSomething(buffer);
        buffer = null;

        System.out.println("Hello");
    }
    public void doSomething(int[] buffer){
        System.out.println("doSomething " + buffer.length);
    }
}

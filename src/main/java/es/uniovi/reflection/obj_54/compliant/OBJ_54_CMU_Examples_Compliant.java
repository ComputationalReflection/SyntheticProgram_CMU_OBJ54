package es.uniovi.reflection.obj_54.compliant;

public class OBJ_54_CMU_Examples_Compliant {
    public void doNotSetBufferToNull(){ // Local scope
        {
            int[] buffer = new int[100];
            doSomething(buffer);
        }

        System.out.println("Hello");
    }
    public void doSomething(int[] buffer){
        System.out.println("doSomething " + buffer.length);
    }
}

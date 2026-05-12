package es.uniovi.reflection.obj_54.noncompliant;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.function.Function;

import es.uniovi.reflection.obj_54.ClassA;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class OBJ_54_Noncompliant {
    private Long longVar;
    public static Long longvar = 3L;
    public File f;
    int[] array;

    public void helpingCG() {
        Object o = new Object(), o2 = new Object();
        int a = o.hashCode();
        o = null;
        System.out.println(o);
        if (89 > "NKNK".length())
            o = null;
        else
            System.out.println("ELSE");
        for (int i = 0; i < 10; i++) {
            System.out.println(o2);
            o2 = null;
        }
        try {
        } catch (Exception e) {
            o2 = null;
        } catch (Error r) {
            a++;
        }
    }
    public void confusing(int i, String g) {
        synchronized (g) {

        }

        if (this.f != null) {
            int[] array;
            array = null;
        }
        else{
            array[8]++;
            System.out.println("Hello");
        }
        this.f = null;
        f = null;
        int[] array;
        this.array[6] = 0;
        array = null;
//        new ClassUse();
        // int a = ClassUse.getZ().fff.hashCode() + ClassUse.getZ().confusing(g,
        // i) + 2;

        switch ("MKOK".length()) {
            case 3:
                array = null;
            case 5:
                break;
            case 6:
                System.out.println(array);
        }
    }

    public OBJ_54_Noncompliant(){
        ClassA customClass = null;
        customClass = null;
    }

    public static void nonNullInitAndNullAssign(){
        ClassA customClass = new ClassA(5);
        if(customClass.getIntVar() > 6) {
            customClass = null;
        }else{
            customClass = new ClassA(customClass.getIntVar() + 6);
            System.out.println(customClass);
        }
    }

    private void withoutInitAtFirstThenNullInitAndNullAssign(){
        Runnable r = () -> {
            List<Double> doublesList;
            doublesList = null;
            doublesList = 5 - 4 > 5 / 2 ? new ArrayList<Double>() : null;
        };
        r.run();
    }

    protected void withoutInitAtFirstThenNonNullInitAndNullAssign(){
        Function<Integer, Integer> process = x -> {
            Integer squared;

            squared = x * x;
            int result = squared + 10;

            squared = null;

            return result;
        };

        System.out.println(process.apply(5));
    }

    void moreThanOneNullAssignInARow(int intVar){
        Float floatVar = 5f;
        switch (intVar) {
            case 1:
                floatVar += 5;
                floatVar = null;
                return;
            case 2:
                floatVar -= 15;
                break;
            case 3:
                floatVar -= 1;
            default:
                floatVar = null;
        }
        floatVar = null;
    }

    public void moreThanOneNullAssignNotInARow(){
        Short shortVar = 1;

        for (Short i = 1; i <= 10; i++) {
            if ((short)(i + shortVar) <= 3) {
                shortVar = (short)(shortVar + 1);
                continue;
            }

            if (i == 7) {
                shortVar = null;
                break;
            }
            System.out.println("Number: " + i);
        }
        shortVar = null;
    }

    public void otherVariableTypes(String stringVar) {
        this.longVar = 10L;
        stringVar = String.valueOf(longVar);
        stringVar = null;

        Long longVar;
        longVar = 5L;
        System.out.println(this.longVar + OBJ_54_Noncompliant.longvar + longVar);

//        longVar = OBJ_54_Noncompliant.longvar = this.longVar = null;
    }

    public void setNullInsideLoops(){
        int count = 1;

        while (count <= 5) {
            String stringVar = "hello";
            while (stringVar != null) {
                if (stringVar.length() > 1) {
                    // Remove one character from the end
                    stringVar = stringVar.substring(0, stringVar.length() - 1);
                } else {
                    stringVar = null;
                }
            }
            stringVar = null;

            System.out.println("Count is: " + count);
            count++;
        }
    }

    public String setNullInsideSwitch(int number){
        switch (number) {
            case 1 -> {return "One";}
            case 2 -> {
                String output, text = "Two";
                if((2 + 5) / 3 > 2){
                    return output = null;
                }else{
                    return text;
                }
            }
            case 3 -> {
                String text = "Three";
                int doubleValue = number * 2;
                String output = text + " (double: " + doubleValue + ")";
                text = null;
                return output;
            }
            default -> throw new IllegalStateException("Unknown");
        }

//        System.out.println(result);
    }

    public void setNullInsideFinallyBlock(){
        String varTry, varCatch, varFinally;

        try {
            int result = 10 / 0;
            varTry = "Assigned in try";
            System.out.println("Try block: " + varTry);
            varTry = null;
        } catch (ArithmeticException e) {
            varCatch = "Assigned in catch";
            System.out.println("Catch block: " + varCatch);
            varCatch = null;
        } finally {
            varFinally = "Assigned in finally";
            System.out.println("Finally block: " + varFinally);
            varFinally = null;
        }
    }

    public void setNullInsideCatchBlock(){
        String varTry, varCatch, varFinally;

        try {
            int result = 10 / 0;
            varTry = "Assigned in try";
            System.out.println("Try block: " + varTry);
            varTry = null;
        } catch (ArithmeticException e) {
            varCatch = "Assigned in catch";
            System.out.println("Catch block: " + varCatch);
            varCatch = null;
            varTry = null;
        } finally {
            varFinally = "Assigned in finally";
            System.out.println("Finally block: " + varFinally);
        }
    }

    public void setNullInsideTryBlock(){
        String varTry, varCatch, varFinally;

        try {
            varTry = "Assigned in try";
            int result = 10 / 0;
            System.out.println("Try block: " + varTry);
            varTry = null;
        } catch (ArithmeticException e) {
            varCatch = "Assigned in catch";
            System.out.println("Catch block: " + varCatch);
            varTry = null;
        } finally {
            varFinally = "Assigned in finally";
            System.out.println("Finally block: " + varFinally);
        }
    }

    public void setNullInsideTryWithResourcesBlock(){
        String filePath = "example.txt";
        String lineCopy1, lineCopy2, lineCopy3;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            lineCopy3 = lineCopy2 = lineCopy1 = reader.readLine();

            System.out.println("Line: " + lineCopy1 + ", " + lineCopy2 + ", " + lineCopy3);
            lineCopy1 = null;
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            lineCopy2 = null;
        } finally {
            System.out.println("Finished reading file.");
            lineCopy3 = null;
            filePath = null;
        }
    }

    public void doOperationsWithArrayBeforeSetNull(int intVar){
        Integer[] integersArray = {1, 2, 3, 4, 5};

        switch (intVar) {
            case 1:
                integersArray = null;
                integersArray[0] += 5;
                integersArray = null;
                break;
            case 2:
                integersArray = null;
                integersArray[intVar] -= 15;
                integersArray = null;
                break;
            case 3:
                integersArray = null;
                integersArray[intVar]++;
                integersArray = null;
                break;
            case 4:
                integersArray = null;
                integersArray[intVar]--;
                integersArray = null;
                break;
            case 5:
                integersArray = null;
                int x = integersArray[2];
                integersArray = null;
                //break;
            case 6:
                //integersArray = null;
                integersArray[0] = null;
                integersArray = null;
                break;
            case 7:
                integersArray = null;
                for (int i = 0; i < integersArray.length; i++) {
                }
                integersArray = null;
                break;
            case 8:
                integersArray = null;
                for (int num : integersArray) {
                    System.out.println(num);
                }
                integersArray = null;
                break;
            case 9:
                integersArray = null;
                Arrays.sort(integersArray);
                integersArray = null;
                break;
            case 10:
                integersArray = null;
                int index = Arrays.binarySearch(integersArray, 3);
                integersArray = null;
                break;
            case 11:
                integersArray = null;
                Integer[] copy = Arrays.copyOf(integersArray, integersArray.length);
                integersArray = null;
                break;
            case 12:
                integersArray = null;
                Arrays.fill(integersArray, 7);
                integersArray = null;
                break;
            case 13:
                integersArray = null;
                Integer[] even = (Integer[]) Arrays.stream(integersArray)
                        .filter(n -> n % 2 == 0)
                        .toArray();
                integersArray = null;
                break;
            case 14:
                integersArray = null;
                System.out.println(integersArray instanceof Integer[]);
                integersArray = null;
                break;
        }
    }

    public void doOperationsWithListBeforeSetNull(int intVar){
        List<String> stringsList = new ArrayList<>();

        switch (intVar) {
            case 1:
                stringsList = null;
                stringsList.add(null);
                stringsList = null;
                break;
            case 2:
                stringsList = null;
                String str = stringsList.get(0);
                stringsList = null;
                break;
            case 3:
                stringsList = null;
                stringsList.set(1, "B");
                stringsList = null;
                break;
            case 4:
                stringsList = null;
                stringsList.remove(0);
                stringsList = null;
                break;
            case 5:
                stringsList = null;
                for (String eachStr : stringsList) {
                }
                stringsList = null;
                break;
            case 6:
                stringsList = null;
                List<String> filtered = stringsList.stream()
                        .filter(n -> n.startsWith("C"))
                        .collect(Collectors.toList());
                stringsList = null;
                break;
        }
    }
    public void NullInitAndNonNullAssign() {
        String onlyNullInit = null;
        String onlyNonNullInit = "null";

        ClassA nullInitNonNullAssign = null;

        List<Integer> notInitAtBeginningThenNonNullInit;

        Integer[] notInitAtBeginningThenNullInit,
                notInitAtBeginningThenNullInitNonNullAssign,
                notInitAtBeginningThenNonNullInitNonNullAssign;

        ClassA nonNullInitNonNullAssign = new ClassA(7);
        nullInitNonNullAssign = nonNullInitNonNullAssign = new ClassA(6);

        notInitAtBeginningThenNullInit = notInitAtBeginningThenNullInitNonNullAssign = null;
        notInitAtBeginningThenNonNullInit = new ArrayList<>();

        notInitAtBeginningThenNullInitNonNullAssign = new Integer[] {null, null, null};
        notInitAtBeginningThenNonNullInitNonNullAssign = new Integer[] {1, 2, 3};
        notInitAtBeginningThenNonNullInitNonNullAssign = new Integer[0];
    }

    public void setNullInIfCondition() {
        Integer x;
        if ((x = 7) > 5) {
            System.out.println("x es mayor que 5. Valor de x: " + x);
            if ((x = null) == null) {
                System.out.println("...");
            }
        } else {
            System.out.println("x no es mayor que 5. Valor de x: " + x);
        }
    }
    public void setNullInsideModernSwitch(int number){
        String result = switch (number) {
            case 1 -> "One";
            case 2 -> {
                String output, text = "Two";
                if((2 + 5) / 3 > 2){
                    yield output = null;
                }else{
                    yield text;
                }
            }
            case 3 -> {
                String text = "Three";
                int doubleValue = number * 2;
                String output = text + " (double: " + doubleValue + ")";
                text = null;
                yield output;
            }
            default -> "Unknown";
        };

        System.out.println(result);
    }
    static {
        Integer i = 2;
        System.out.println(i);
        i = null;
    }
}

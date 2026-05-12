package es.uniovi.reflection.obj_54.compliant;

import es.uniovi.reflection.obj_54.ClassA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OBJ_54_Compliant {
    public static Long longvar = 3L;
    public File f;
    int[] array;
    private Long longVar;

    public OBJ_54_Compliant() {
        ClassA customClass = null;
    }

    public void closeable() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("NJKNJK")));
        BufferedReader br2 = new BufferedReader(new FileReader(new File("NJKNJK")));
        br.close();
        if (8 == "HBUHB".length())
            "IHHHOIJ".toCharArray();
        Function<Object, Boolean> c = (br = null)::equals; // <------
        for (int i = 0; i < 6; i++)
            System.out.println(i);
        br2.close();
        br.close();
    }

    public void compliantCloseable() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("NJKNJK")));
        br.close();
        if (8 == "HBUHB".length())
            "IHHHOIJ".toCharArray();
        Function<Object, Boolean> c = (br = null)::equals;
        for (int i = 0; i < 6; i++)
            System.out.println(i);
        br.close();
    }

    public void difficultCompliantCloseable() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("NJKNJK")));
        br.close();
        BufferedReader br2 = new BufferedReader(new FileReader(new File("NJKNJK")));
        try {
            if (8 == "HBUHB".length()) {
                if (8 == "HBUHB".length()) {
                    if (8 == "HBUHB".length())
                        "IHHHOIJ".toCharArray();
                    Function<Object, Boolean> c = (br = null)::equals;
                    if (8 == "HBUHB".length())
                        "IHHHOIJ".toCharArray();
                    int b;
                    for (int i = 0; i < 6; i++)
                        System.out.println(i + "" + (br = null));
                    assert (br.hashCode() == 9);
                } else {
                    try {
                        try {
                            assert (br.hashCode() == 9);
                            br2.close();
                        } finally {

                        }
                        br2.close();
                    } catch (AssertionError e) {
                        try {
                            throw new IllegalAccessError();
                        } finally {

                        }

                    } finally {

                    }
                    br2.close();
                }
            }
        } finally {
            br2.close();
        }
    }

    public void helpingCG() {
        Object o = new Object(), o2 = new Object();
        int a = o.hashCode();
        o = null;
        System.out.println(o);
        if (89 > "NKNK".length())
            System.out.println("IF");
        else
            System.out.println("ELSE");
        for (int i = 0; i < 10; i++) {
            System.out.println(o2);
            o2 = null;
        }
        try {
        } catch (Exception e) {
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
            Arrays.copyOf(array, 10);
        } else {
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
            case 5:
                break;
            case 6:
                System.out.println(array);
        }
    }

    public void NullInitAndNonNullAssign() {
        String onlyNullInit = null;
        String onlyNonNullInit = "null";

        ClassA nullInitNonNullAssign = null;

        List<Integer> notInitAtBeginningThenNonNullInit;

        Integer[] notInitAtBeginningThenNullInit, notInitAtBeginningThenNullInitNonNullAssign,
                notInitAtBeginningThenNonNullInitNonNullAssign;

        ClassA nonNullInitNonNullAssign = new ClassA(7);
        nullInitNonNullAssign = nonNullInitNonNullAssign = new ClassA(6);

        notInitAtBeginningThenNullInit = notInitAtBeginningThenNullInitNonNullAssign = null;
        notInitAtBeginningThenNonNullInit = new ArrayList<>();

        System.out.println(this.toString() + notInitAtBeginningThenNullInitNonNullAssign);

        notInitAtBeginningThenNullInitNonNullAssign = new Integer[]{null, null, null};
        notInitAtBeginningThenNonNullInitNonNullAssign = new Integer[]{1, 2, 3};
        notInitAtBeginningThenNonNullInitNonNullAssign = new Integer[0];
    }

    public Object setNullByOtherMethodInReturnStatement() {
        Object stringVar = "hello";
        return stringVar = getNullValue();
    }

    public void setNullByOtherMethod() {
        Object stringVar = "hello";
        stringVar = getNullValue();
    }

    public void setNullInInvocationToOtherMethod() {
        String stringVar = "hello";
        System.out.println(stringVar = stringVar.length() < 3 ? stringVar : null);
    }

    public static void nonNullInitAndNullAssign() {
        ClassA customClass = new ClassA(5);
        if (customClass.getIntVar() <= 6) {
            customClass = new ClassA(customClass.getIntVar() + 6);
            System.out.println(customClass);
        }
    }

    public void moreThanOneNullAssignNotInARow() {
        Short shortVar = 1;

        for (Short i = 1; i <= 10; i++) {
            if ((short) (i + shortVar) <= 3) {
                shortVar = (short) (shortVar + 1);
                continue;
            }

            if (i == 7) {
                break;
            }
            System.out.println("Number: " + i);
        }
    }

    public String otherVariableTypesSol1(String stringVar) {
        this.longVar = 10L;
        stringVar = String.valueOf(longVar);
        stringVar = null;

        Long longVar;
        longVar = 5L;
        System.out.println(this.longVar + OBJ_54_Compliant.longvar + longVar);

        OBJ_54_Compliant.longvar = this.longVar = null;
        return stringVar;
    }

    public Long otherVariableTypesSol2(String stringVar) {
        this.longVar = 10L;
        stringVar = String.valueOf(longVar);

        Long longVar;
        longVar = 5L;
        System.out.println(this.longVar + OBJ_54_Compliant.longvar + longVar);

        return longVar = OBJ_54_Compliant.longvar = this.longVar = null;
    }

    public void setNullInsideLoops() {
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

            System.out.println("Count is: " + count);
            count++;
        }
    }

    public void setNullInsideFinallyBlock() {
        String varTry, varCatch, varFinally;

        try {
            int result = 10 / 0;
            varTry = "Assigned in try";
            System.out.println("Try block: " + varTry);
        } catch (ArithmeticException e) {
            varCatch = "Assigned in catch";
            System.out.println("Catch block: " + varCatch);
        } finally {
            varFinally = "Assigned in finally";
            System.out.println("Finally block: " + varFinally);
        }
    }

    public void setNullInsideCatchBlock() {
        String varTry, varCatch, varFinally;

        try {
            int result = 10 / 0;
            varTry = "Assigned in try";
            System.out.println("Try block: " + varTry);
        } catch (ArithmeticException e) {
            varCatch = "Assigned in catch";
            System.out.println("Catch block: " + varCatch);
            varFinally = null;
        } finally {
            varFinally = "Assigned in finally";
            System.out.println("Finally block: " + varFinally);
        }
    }

    public void setNullInsideTryBlock() {
        String varTry, varCatch, varFinally;

        try {
            varTry = "Assigned in try";
            int result = 10 / 0;
            System.out.println("Try block: " + varTry);
        } catch (ArithmeticException e) {
            varCatch = "Assigned in catch";
            System.out.println("Catch block: " + varCatch);
        } finally {
            varFinally = "Assigned in finally";
            System.out.println("Finally block: " + varFinally);
        }
    }

    public void setNullInsideTryWithResourcesBlock() {
        String filePath = "example.txt";
        String lineCopy1, lineCopy2 = "null", lineCopy3;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            lineCopy3 = lineCopy2 = lineCopy1 = reader.readLine();

            System.out.println("Line: " + lineCopy1 + ", " + lineCopy2 + ", " + lineCopy3);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            lineCopy2 = null;
        } finally {
            System.out.println("Finished reading file." + lineCopy2);
        }
    }

    public void doOperationsWithArrayAfterSetNull(int intVar) {
        Integer[] integersArray = {1, 2, 3, 4, 5};

        switch (intVar) {
            case 1:
                integersArray = null;
                integersArray[0] += 5;
                break;
            case 2:
                integersArray = null;
                integersArray[intVar] -= 15;
                break;
            case 3:
                integersArray = null;
                integersArray[intVar]++;
                break;
            case 4:
                integersArray = null;
                integersArray[intVar]--;
                break;
            case 5:
                integersArray = null;
                int x = integersArray[2];
                break;
            case 6:
                integersArray = null;
                integersArray[0] = null;
                break;
            case 7:
                integersArray = null;
                for (int i = 0; i < integersArray.length; i++) {
                }
                break;
            case 8:
                integersArray = null;
                for (int num : integersArray) {
                    System.out.println(num);
                }
                break;
            case 9:
                integersArray = null;
                Arrays.sort(integersArray);
                break;
            case 10:
                integersArray = null;
                int index = Arrays.binarySearch(integersArray, 3);
                break;
            case 11:
                integersArray = null;
                Integer[] copy = Arrays.copyOf(integersArray, integersArray.length);
                break;
            case 12:
                integersArray = null;
                Arrays.fill(integersArray, 7);
                break;
            case 13:
                integersArray = null;
                Integer[] even = (Integer[]) Arrays.stream(integersArray).filter(n -> n % 2 == 0).toArray();
                break;
            case 14:
                integersArray = null;
                System.out.println(integersArray instanceof Integer[]);
                break;
        }
    }

    public void doOperationsWithListAfterSetNull(int intVar) {
        List<String> stringsList = new ArrayList<>();

        switch (intVar) {
            case 1:
                stringsList = null;
                stringsList.add(null);
                break;
            case 2:
                stringsList = null;
                String str = stringsList.get(0);
                break;
            case 3:
                stringsList = null;
                stringsList.set(1, "B");
                break;
            case 4:
                stringsList = null;
                stringsList.remove(0);
                break;
            case 5:
                stringsList = null;
                for (String eachStr : stringsList) {
                }
                break;
            case 6:
                stringsList = null;
                List<String> filtered =
                        stringsList.stream().filter(n -> n.startsWith("C")).collect(Collectors.toList());
                break;
        }
    }

    public void cfgInLoopWithoutBreak() {
        Short shortVar = 1;

        for (Short i = 1; i <= 10; i++) {
            if ((short) (i + shortVar) <= 3) {
                shortVar = (short) (shortVar + 1);
                continue;
            }

            if (i == 7) {
                shortVar = null;
                if (this.toString().contains("CFG rules"))
                    break;
            }
            System.out.println("Number: " + i);
        }
    }

    public void cfgInLoopWithoutBreak2() {
        Short shortVar = 1;

        for (Short i = 1; i <= 10; i++) {

            if (i == 7) {
                shortVar = null;
                continue;
            } else {
                System.out.println("Number: " + shortVar);
            }
            System.out.println("Number: " + i);
        }
    }

    void moreThanOneNullAssignInARow(int intVar) {
        Float floatVar = 5f;
        switch (intVar) {
            case 1:
                floatVar += 5;
                break;
            case 2:
                floatVar -= 15;
                break;
            case 3:
                floatVar -= 1;
        }
    }

    protected void withoutInitAtFirstThenNonNullInitAndNullAssign() {
        Function<Integer, Integer> process = x -> {
            Integer squared;

            squared = x * x;
            int result = squared + 10;

            return result;
        };

        System.out.println(process.apply(5));
    }

    private Object getNullValue() {
        return null;
    }
}

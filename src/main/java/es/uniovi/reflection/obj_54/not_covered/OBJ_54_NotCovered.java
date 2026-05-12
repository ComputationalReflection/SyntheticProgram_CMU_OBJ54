package es.uniovi.reflection.obj_54.not_covered;

import es.uniovi.reflection.obj_54.noncompliant.OBJ_54_Noncompliant;

public class OBJ_54_NotCovered {

    private Long longVar;
    public static Long longvar = 3L;

    // FALSE POSITIVE NOT COVERED!!
    //    public void setNullInsideModernSwitch(int number) {
    //        String result = switch (number) {
    //            case 1 -> "One";
    //            case 2 -> {
    //                String output, text = "Two";
    //                output = null;
    //                if ((2 + 5) / 3 > 2) {
    //                    yield output;
    //                } else {
    //                    yield text;
    //                }
    //            }
    //            case 3 -> {
    //                String text = "Three";
    //                int doubleValue = number * 2;
    //                String output = text + " (double: " + doubleValue + ")";
    //                yield output;
    //            }
    //            default -> "Unknown";
    //        };
    //
    //        System.out.println(result);
    //    }

    public void assignmentOfAssignmentOfNull() {
        Integer[] notInitAtBeginningThenNullInit = new Integer[5], notInitAtBeginningThenNullInitNonNullAssign =
                new Integer[4];

        System.out.println(
                this.toString() + notInitAtBeginningThenNullInitNonNullAssign + notInitAtBeginningThenNullInit);
        notInitAtBeginningThenNullInit = notInitAtBeginningThenNullInitNonNullAssign = null;

        System.out.println(this.toString() + notInitAtBeginningThenNullInitNonNullAssign);

    }

    public void NullInitAndNonNullAssign() {
        Integer i = 2;
        System.out.println(i);
        i = null; //Unnecessary null assignment
        i = 5;
        System.out.println(i);
    }

    public void otherVariableTypes(String stringVar) {
        this.longVar = 10L;
        stringVar = String.valueOf(longVar);

        Long longVar;
        longVar = 5L;
        System.out.println(this.longVar + OBJ_54_Noncompliant.longvar + longVar);

        longVar = OBJ_54_Noncompliant.longvar = this.longVar = null;
    }
}

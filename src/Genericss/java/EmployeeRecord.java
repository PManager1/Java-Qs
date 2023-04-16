package Genericss.java;

public record EmployeeRecord (String name, int employeeNumber){


//    Methods
    public static void printWhatever(){
        System.out.println("Print whatever");
    }

}

//Records are immutable by default.

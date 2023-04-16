package Genericss.java;

public class EmployeeRecords {

    public static void main(String[] args) {
//        EmployeeRecord e1 = new EmployeeRecord("Satish", 123234);
//            System.out.println("e1 - " +  e1.name());
//
//            System.out.println("e1 - " + e1.employeeNumber());
//
//        System.out.println("e1 toString - " + e1);
//
//        System.out.println("hashCode -> " + e1.hashCode());
//
//            EmployeeRecord.printWhatever();


            String string1 = new String ("hello");
            String string2 = new String ("hello");


//  Double Equals == works for the primitive types like int, double, char, byte, but not for the
//  Sting type.
            if ( string1 == string2){
                System.out.println(" string1 equal strign 2 ");
            } else {
                System.out.println(" string1 Not equal strign 2 ");
            }


        if ( string1.equals(string2)  ){
            System.out.println("obj string1 equal strign 2 ");
        } else {
            System.out.println("obj string1 Not equal strign 2 ");
        }


    }
}

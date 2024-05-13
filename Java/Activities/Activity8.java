package org.activity8;

public class Activity8 {

    public static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        try {
            exceptionTest("Will print to console");
            exceptionTest(null); // Exception is thrown here
        } catch(CustomException msg) {
            System.out.println("Inside catch block: " + msg.getMessage());
        }
    }
}

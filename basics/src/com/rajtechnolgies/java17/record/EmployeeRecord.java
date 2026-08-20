package com.rajtechnolgies.java17.record;

public record EmployeeRecord(String name,String email, int age) {
    public static void main(String[] args) {
        EmployeeRecord employeeRecord=new EmployeeRecord("Raj","<EMAIL>",20);
        System.out.println(employeeRecord);
        System.out.println(employeeRecord.name());
        System.out.println(employeeRecord.email());
        System.out.println(employeeRecord.age());
    }
}

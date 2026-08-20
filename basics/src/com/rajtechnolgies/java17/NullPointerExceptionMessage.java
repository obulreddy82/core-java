package com.rajtechnolgies.java17;
class Employee{
    private String name;
    private int id;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
public record NullPointerExceptionMessage(Employee employee) {
    public static void main(String[] args) {
            Employee employee=null;
            employee.getName();
            NullPointerExceptionMessage nullPointerExceptionMessage=new NullPointerExceptionMessage(employee);
            System.out.println(nullPointerExceptionMessage);
    }
}


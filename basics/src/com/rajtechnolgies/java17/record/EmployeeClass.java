package com.rajtechnolgies.java17.record;

public class EmployeeClass {
    private String name;
    private String email;
    private int age;

    //Constructor
    public EmployeeClass(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
    //Getter
    public String getName() {
        return name;
    }
    public String getEmail() {

        return email;
    }
    public int getAge() {
        return age;
    }
    //hashcode

    @Override
    public int hashCode() {
            return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public String toString() {
        return "EmployeeClass{" + "name=" + name + ", email=" + email + ", age=" + age + '}';
    }

    public static void main(String[] args) {
        EmployeeClass employee = new EmployeeClass("Raj", "<EMAIL>", 25);
        System.out.println(employee.getName());
        System.out.println(employee.getEmail());
        System.out.println(employee.getAge());
    }
}

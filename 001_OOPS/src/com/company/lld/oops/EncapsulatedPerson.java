package com.company.lld.oops;

/**
 * Use of encapsulation
 */
public class EncapsulatedPerson {
    private String name;
    private String role;
    private int age;

    /**
     * Getter method for name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for Role
     * @return
     */
    public String getRole() {
        return role;
    }

    /**
     * Setter method for Role
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Getter method for Age
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * Age Setter with validation
     * @param age
     */
    public void setAge(int age) {

        if(age>=0) {
            this.age = age;
            System.out.println("Setting age as "+age);
        }else{
            System.out.println("Bad Value for Age!");
            throw(new RuntimeException());
        }
    }
}

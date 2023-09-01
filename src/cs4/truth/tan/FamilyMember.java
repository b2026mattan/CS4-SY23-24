/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4.truth.tan;

/**
 *
 * @author andrei
 */
public class FamilyMember {
    // fields
    String name;
    int age;
    String relation;
    
    static int memberNumber = 1;
    
    // constructors
    public FamilyMember(String n, int a, String r) {
        name = n;
        age = a;
        relation = r;
    }
    
    // methods
    public void DisplayInfo() {
        System.out.println("Family Member " + memberNumber++);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Relation: " + relation + "\n");
    }
}

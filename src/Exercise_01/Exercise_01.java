/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_01;

/**
 *
 * @author andrei
 */
public class Exercise_01 {
    public static void main(String[] args) {
        FamilyMember mother = new FamilyMember("Mary Jane Tuayon", 49, "Mother");
        mother.DisplayInfo();
        
        FamilyMember father = new FamilyMember("Antonio Tan Jr.", 54, "Father");
        father.DisplayInfo();
        
        FamilyMember sister = new FamilyMember("Mariella Ngo", 25, "Sister");
        sister.DisplayInfo();
        
        System.out.println("Total age: " + (mother.age + father.age + sister.age));
        System.out.println("My father is older than my mother: " + (father.age > mother.age));
        System.out.println("My sister is Mary Jane Tuayon: " + "Mary Jane Tuayon".equals(sister.name));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas123;

/**
 *
 * @author Windows 8.1
 */
public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if(newAge >= 18 && newAge <= 30 ){
            age = newAge;
        }
        else{
            age = 0;
            System.out.println("Umur Anda Tidak Memenuhi Syarat");
        }
    }
   
}

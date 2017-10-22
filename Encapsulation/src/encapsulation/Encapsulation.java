/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author EsraaHus93
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person[] personArray;  // declares a variable 'personArray' of type Person array.
        personArray = new Person[4];  // creates slots to hold seven persons. No Person is created yet.

        personArray[0] = new Person();
        personArray[1] = new Person("esraa", "husamia", "amman",1993,"jordanian", "amman", 15, "160" ,false);
        personArray[2] = new Person("doaa", "al safade", "moon",1994,"jordanian", "amman", 100, "165" ,false);
        personArray[3] = new Person("mazen", "al chalah", "amman",1993,"syrian", "amman", 77, "165" ,true);


          for (int i=0;i<4;i++)
         {
          System.out.println(personArray[i].getFirstName());
          }

          
          Task t = new Task();
          Task t1 = new Task();
          Task t2 = new Task();

          System.out.println(t2.taskNo);
    }
   
}

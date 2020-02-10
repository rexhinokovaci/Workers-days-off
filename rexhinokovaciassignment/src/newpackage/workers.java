//if you're seeing this give me an A+

package newpackage;

import java.util.Scanner; // import scanner to get users values to make our software flexible


public class workers {
    
    Scanner sc = new Scanner (System.in); // we have created a scanner object "sc"
    
     int [][]  Holiday;
     private int ID;
     private String name[];
     public int reqh; // *requested holiday but i got lazy and used reqh so the software pseudo-code would be cooler
     public String thelist[][]={
         // I declared them private because Id and the name of our worker is VERY SENSITIVE and we should not share them or make them public
        // i created a string array called thelist where it will store and accept only characters and our names;
        
        
         {"1","20","Rexhino Kovaci"},
         {"2","20","Edvin Buta"},
         {"3","20","Ilir Basha"},
         {"4","20","Arben Shehu"},
         {"5","20","Lulzim Berisha"},
         {"6","20","Kristaqi Edvin"},
         {"7","20","Mimoza Gugu"},
         {"8","20","Dashamir Junior"},
         {"9","20","Sali Prifti"},
         {"10","20","Erion Hoxha"},
         {"11","20","Eroland Hoxha"},
         {"12","20","Elvana Gjata"},
         {"13","20","Frank Janki"},
         {"14","20","Glen Gugu"},
         {"15","20","Xhoel Gjata"},
         {"16","20"," Keti LLeshi"},
         

     }; // end of thelist array
     

public workers (){ // default constructor but it takes the responsibility to handle every workere in our array where workers are stored
    
      System.out.println("All our Workers of the Company for 2020"+ "\n"+"-    -   -   -   -   -");
        for (String[] Thelist1 : thelist) {
            System.out.println("Worker name:" + Thelist1[2] + ",Remaining Days:(" + Thelist1[1] + ")");
        }
         System.out.println("Please enter your id to enter");
   
        this.Holiday= new int[][]{{1,2,3,4,5,6,7,8,9,10}, {20}};

        this.name=new String[]{"Rexhino Kovaci","Edvin Buta","Iir Basha","Arben Shehu","Lulzim Berisha","Kristaqi Edvin","Mimoza Gugu","Dashamir Junior","Sali Prifti","Erion Hoxha", "Eroland Hoxha", "Elvana Gjata", "Frank Janki", "Glen Gugu", "Xhoel Gjata", "Keti Lleshi"};
    
   ID=sc.nextInt(); // the user input will be save in the ID variable we declatred above and it's a private one
    
}

public workers(int id){ // constructor with one parameters
    this.ID=ID;
// this keyword is a special method where we use to specify the variable so the compiler will find it and use it as ID
   
}
public workers(int Holidays,int[][]IdHoliday){ // constructor with two parameters
    this.reqh=reqh;
   this.Holiday=Holiday; 
   
   
    
}

/* NOW WE USE GETTERS AND SETTERS, Getters and setters encapsulate the fields of a class by making them accessible 
only through its public methods and keep the values themselves private.
*/

 public int getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID = ID;
      
    }
    public String []getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }
// end fo getters and setters
    
    
    // now we have our methods we need to show our user how many days he wil take and how many will be avaible
    public void Days(){
        System.out.println("You have: "+ Holiday[1][0]+ " days avaible for holidays");
    }
    
public void  Task(){
    System.out.println("Select the number of holidys you want to take:");
    

} // the user will put the numbers how many days he wants to take and we will take them to our methods
public int Holidays(){
    reqh=sc.nextInt();
    if(reqh<=this.Holiday[1][0]){
        System.out.println("Accepted");
    }
    else {
        System.err.println("Not Accepted");
        System.exit(0); // if it is more than 20 it will not be accepted
    }
    return reqh; // this will return the requsted holidays that the user has asked
}
public void IdHoliday(int [][]IdHoliday){
    this.Holiday=Holiday;
}
    public int getIdHoliday() {
        return reqh ;
    }
 

    

    // I've used toString as a string representaion as it will be able to cover all the needed varibales and call them and get the value back and show them to the user

@Override
    public String toString() {
        
     return "Hello " + "("+ ID + ")"+ name[ID-1] + "! Your request for taking a rest has been accepted! " +" Your request is:  "+ reqh + " days. "+"You'll have:  " + (this.Holiday[1][0]-reqh) + " days Left" ;
     
    } // end of toString
    
}// end of class
    


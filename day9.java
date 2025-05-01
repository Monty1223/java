// class student{
//     String firstname="monty";
//     int age= 18;
//     void name(){
//         System.out.println(firstname + " "+ age);
//     }



//     public student(String firstname,int age) {
//         this.firstname=firstname;
//         age=age;
//         System.out.println(firstname +"  "+ age);

//     }
    
// }
// public class day9{
//     public static void main(String[] args) {
        
//         student obj2=new student("dhnendhra",20);
//         student obj1=new student("karunendhra", 21);
        
        
        
//     }

// }



class student{
    String firstname="monty";
    int age=18;

     student() {
        System.out.println("hello");

    }
    student(String firstname){
        this();
        System.out.println(firstname);


    }
    student(String firstname,int age){
        this(firstname);
         System.out.println(firstname + "  "+age);
    }
    
}
public class day9{
    public static void main(String[] args) {
        student obj=new student("monty",18);
    }
}
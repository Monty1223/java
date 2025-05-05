 // method overloading
//  class perent{
//     void sum(int a){
//         System.out.println(" don no." + a);
//     }
//     void sum(int a, int b) {
//         System.out.println( a+b);
//     }
//     void sum(int a,int b,int c){
//         System.out.println(  a+b+c);
//     }
//  }
//  public class day11 {
//     public static void main(String[] args) {
//       perent obj =new perent() ;
//       obj.sum(420); 
//       obj.sum(420,500);
//       obj.sum(420, 500, 100);
//     }
    
// }

// class perent{
//     void sum(int a){
//         System.out.println(a);
//     }
//     void sum(int a,int b){
//         System.out.println(a+b);
//     }
//     void sum (double a, double b){
//         System.out.println(a+b);
//     }
//     void sum ( int a,int b,int c){
//         System.out.println(a+b+c);
//     }
// }
// public class day11{
//     public static void main(String[] args) {
//         perent obj=new perent();
//         obj.sum(420);
//         obj.sum(420, 200);
//         obj.sum(4.4, 2.2);
//         obj.sum(420, 200, 300);
//     }
// }


class shape{
    
    void area(int a){
        System.out.println(a*a);
    }
    void area(int a, int b){
        System.out.println(a*b);

    }
    void area(double a, double b, double c){
        
        System.out.println(a*b*c);
    }
   // void area(float  a,float r,float b,float c ){
      //  System.out.println(a*a*r);
    }

public class day11{
    public static void main(String[] args) {
        
        shape obj=new shape();
        obj.area(20);
        obj.area(20, 30);
        obj.area(20, 30 ,0.5);
       // obj.area(20, 3.14, 1, 1);
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Base a=new Base() ; //object can't be created must overide greet method

           Base a =new Base() {
               @Override
               public void greet() {

               }
           };

//           Base1 a=new Base(); //not possibble



          Base1 b = new Base1(); // possible
//          Base2 c=new Base2() not possible as base 2 is abstract class must implements its methods



    }
}
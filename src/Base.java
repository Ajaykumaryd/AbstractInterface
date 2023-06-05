public abstract class Base { //abstract added to make class valid

    public Base(){
        System.out.println("I am constructor of Class Base");
    }

    public abstract void greet();   //abstract class

}
      class Base1 extends Base{

       @Override
       public void greet(){
           System.out.println("Ajay");
       }

        }

      abstract class Base2 extends Base{    //here either we use method abstract or we should override greet method to class valid

    public void th(){

        System.out.println("");
    }
    @Override
    public void greet() {

    }
    }




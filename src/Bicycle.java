public interface Bicycle {
      void Applybrake(int dec);
      int a=6;
      void speedUp(int inc);
}

class AvonCycle implements Bicycle,Bike{


       void BlowHorn(){
             System.out.println("Pooo Pooo");
       }
      @Override
      public void Applybrake(int dec) {  //evrey method must be made public

      }

      @Override
      public void speedUp(int inc) {

      }


      public static void main(String[] args){
            //        Interfaces
            AvonCycle cycleAjay=new AvonCycle();
            cycleAjay.Applybrake(1);
//          You Can Create Properties in Interfaces
            System.out.println(cycleAjay.a);


//           But properties can't be modified in Interfaces as they are finals
            cycleAjay.a=25; //not possible
      }


      @Override
      public void Speed(int speed) {

      }
}
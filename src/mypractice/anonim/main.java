package mypractice.anonim;

public class main {
    public static void main(String[] args) {
//        Computer comp = new Computer();
//        comp.i7.start();
//        comp.trancfer.start();
        new Computer(){
          void superComp(){
              this.i7.start();
              this.trancfer.start();
          }
        };
    }
}

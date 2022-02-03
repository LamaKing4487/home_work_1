package mypractice.anonim;

public class Computer {
    class Processor{
        private boolean isStart = false;

        public void start (){
            isStart = true;
        }
        public void shutdown (){
            isStart = false;
        }
    }
    class Ram {
        private boolean isStart = false;

        public void start() {
            isStart = true;
            System.out.println("isStart = "  + isStart);
        }

        public void shutdown() {
            isStart = false;
        }
    }
    Processor i7 = new Processor();
    Ram trancfer = new Ram();
}

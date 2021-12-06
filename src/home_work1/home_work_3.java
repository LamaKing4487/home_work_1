package home_work1;

public class home_work_3 {
    public static void main(String[] args) {
        double a = 4536/23;
        double b = 7685.984;
        System.out.println(Math.nextAfter(a, b)); //197.00000000000003
        System.out.println("-----------------------------");
        System.out.println(Math.rint(1.3));         //1.0
        System.out.println(Math.rint(1.5));         //2.0
        System.out.println(Math.rint(2.5));         //2.0
        System.out.println(Math.rint(-2.3));         //-2.0
        System.out.println("-----------------------------");
        System.out.println (Math.round(1.5f)); // 2
        System.out.println (Math. round (1.5)); // 2
        System.out.println (Math. round (1.3f)); // 1
        System.out.println (Math. round (-1.3)); // - 1
        System.out.println("-----------------------------");
        System.out.println(Math.floor(1.2));         //1.0
        System.out.println(Math.floor(-3.3));         //-4.0
        System.out.println("-----------------------------");
        System.out.println(Math.ceil(1.3));          //2.0
        System.out.println(Math.ceil(-3.8));          //-3.0
        System.out.println("-----------------------------");
        System.out.println (Math.random ()); // 0-1 псевдослучайное число
        System.out.println("-----------------------------");
        System.out.println(Math.max(1, 3));       //3
        System.out.println("-----------------------------");
        System.out.println(Math.min(1, 3));       //1
        System.out.println("-----------------------------");
        System.out.println(Math.abs(-4));       //4
        System.out.println(Math.abs(4));       //4
        System.out.println("-----------------------------");
        System.out.println(Math.sqrt(4));       //2.0
        System.out.println("-----------------------------");
        System.out.println(Math.cbrt(27));       //3.0
        System.out.println("-----------------------------");
        System.out.println(Math.pow(2,3));       //8.0
        System.out.println("-----------------------------");
        System.out.println(Math.sin(Math.toRadians(30))); //0.49999999999999994
        System.out.println(Math.cos(Math.toRadians(30))); //0.8660254037844387
        System.out.println(Math.acos(0)); //1.5707963267948966
        System.out.println("-----------------------------");
        System.out.println(Math.floorDiv(7, 2)); // 3
        System.out.println("-----------------------------");
        System.out.println(Math.scalb(5, 3)); // 5*2*2*2 = 40
        System.out.println("-----------------------------");
        System.out.println(Math.signum(2.3)); // 1
        System.out.println("-----------------------------");
        System.out.println(Math.toRadians(90)); // 1,57079
        System.out.println(Math.subtractExact(5, 6)); //-1
    }
}

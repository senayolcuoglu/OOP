public class driverClass {
    public String tellTime(clock a){
        return a.tellTime();
    }
    public static void main(String[] args){
    cookcuuClock bird = new cookcuuClock(15,0);
    cookcuuClock bird2 = new cookcuuClock(18,29);

    sundial sun = new sundial(15,7);
    sundial sun2 = new sundial(20,7);
    wristWatch ww = new wristWatch(13, 9);
    driverClass driClass = new driverClass();

    System.out.println("\n-------------");
    System.out.println("Cookcuu Clock: ");
    System.out.println(driClass.tellTime(bird));
    System.out.println(driClass.tellTime(bird2));

    System.out.println("-------------");
    System.out.println("Sundial Clock: ");
    System.out.println(driClass.tellTime(sun));
    System.out.println(driClass.tellTime(sun2));

    System.out.println("-------------");
    System.out.println("Wrist Watch: ");
    System.out.println(driClass.tellTime(ww));
    System.out.println("The angle between 2 arms is: " + ww.tellAngle());
    }
}

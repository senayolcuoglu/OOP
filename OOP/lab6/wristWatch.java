
public class wristWatch extends clock {
    private int angle;
    private int arm1,arm2;
    public int a,b;

    public wristWatch(int hour,int minute){
        super(hour,minute);
    }

    @Override
    public String tellTime() {
        return super.tellTime();
    }
    public int tellAngle(){
        a= getHour();
        b=getMinute();
        if(a<13 && a>0){
            arm1=a*5;
        }
        else{
            a=(a-12);
            arm1= (a*5);
        }
        arm2=b;

        if(arm1>=arm2){
           angle = (arm1-arm2)*6;
        }
        else{
            angle = (arm2-arm1)*6;
        }
        return angle;

    }
}



public class cookcuuClock extends clock {
    public String s;
    public cookcuuClock(int hour,int minute){
        super(hour,minute);
    }

    @Override
    public String tellTime(){
        int a = getHour();
        int m= getMinute();
        if(a>0 && a<25 && getMinute() >-1 && getMinute()<60){
            if(a<25 && a>12 && getMinute()==0){
                a = a-12;
                for(int k=0;k<a;k++){
                    System.out.println("(" + (k+1) + ")" + "cookcuu!");
                }
                return String.format("%02d",a) + "." + String.format("%02d",m);
            }

            else if(a<13 && a>0 && getMinute()==0){
                for(int k=0;k<a;k++){
                    return "(" + (k+1) + ")" + "cookcuu!";
                }
            }   
            else{
                return getHour()+ "." +getMinute();
            } 
        }
        else{
            return "Wrong hour or minute value.";
        }
        return null;
    }
}


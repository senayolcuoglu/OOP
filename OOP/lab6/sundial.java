public class sundial extends clock {
    public sundial(int hour, int minute){
        super(hour,minute);
    }

    @Override
   public String tellTime(){
        if(getHour()<20 && getHour()>7 && getMinute()>-1 && getMinute()<60){
            if(getHour()<10 && getHour()>-1){
                if(getMinute()<10 && getMinute()>-1){
                    return "0" +getHour() + "." + "0" + getMinute();
                }
                else{
                     return "0" +getHour() + "." + getMinute();
                }
            }

            else {
                if(getHour()<20 && getHour()>9){
                    if(getMinute()<10 && getMinute()>-1){
                        return getHour() + "." + "0" + getMinute();
                    }
                    else{
                        return getHour() + "." + getMinute();
                    }

                }
            }
        }
        
        else{
            return "It's not day time!";
        }
        return null;
    }
}

public class clock {
    private int hour;
    private int minute;

     public clock(int hour,int minute){
        this.hour=hour;
        this.minute=minute;
    }

    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    
    //we are setting the values of hour and minute.
    public String tellTime(){
        if(this.hour>24 || this.hour<-1 || this.minute<0 || this.minute>59){  
            return "This is not a valid hour or minute value!";                  //in this part it's telling telling the invalid values
        }

        else if(this.hour<25 && this.hour>12 && this.minute<60 && this.minute >-1){                  //in this part it tells time for hours between 13-24
            if(this.hour == 24){
                this.hour=00;
                if(this.minute<10 && this.minute>-1){
                    return "0" +this.hour + "." + "0"+ this.minute + "am";
                }
                else{
                    return "0" +this.hour + "." + this.minute + "am";
                }
            }

            else{                                                                                  //when the hour value in this scope is not equals to 24
                this.hour= (this.hour-12);                                                      //it subtract 12 so that we can make pm/am system
                if(this.minute<10 && this.minute>-1){
                    return this.hour + "." + "0" + this.minute + "pm";
                }
                else{
                    if(this.minute<10 && this.minute>-1){
                        return this.hour + "." + "0" + this.minute + "pm";
                    }
                    else{
                        return this.hour + "." + this.minute + "pm";
                    }
                }
            }
        }

        else if(this.hour<13 && this.hour>0 && this.minute<60 && this.minute >-1){                  //in this part we are looking for the values betweeen 1-12
            if(this.hour<10 && this.hour>0){                                                        //here it looks for the values for 1-9 
                if(this.minute>-1 &&this.minute<10){
                    return "0" +this.hour + "." + "0"+ this.minute + "am";
                }
                else{
                    return "0" +this.hour + "." + this.minute + "am";
                }
            }
            else if(this.hour>9 && this.hour<13){                                                   
                if(this.hour==12){      //in this part it checks if the hour value is 12 so that it won't put "am" as time.
                    if(this.minute>-1 &&this.minute<10){
                        return this.hour + "." + "0" + this.minute + "pm";
                    }
                    else{
                        return this.hour + "." + this.minute + "pm";
                    }
                }
                else{       //it arranges time for the values 10 and 11.
                    if(this.minute>-1 &&this.minute<10){
                        return this.hour + "." + "0" + this.minute + "am";
                    }
                    else{
                        return this.hour + "." + this.minute + "am";
                    }
                }
            }
        }
        return null;
    }
}



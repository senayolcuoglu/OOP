public class checkingAccount extends account {
    private double limit;
    public checkingAccount(int accNum, double accBalance, double limit){
        super(accNum,accBalance);
        this.limit=limit;
    }

    double b= getaccBalance();

    public double getAccBalance(){
        return b;
    }
    @Override
    public double withdrawl(double yourMoney){
        if(yourMoney>b){
            if(b-yourMoney>=limit){
                b=(b-yourMoney);
                return b;
            }
            else {
                return 0;
            }
        }
        else{
            b= b-yourMoney;
            return b;
        }
    }
}


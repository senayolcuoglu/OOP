public class bank {

public static void main(String[] args){
    bank bank1 = new bank();

    account acc1 = new account(34567,700);
    savingsAccount sAcc1 = new savingsAccount( 3458, 700,8 , 40);
    checkingAccount cAcc1 = new checkingAccount(292929, 1000, -3500);
    
        //account start
        System.out.println("*ACCOUNT*");
        System.out.println(acc1.getaccBalance());
        acc1.deposit(3000);
        System.out.println(acc1.getaccBalance());
        System.out.println("\n\n");
        //account end

        //saving account start
        System.out.println("*SAVINGS ACCOUNT*");
        System.out.println("1- "  + sAcc1.getaccBalance());
        sAcc1.deposit(300);   //+300
        System.out.println("300£ is added to account balance ");
        System.out.println("3- "  + sAcc1.getAccBalance());
        sAcc1.earningInterest();        //interest geldi
        System.out.println("interest added to account balance");
        System.out.println("5- "  + sAcc1.getAccBalance());
        System.out.println("\n\n");
        //saving account end

        //checking account start
        System.out.println("*CHECKING ACCOUNT*");
        System.out.println("1- "  + cAcc1.getaccBalance());
        cAcc1.withdrawl(300);   //+300
        System.out.println("300£ is taken from your account balance ");
        System.out.println("3- "  + cAcc1.getAccBalance());
        cAcc1.withdrawl(2500);        //interest geldi
        System.out.println("moneys are taken from your account");
        System.out.println("5- "  + cAcc1.getAccBalance());
        //checking account end


}
}
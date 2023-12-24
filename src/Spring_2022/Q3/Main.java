package Spring_2022.Q3;


class CreditCard{
    private double credit_limit;
    private double credit_current;
    public CreditCard(double limit){
        if(limit<0){
            throw new InvalidTxnException(limit+" is not a valid amount for the requested transaction");
        }
        credit_limit=limit;
        credit_current=0;
    }

    public void withdraw (double amount){
        //check and throw InvalidTxnException

        if(credit_current+amount>credit_limit){
            throw new InvalidTxnException(amount+" cannot be withdrawn with current credit of " + credit_current + " for your limit of " + credit_limit);
        }
        credit_current+=amount;
    }
}
public class Main {
    public static void main(String [] args){
        //handle the proper exception here with try-catch

        try{
        CreditCard c1= new CreditCard(-5000);
        }catch (InvalidTxnException e){
            System.out.println(e.getMessage());
        }
        CreditCard c2= new CreditCard(10000);

        c2.withdraw(7000);
        //handle the proper exception here with try-catch
        try {
            c2.withdraw(4000);
        }catch (InvalidTxnException e){
            System.out.println(e.getMessage());
        }

    }
}


//here is our userDefined Exception
class InvalidTxnException extends RuntimeException{
    InvalidTxnException(String str){
        super(str);
    }
}

 package SSSS;

public class user {
public double CurrentBalance ;
private double Deposi;
private double Withdraw;
private double  Transfer;
 String History = "The TransactionsHistory a ccount is : ";


public user (double CurrentBalance){
this.CurrentBalance=CurrentBalance;
}
public double CurrentBalance(){
return CurrentBalance;
}

public double Deposit(double D){
  History = History+"\t Deposit is : "+D;
  CurrentBalance+=D;
return CurrentBalance;
}

public double Withdraw(double D){
  History = History+"\t Withdraw is :"+D;
  CurrentBalance-=D;
return CurrentBalance;
}

public double Transfer(double D){
   History = History+"\t Transfer is : "+D;
  CurrentBalance-=D;
  return CurrentBalance;
}

}

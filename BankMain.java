class Bank{

  String holdername;
  double balance;
  

  void diposit(double amount)
  {
    balance = balance + amount;

  }

  void display()
  {
    System.out.println("Holder Name :" +holdername);
    System.out.println("Balance :" + balance);

  }

}

class BankMain{

 public static void main(String[] args){

 Bank b1 = new Bank();

 b1.holdername = "vaibhav";
 b1.balance = 5000;
 b1.diposit(2000);
 b1.display();


}

}

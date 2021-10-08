class BankTester1{


public static void main(String a[]){


Bank bank=new BandhanBank();


BandhanBank  bandhanBank=(BandhanBank)bank;
bank.provideLoans(7.5);
System.out.println(bank);


Bank bank1= new BankOfBaroda();

BankOfBaroda  baroda= (BankOfBaroda)bank1;
bank1.provideLoans(5.8);
System.out.println(bank1);


Bank bank2=new AxisBank();

AxisBank axis=(AxisBank)bank2;
bank2.provideLoans(7.0);
System.out.println(bank2);

Bank bank3=new DhanlaxmiBank();

DhanlaxmiBank dhanLaxmi=(DhanlaxmiBank)bank3;
bank3.provideLoans(5.6);
System.out.println(bank3);

Bank bank4=new HDFCBank();

HDFCBank hdfcBank=(HDFCBank)bank4;
bank4.provideLoans(6.4);

System.out.println(bank4);


Bank  bank5=new RBIBank();

RBIBank  rbiBank=(RBIBank)bank5;
bank5.provideLoans(5.5);
System.out.println(bank5);

Bank bank6=new DBSBank();

DBSBank dbsBank=(DBSBank)bank6;
bank6.provideLoans(7.8);
System.out.println(bank6);


Bank bank7=new CanaraBank();

CanaraBank canaraBank=(CanaraBank)bank7;
bank7.provideLoans(6.2);
System.out.println(bank7);

Bank bank8=new IDBIBank();

IDBIBank idbiBank=(IDBIBank)bank8;
bank8.provideLoans(5.6);
System.out.println(bank8);
 


}

}














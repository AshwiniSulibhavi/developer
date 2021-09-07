class Factorial{

public static void main(String a[]){
System.out.println("main method started");

myFactorial(4);

System.out.println("main method ended");

}

public static void myFactorial(int num){
System.out.println("myFactorial method started");
int fact=1;
for(int i=1;i<=num;i++){
fact=fact*i;
}
System.out.println(fact);
System.out.println("myFactorial method ended");
}
}
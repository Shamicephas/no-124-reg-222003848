//A java program to calculate compound interest
//define a class named 'loanamount'
class loanamount{
    public static double amount(double p,double r,double t){
        return Math.pow(1+r,t)*p;//calculate and return 'compound interest'
    }
}
public class  question2b{//main class named 'question2b'
    public static void main(String[]args){
        //Create an instance of'loanamount' class
        loanamount myloanamount=new loanamount();
        //Call the'amount' with'the specific values and store them
        double result=loanamount.amount(500000, 0.18, 3);
        System.out.println(+result);//print the result to the console
    }
}
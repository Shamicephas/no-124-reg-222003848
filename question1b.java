//A java program to calculate simple interest 
//Define a class named 'interest'
class Interest{
    //method to calculate simple interest
    public static double amount(double p,double r,double t){
        return p*r*t;//calculate and return simple interest
    }}
    public class question1b{//main class named 'question1b'
        public static void main(String[]args){
       //Create an instance of 'interest' class
            Interest myInterest=new Interest();
            //call the 'amount'method with specific values and store them
            double result=myInterest.amount(100000, 0.05, 5);
            System.out.println(+result);//print the result to the console
        }
    }
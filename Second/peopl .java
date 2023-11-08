//A java program to check age
//using the switch case statement
class peopl{//class name
    public static void main(String[]args){//main class

        int age = 18;//integer variable 
        switch(age){
            //switch statement to check the age
            case 14:
            System.out.println("You are not allowed to vote");
            break;
            case 18:
            System.out.println("You are allowed to vote");
            break;
            
            default://default statement
            System.out.println("not valid");//output
        }
    }
}
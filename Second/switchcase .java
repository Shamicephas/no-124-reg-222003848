class switchcase{//class name
    public static void main(String[]args){//main class

        int age = 18;//integer variable 
        switch(age){
            case age < 18 :
            System.out.println("You are not allowed to vote");
            break;
            case age>=18:
            System.out.println("allowed");
            break;
            
            default://default statement
            System.out.println("not valid");//output
        }
    }
}
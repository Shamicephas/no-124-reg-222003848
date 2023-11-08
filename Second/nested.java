 class person{//class name
    public static void main(String[]args){//main class
        String address="Kigali,Rwanda";//string variable address
        if(address.endsWith("Rwanda")){//if condition
            if(address.contains("Musanze")){//if condition
                System.out.println("Your city is Musanze");//output
            }
             else if(address.contains("Rubavu")){//if condition
                System.out.println("Your city is Rubavu");//output
             }else if(address.contains("Nyagatare")){//if condition
                System.out.println("Nyagatare");//output
             }
             
             else {    
                System.out.println(address.split(",")[0]);    
                }  
            }else {
                System.out.println("You do not belong in the country");//output
             }
             

            }
        }
    

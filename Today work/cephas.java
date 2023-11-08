// Interface for class cephas
interface cephas 
{
    void play();
}

// Class gyslain implementing the cephas interface
class gyslain implements cephas
{
    public void play() 
    {
        System.out.println("Class cephas: General player - Runs, passes, and tackles.");
    }
}

// Class eddy extending gyslain and implementing the cephas interface
class eddy extends gyslain 
{
    public void play() 
    {
        System.out.println("Class eddy: Goalkeeper - Blocks shots and clears the ball.");
    }
}

// Class kelia extending eddy
class kelia extends eddy 
{
    void specificMethodB()
     {
        System.out.println("Class kelia: Additional specific method.");
    }
}

// Class kenny extending kelia and implementing the cephas interface
class kenny extends kelia 
{
    public void play()
    {
        System.out.println("Class A: Forward - Scores goals and attacks opponents' defense.");
    }
}

public class inheritance
{
    public static void main(String[] args) 
    {
        kenny playerA = new kenny();
        cephas playerB = new gyslain();
        gyslain playerC = new kenny();
        gyslain playerD = new eddy();
        playerA.play(); // Calls the play method in class kenny
        playerB.play(); // Calls the play method in class gyslain
        playerC.play(); // Calls the play method in class kenny
        playerD.play(); // Calls the play method in class kenny
    }
}
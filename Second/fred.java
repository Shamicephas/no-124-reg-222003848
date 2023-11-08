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
        System.out.println("Class fabrice: General player - Runs, passes, and tackles.");
    }
}

// Class danny extending fabrice and implementing the fred interface
class danny extends fabrice 
{
    public void play() 
    {
        System.out.println("Class danny: Goalkeeper - Blocks shots and clears the ball.");
    }
}

// Class zau extending danny
class zau extends danny 
{
    void specificMethodB()
     {
        System.out.println("Class zau: Additional specific method.");
    }
}

// Class nicky extending zau and implementing the fred interface
class nicky extends zau 
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
        nicky playerA = new nicky();
        fred playerB = new fabrice();
        fabrice playerC = new nicky();
        fabrice playerD = new zau();
        playerA.play(); // Calls the play method in class nicky
        playerB.play(); // Calls the play method in class fabrice
        playerC.play(); // Calls the play method in class nicky
        playerD.play(); // Calls the play method in class nicky
    }
}
interface Volume

{  
    void CalcVol();

    static int cube(int u )
    
    {
        return u*u*u;
    }  

    }

    class Cubic implements Volume
    {  

    public void CalcVol()
    {

    System.out.println("The Volume of Cube is: ");
}  
    }  
      class Congo
    { 

    public static void main(String args[])
    { 

    Volume C=new Cubic(); 

    C.CalcVol();  

    System.out.println(Volume.cube(10));  

    }
}
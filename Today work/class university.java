class university
{
     public String name= "iprc";
    public void fullname()
    {
        System.out.println("Rwanda polytechnique ");
    }
}
class compus extends university
{
    String compusname="  Kicukiro campus ";
    public void location()
    {
        System.out.println("Kicukiro Centre");
    }
}
class college extends compus
{
    String collagename=" Rwanda polytechnique ";

}
class school extends college 
{
    String schoolname="SCHOOL OF Technical";
}
class department extends school
{
    String departmentname=" INFORMATION AND COMMUNICATION TECHNOLOGY";
}
class marks extends department 
{
    String markname=" mathematics MARKS";
    public void mk()
    {
        System.out.println("80");
    }

    public static void main(String[] args)
    {
        marks obj= new marks();
        obj.fullname();
        System.out.println(obj.name);
        obj.location();
        System.out.println(obj.compusname);
        System.out.println(obj.collagename);
        System.out.println(obj.schoolname);
        System.out.println(obj.departmentname);
        System.out.println(obj.markname);
        obj.mk();
    }
}
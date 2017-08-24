package day2.buildingroom;

public class PQRBuilding
{
    public static void main(String s[])
    {
        Room r1 =new Room(4000,"Rose",5);
        Building b2=new Building("Woodland","Baner",r1);
        System.out.println(b2);
    }
}

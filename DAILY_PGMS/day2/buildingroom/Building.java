package day2.buildingroom;

public class Building
{
    private String bname;
    private String badd;
    private Room r1;

    public Building()
    {
        this.bname="";
        this.badd="";
        this.r1 =new Room();
    }

    public Building(String bnm, String add, Room r1)
    {
        this.bname=bnm;
        this.badd=add;
        this.r1=r1;
    }

    @Override
    public String toString() {
        return "\nBuilding Details:\nBuilging Name: "+bname+"\tBuilding Address: "+badd+r1;
    }
}

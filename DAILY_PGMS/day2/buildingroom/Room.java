package day2.buildingroom;

public class Room
{
    private int rno;
    private String rbnm;
    private int fno;

    public Room()
    {
        this.rno=0;
        this.rbnm="";
        this.fno=0;
    }

    public Room(int rn, String rb, int fn)
    {
        this.rno=rn;
        this.rbnm=rb;
        this.fno=fn;
    }

    public String toString() {
        return "\nRoom Details:\nRoom No:" + rno + "\tBuilding Name:" + rbnm + "\tFloor No:" + fno;
    }
}

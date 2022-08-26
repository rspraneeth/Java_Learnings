package Polymorphism;

class RoadBike extends Bicycle
{
    private int tireWidth;

    public RoadBike(int startCadence, int startSpeed, int startGear, int tireWidth)
    {
        super(startCadence,startSpeed,startGear);

        this.setTireWidth(tireWidth);
    }

    public int getTireWidth()
    {
        return tireWidth;
    }

    public void setTireWidth(int newtireWidth)
    {
        this.tireWidth = newtireWidth;
    }

    public void printDescription()
    {
        super.printDescription();
        System.out.println("The RoadBike has" + getTireWidth() + " MM tires.");
    }
}

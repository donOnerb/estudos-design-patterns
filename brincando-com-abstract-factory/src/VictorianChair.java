public class VictorianChair implements Chair{
    @Override
    public Boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Senta na cadeira vitoriana");
    }
}

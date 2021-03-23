public class ModernChair implements Chair{
    @Override
    public Boolean hasLegs() {
        System.out.println("Ela flutua");
        return false;
    }

    @Override
    public void sitOn() {

        System.out.println("Senta na cadeira moderna");
    }
}

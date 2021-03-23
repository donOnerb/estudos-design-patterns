public class ArtDecoChair implements Chair{
    @Override
    public Boolean hasLegs() {
        System.out.println("uns pézinhos");
        return true;
    }

    @Override
    public void sitOn() {
        System.out.println("Senta na cadeira art deco");
    }
}

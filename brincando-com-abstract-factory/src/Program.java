public class Program {


    public static void main(String[] args) throws Exception{
        var config = "Modern";
        FurnitureFactory furnitureFactory;
        if(config.equals("Victorian")) {
            furnitureFactory = new VictorianFurnitureFactory();
        } else if(config.equals("Art Deco")) {
            furnitureFactory = new ArtDecoFurnitureFactory();
        } else if(config.equals("Modern")) {
            furnitureFactory = new ModernFurnitureFactory();
        } else {
            throw new Exception("Algo deu errado");
        }
        var chair = furnitureFactory.createChair();
        System.out.println(chair.hasLegs() ? "Sim" : "Não");
        chair.sitOn();
    }
}

package facade;

public class Main {
    public static void main(String[] args) {
        var convertor = new VideoConverter();
        var mp4 = convertor.convert("funny-cats-video.ogg", "mp4");
        mp4.save();
    }
}

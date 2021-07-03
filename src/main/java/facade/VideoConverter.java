package facade;

public class VideoConverter {

    public VideoFile convert(String filename, String format) {
        var file = new VideoFile(filename);
        var sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;

        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        var buffer = BitrateReader.read(filename, sourceCodec);
        var result = BitrateReader.convert(buffer, destinationCodec);
        result = (new AudioMixer()).fix(result);
        return result;
    }
}

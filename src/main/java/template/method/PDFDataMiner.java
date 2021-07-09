package template.method;

import java.io.File;

public class PDFDataMiner extends DataMiner {

    @Override
    public File openFile(String path) {
        System.out.println("Open pdf");
        return null;
    }

    @Override
    public Object extractData(File file) {
        System.out.println("Extract data pdf");
        return null;
    }

    @Override
    public String parseData(Object rawData) {
        System.out.println("Parse pdf");
        return null;
    }

    @Override
    public void closeFile(File file) {
        System.out.println("Close pdf");
    }
}

package template.method;

import java.io.File;

public abstract class DataMiner {

    public void mine(String path) {
        var file = openFile(path);
        var rawData = extractData(file);
        var data = parseData(rawData);
        var analysis = analyzeData(data);
        sendReport(analysis);
        closeFile(file);
    }

    public abstract File openFile(String path);

    public abstract Object extractData(File file);

    public abstract String parseData(Object rawData);

    public Object analyzeData(Object data) {
        System.out.println("Analyze data");
        return new Object();
    }

    public void sendReport(Object analysis) {
        System.out.println("Send report");
    }

    public abstract void closeFile(File file);
}

package proxy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SecondClient {
    private Service service;


    public SecondClient() {
        service = new Proxy();
    }

    public void doAnotherThing() throws ParseException {
        var simpleDateFormate = new SimpleDateFormat("dd/MM/yyyy");
        var person1 = service.createPerson("00000000001", "pessoa1", simpleDateFormate.parse("05/06/1987"));
        var person2 = service.createPerson("00000000002", "pessoa2", simpleDateFormate.parse("03/04/1999"));
        var person3 = service.createPerson("00000000001", "pessoa1", simpleDateFormate.parse("05/06/1987"));
        person1.printPersonInformation();
        person2.printPersonInformation();
        person3.printPersonInformation();
    }
}

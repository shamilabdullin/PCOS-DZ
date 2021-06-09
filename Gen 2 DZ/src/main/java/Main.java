import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){

        Schedule schedule1 = new Schedule();
        schedule1.fillSubjects();
        Schedule schedule2 = new Schedule();
        schedule2.fillSubjects();

        System.out.println(schedule2.chooseRanomScheudle());
        System.out.println(schedule1.chooseRanomScheudle());

    }
}

package programmerzamannow.datetime;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class DateTest {

    @Test
    void create() {
        var data1 = new Date();
        var data2 = new Date(System.currentTimeMillis());
        var data3 = new Date(339958800000L);

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);

    }
}

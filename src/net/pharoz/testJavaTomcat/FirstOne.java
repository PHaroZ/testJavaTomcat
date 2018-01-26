package net.pharoz.testJavaTomcat;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.ByteArrayInputStream;

public class FirstOne {

    public final String helloWorld() {
        IOUtils.closeQuietly(new ByteArrayInputStream(new byte[0]));

        String message = StringUtils.capitalize("hello world 6");
        System.out.println(message);
        return message;
    }
}

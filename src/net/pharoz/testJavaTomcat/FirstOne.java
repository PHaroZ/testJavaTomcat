package net.pharoz.testJavaTomcat;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class FirstOne {

    public final String hw() {
        final InputStream is = new ByteArrayInputStream(new byte[0]);
        IOUtils.closeQuietly(is);

        String message = StringUtils.capitalize("hello world 7");
        final String useless = null;

        System.out.println(message);
        return message;
    }
}

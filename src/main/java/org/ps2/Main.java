package org.ps2;
import java.util.Arrays;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;
import org.junit.platform.commons.logging.LoggerFactory;


public class Main {
    private final Logger log = (Logger) LoggerFactory.getLogger(this.getClass());
    public static void main(String[] args) {
        Ps2 ps2 = new Ps2();
        ps2.setName("Sly Racoon");
        ps2.setYear(2002);
        ps2.setPlatform("PS2");
        System.out.println(ps2.getName());
        System.out.println(ps2.getYear());
        System.out.println(ps2.getPlatform());
        Ps2Collection ps2Collection = new Ps2Collection();
        ps2Collection.initPs2();
        System.out.println(ps2Collection.getPs2List());
    }
}

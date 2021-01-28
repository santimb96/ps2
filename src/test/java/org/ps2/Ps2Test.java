package org.ps2;

import org.junit.jupiter.api.Assertions;
import org.ps2.ps2Service.Ps2Service;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;
import org.junit.jupiter.api.Test;
import static org.slf4j.LoggerFactory.*;
@ContextConfiguration
@SpringBootTest
public class Ps2Test {
   Logger logger = getLogger(Ps2Test.class);
    @Test
    void addPs2Test() {
        Ps2Service ps2Service = new Ps2Service();
        Ps2 ps2 = new Ps2("Ratchet and Clank", 2002, "PS2");
        Assert.isTrue(!ps2Service.addPs2(ps2), "Nombre del juego no puede estar vacío");
        logger.info("Test acabado");
        /*String name = "Ratchet and Clank";
        Integer year = 2002;
        String platform = "PS2";
            Assert.isTrue(StringUtils.equals(name, ps2.getName()),"No es el mismo nombre");
        */
    }
}


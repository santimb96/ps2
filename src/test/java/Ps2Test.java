import org.apache.commons.lang3.StringUtils;
import org.ps2.Ps2;
import org.springframework.util.Assert;
import org.junit.jupiter.api.Test;
public class Ps2Test {
    @Test
    void testInitPs2() {
            String name = "Ratchet and Clank";
            Integer year = 2002;
            String platform = "PS2";
            Ps2 ps2 = new Ps2(name, year, platform);
            Assert.isTrue(StringUtils.equals(name, ps2.getName()),"No es el mismo nombre");
        }
    }


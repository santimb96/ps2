package org.ps2.ps2Service;

import org.apache.commons.lang3.StringUtils;
import org.ps2.Ps2;

import java.util.ArrayList;
import java.util.List;
//@Service
public class Ps2Service {
    private static final List<Ps2> ps2List = new ArrayList<>();

    public List<Ps2> getPs2List() {
        return ps2List;
    }

    public boolean addPs2(Ps2 ps2) {
        if (ps2 == null || StringUtils.isEmpty(ps2.getName())) {
            return false;
        }
        ps2List.add(ps2);
        return true;
    }

}

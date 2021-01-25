package org.ps2;

import java.util.ArrayList;
import java.util.List;

public class Ps2Collection {
    private final List<Ps2> ps2List = new ArrayList<>();

    /*public Ps2Collection(){
        if(ps2List.isEmpty()){
            initPs2();
        }
    }*/
    public void initPs2(){
        Ps2 ps2 = new Ps2("Sly Racoon", 2001, "PS2");
        ps2List.add(ps2);
    }
    public List<Ps2> getPs2List() {
        return ps2List;
    }
}

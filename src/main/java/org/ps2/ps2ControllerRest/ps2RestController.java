package org.ps2.ps2ControllerRest;

import org.ps2.Ps2;
import org.ps2.ps2Service.Ps2Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ps2RestController {

    Ps2Service ps2Service = new Ps2Service();

    @GetMapping("/getGames")
    public List<Ps2> getPs2(){
        return ps2Service.getPs2List();
    }
    @GetMapping("/addGames")
    public List<Ps2> addPs2 (@RequestParam(value = "name", defaultValue = "Game") String name,
                             @RequestParam(value = "year", defaultValue = "2000") Integer year,
                             @RequestParam(value = "platform", defaultValue = "PS2") String platform){
        ps2Service.addPs2(new Ps2(name, year, platform));
            return ps2Service.getPs2List();
        }
}


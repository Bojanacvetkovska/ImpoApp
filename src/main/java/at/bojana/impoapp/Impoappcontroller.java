package at.bojana.impoapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")

public class Impoappcontroller {

    Impoapp app = new Impoapp();

    @RequestMapping("centimetar")

    public double cm(@RequestParam double inch0){
        return app.cm(inch0);
    }

    @RequestMapping("metar")

    public double m(@RequestParam double yard){
        return app.m(yard);
    }



}



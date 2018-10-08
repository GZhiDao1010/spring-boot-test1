package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    // @RequestMapping(value = {"/say","/hi"},method = RequestMethod.GET)
    @GetMapping(value = "/say")
    // say/23     @PathVariable("id") Integer id
    // say?id=23  @RequestParam("id") Integer myId
    public  String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myId){
        return girlProperties.getCupSize() + "test + "+" myId==="+myId;
    }
}

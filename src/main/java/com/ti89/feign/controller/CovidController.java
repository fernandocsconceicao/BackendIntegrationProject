package com.ti89.feign.controller;

import com.ti89.feign.entity.Covid;
import com.ti89.feign.entity.CovidDTO;
import com.ti89.feign.services.CovidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/covid")

public class CovidController {
    @Autowired
    private CovidService service;


//    @GetMapping("/{estado}")
//    @ResponseStatus(HttpStatus.OK)
//    public ResponseEntity<Covid> covidPorEstado(@PathVariable String estado){
//        return ResponseEntity.ok().body(service.covidPorEstado(estado));
//
//    }
    @RequestMapping(value="/{estado}",method= RequestMethod.GET)
    public ResponseEntity<CovidDTO> getByState(@PathVariable String estado) {

        CovidDTO objDTO =service.covidPorEstado(estado);
        return ResponseEntity.ok().body(objDTO);

    }
}

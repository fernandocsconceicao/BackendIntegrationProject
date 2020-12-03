package com.ti89.feign.rest;

import com.ti89.feign.entity.Covid;
import com.ti89.feign.feign.CovidFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CovidRest {
    @Autowired
    private CovidFeign covidFeign;
        public Covid buscaPorEstado(String estado){return covidFeign.buscaPorEstado(estado);}
}

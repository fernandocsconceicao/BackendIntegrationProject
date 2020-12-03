package com.ti89.feign.services;

import com.ti89.feign.entity.Covid;
import com.ti89.feign.entity.CovidDTO;
import com.ti89.feign.rest.CovidRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class CovidService {
    @Autowired
    private CovidRest covidRest;

    public CovidDTO covidPorEstado(String estado){
        Covid obj= covidRest.buscaPorEstado(estado);


        CovidDTO objDTO= objToDTO(obj);


        return objDTO;
    }
    protected CovidDTO objToDTO(Covid obj){
            CovidDTO objDTO= new CovidDTO();
            objDTO.cases=obj.cases;
            objDTO.deaths=obj.deaths;
            objDTO.refuses=obj.refuses;
            objDTO.uf=obj.uf;
            objDTO.state=obj.state;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            objDTO.datetime = sdf.format(obj.datetime);
            objDTO.uid=obj.uid;
            objDTO.suspects= obj.suspects;

        return objDTO;
    }

}

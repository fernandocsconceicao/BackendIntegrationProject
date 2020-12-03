package com.ti89.feign.feign;

import com.ti89.feign.entity.Covid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://covid19-brazil-api.now.sh/api/report/v1/", name = "CovidFeign")
public interface CovidFeign {

    @GetMapping("brazil/uf/{estado}")
    public Covid buscaPorEstado(@PathVariable String estado);



}


package br.utfpr.agro_radar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.utfpr.agro_radar.dto.VehicleDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {
    @GetMapping("{id}")
    public VehicleDto get(@PathVariable long id) {
        return new VehicleDto();
    }
    @GetMapping
    public VehicleDto getAll() {
        return new VehicleDto();
    }
    
    @PostMapping
    public VehicleDto postMethodName(@RequestBody VehicleDto entity) {
        return entity;
    }
    @PutMapping("{id}")
    public VehicleDto putMethodName(@PathVariable long id, @RequestBody VehicleDto entity) {     
        return entity;
    }
    
    
}

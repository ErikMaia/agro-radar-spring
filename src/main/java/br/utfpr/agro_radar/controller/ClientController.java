package br.utfpr.agro_radar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.utfpr.agro_radar.dto.ClientDto;
import br.utfpr.agro_radar.repository.ClientRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/client")
public class ClientController {
    @Autowired
    public ClientRepository repository;

    @GetMapping("{id}")
    public ClientDto getById(@RequestParam ClientDto id) {
        return new ClientDto();
    }
    
    @PostMapping
    public ClientDto create(@RequestBody ClientDto entity) {
        return entity;
    }
    
    @PutMapping("{id}")
    public ClientDto change(@PathVariable long id, @RequestBody ClientDto entity) {
       
        return entity;
    }
}

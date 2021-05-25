package com.solucoes.brabo.citiesapi.staties;

import java.util.List;

import com.solucoes.brabo.citiesapi.staties.State;
import com.solucoes.brabo.citiesapi.staties.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staties")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> staties() {
        return repository.findAll();
    }
}

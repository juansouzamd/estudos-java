package me.dio.controller;

import me.dio.domain.model.Feature;
import me.dio.service.FeatureService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/futures")
public class FutureController {


    private final FeatureService futureService;

    public FutureController(FeatureService futureService) {
        this.futureService = futureService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Feature> findById(@PathVariable Long id) {
        var feature = futureService.findById(id);
        return ResponseEntity.ok(feature);
    }

    @PostMapping
    public ResponseEntity<Feature> create(@RequestBody Feature featureToCreate) {
        var userCreated = futureService.create(featureToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(featureToCreate.getId())
                .toUri();
        return ResponseEntity.created(location).body(featureToCreate);
    }
}

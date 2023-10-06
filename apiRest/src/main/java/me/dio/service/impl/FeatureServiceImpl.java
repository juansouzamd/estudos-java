package me.dio.service.impl;

import me.dio.domain.model.Feature;
import me.dio.domain.repository.FeatureRepository;
import me.dio.service.FeatureService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class FeatureServiceImpl implements FeatureService {

    private final FeatureRepository featureRepository;

    public FeatureServiceImpl(FeatureRepository featureRepository) {
        this.featureRepository = featureRepository;
    }

    @Override
    public Feature findById(Long id) {
        return featureRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Feature create(Feature featureToCreate) {
        return featureRepository.save(featureToCreate);
    }

}

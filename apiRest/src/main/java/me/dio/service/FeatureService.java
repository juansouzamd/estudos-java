package me.dio.service;

import me.dio.domain.model.Feature;

public interface FeatureService {

    Feature findById(Long id);

    Feature create(Feature featureToCreate);
}

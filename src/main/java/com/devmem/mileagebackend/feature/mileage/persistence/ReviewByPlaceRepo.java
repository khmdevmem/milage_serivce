package com.devmem.mileagebackend.feature.mileage.persistence;

import com.devmem.mileagebackend.feature.mileage.domain.ReviewByPlace;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ReviewByPlaceRepo extends JpaRepository<ReviewByPlace, Integer> {
    Optional<ReviewByPlace> findByReviewId(UUID reviewId);
}

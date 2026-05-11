package com.chiragproject.universalpetcare.service.review;

import com.chiragproject.universalpetcare.model.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IReviewService {
    Review saveReview(Review review, Long reviewerId, Long veterinarianId);
    double getAverageRatingForVet(Long veterinarianId);
    void updateReview(Long reviewerId, Review review);
    Page<Review> findAllReviewsByUserId(Long userId, int page, int size);
}

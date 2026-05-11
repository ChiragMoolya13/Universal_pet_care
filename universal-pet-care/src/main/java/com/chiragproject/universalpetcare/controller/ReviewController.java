package com.chiragproject.universalpetcare.controller;

import com.chiragproject.universalpetcare.exception.AlreadyExistsException;
import com.chiragproject.universalpetcare.exception.ResourceNotFoundException;
import com.chiragproject.universalpetcare.model.Review;
import com.chiragproject.universalpetcare.response.ApiResponse;
import com.chiragproject.universalpetcare.service.review.IReviewService;
import com.chiragproject.universalpetcare.utils.FeedBackMessage;
import com.chiragproject.universalpetcare.utils.UrlMapping;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

@RequiredArgsConstructor
@RequestMapping(UrlMapping.REVIEWS)
@RestController
public class ReviewController {
    private final IReviewService reviewService;

    @PostMapping(UrlMapping.SUBMIT_REVIEW)
    public ResponseEntity<ApiResponse> saveReview(@RequestBody Review review,
                                                  @RequestParam Long reviewerId,
                                                  @RequestParam Long vetId){
        try {
            Review savedReview = reviewService.saveReview(review, reviewerId, vetId);
            return ResponseEntity.ok(new ApiResponse(FeedBackMessage.CREATE_SUCCESS, savedReview));
        } catch (IllegalArgumentException | IllegalStateException e) {
            return ResponseEntity.status(NOT_ACCEPTABLE).body(new ApiResponse(e.getMessage(),null));
        } catch(AlreadyExistsException e){
            return ResponseEntity.status(CONFLICT).body(new ApiResponse(e.getMessage(), null));
        } catch (ResourceNotFoundException e){
            return ResponseEntity.status(NOT_FOUND).body(new ApiResponse(e.getMessage(),null));
        }

    }

}

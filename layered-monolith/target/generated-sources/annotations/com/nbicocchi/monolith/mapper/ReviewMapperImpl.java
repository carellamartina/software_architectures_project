package com.nbicocchi.monolith.mapper;

import com.nbicocchi.monolith.persistence.model.Review;
import com.nbicocchi.monolith.web.dto.ReviewDTO;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-13T08:58:44+0100",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class ReviewMapperImpl implements ReviewMapper {

    @Override
    public ReviewDTO reviewToReviewDTO(Review r) {
        if ( r == null ) {
            return null;
        }

        Long reviewId = null;
        Long productId = null;
        String author = null;
        String subject = null;
        String content = null;

        reviewId = r.getReviewId();
        productId = r.getProductId();
        author = r.getAuthor();
        subject = r.getSubject();
        content = r.getContent();

        ReviewDTO reviewDTO = new ReviewDTO( reviewId, productId, author, subject, content );

        return reviewDTO;
    }

    @Override
    public List<ReviewDTO> reviewsToReviewDTOs(Set<Review> rs) {
        if ( rs == null ) {
            return null;
        }

        List<ReviewDTO> list = new ArrayList<ReviewDTO>( rs.size() );
        for ( Review review : rs ) {
            list.add( reviewToReviewDTO( review ) );
        }

        return list;
    }

    @Override
    public Review reviewDTOToReview(ReviewDTO rDTO) {
        if ( rDTO == null ) {
            return null;
        }

        Review review = new Review();

        review.setProductId( rDTO.productId() );
        review.setReviewId( rDTO.reviewId() );
        review.setAuthor( rDTO.author() );
        review.setSubject( rDTO.subject() );
        review.setContent( rDTO.content() );

        return review;
    }

    @Override
    public Set<Review> reviewDTOsToReviews(List<ReviewDTO> rDTOs) {
        if ( rDTOs == null ) {
            return null;
        }

        Set<Review> set = new LinkedHashSet<Review>( Math.max( (int) ( rDTOs.size() / .75f ) + 1, 16 ) );
        for ( ReviewDTO reviewDTO : rDTOs ) {
            set.add( reviewDTOToReview( reviewDTO ) );
        }

        return set;
    }
}

package com.example.review.service.mapper;

import com.example.review.service.persistence.model.Review;
import com.example.review.service.web.dto.ReviewDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-21T13:47:10+0100",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 23.0.2 (Homebrew)"
)
@Component
public class ReviewMapperImpl implements ReviewMapper {

    @Override
    public ReviewDTO toDTO(Review r) {
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
    public List<ReviewDTO> toDTOs(List<Review> rs) {
        if ( rs == null ) {
            return null;
        }

        List<ReviewDTO> list = new ArrayList<ReviewDTO>( rs.size() );
        for ( Review review : rs ) {
            list.add( toDTO( review ) );
        }

        return list;
    }

    @Override
    public Review toEntity(ReviewDTO rDTO) {
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
    public List<Review> toEntities(List<ReviewDTO> rDTOs) {
        if ( rDTOs == null ) {
            return null;
        }

        List<Review> list = new ArrayList<Review>( rDTOs.size() );
        for ( ReviewDTO reviewDTO : rDTOs ) {
            list.add( toEntity( reviewDTO ) );
        }

        return list;
    }
}

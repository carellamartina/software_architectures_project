package com.nbicocchi.monolith.adapters.api.mapper;

import com.nbicocchi.monolith.adapters.api.dto.ReviewDTO;
import com.nbicocchi.monolith.adapters.persistence.implementation.Review;
import com.nbicocchi.monolith.core.entity.review.IReviewEntity;
import com.nbicocchi.monolith.core.entity.review.impl.ReviewEntity;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-21T15:41:47+0100",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 23.0.2 (Homebrew)"
)
@Component
public class ReviewMapperImpl implements ReviewMapper {

    @Override
    public Review entityToPersistence(IReviewEntity reviewEntity) {
        if ( reviewEntity == null ) {
            return null;
        }

        Review review = new Review();

        review.setProductId( reviewEntity.getProductId() );
        review.setReviewId( reviewEntity.getReviewId() );
        review.setAuthor( reviewEntity.getAuthor() );
        review.setSubject( reviewEntity.getSubject() );
        review.setContent( reviewEntity.getContent() );

        return review;
    }

    @Override
    public ReviewEntity persistenceToEntity(Review review) {
        if ( review == null ) {
            return null;
        }

        ReviewEntity reviewEntity = new ReviewEntity();

        reviewEntity.setReviewId( review.getReviewId() );
        reviewEntity.setProductId( review.getProductId() );
        reviewEntity.setAuthor( review.getAuthor() );
        reviewEntity.setSubject( review.getSubject() );
        reviewEntity.setContent( review.getContent() );

        return reviewEntity;
    }

    @Override
    public Set<ReviewEntity> persistenceToEntities(Set<Review> reviews) {
        if ( reviews == null ) {
            return null;
        }

        Set<ReviewEntity> set = new LinkedHashSet<ReviewEntity>( Math.max( (int) ( reviews.size() / .75f ) + 1, 16 ) );
        for ( Review review : reviews ) {
            set.add( persistenceToEntity( review ) );
        }

        return set;
    }

    @Override
    public Set<Review> entitiesToPersistence(Set<IReviewEntity> reviewEntities) {
        if ( reviewEntities == null ) {
            return null;
        }

        Set<Review> set = new LinkedHashSet<Review>( Math.max( (int) ( reviewEntities.size() / .75f ) + 1, 16 ) );
        for ( IReviewEntity iReviewEntity : reviewEntities ) {
            set.add( entityToPersistence( iReviewEntity ) );
        }

        return set;
    }

    @Override
    public ReviewDTO entityToDto(IReviewEntity reviewEntity) {
        if ( reviewEntity == null ) {
            return null;
        }

        Long reviewId = null;
        Long productId = null;
        String author = null;
        String subject = null;
        String content = null;

        reviewId = reviewEntity.getReviewId();
        productId = reviewEntity.getProductId();
        author = reviewEntity.getAuthor();
        subject = reviewEntity.getSubject();
        content = reviewEntity.getContent();

        ReviewDTO reviewDTO = new ReviewDTO( reviewId, productId, author, subject, content );

        return reviewDTO;
    }

    @Override
    public ReviewEntity dtoToEntity(ReviewDTO review) {
        if ( review == null ) {
            return null;
        }

        ReviewEntity reviewEntity = new ReviewEntity();

        reviewEntity.setReviewId( review.reviewId() );
        reviewEntity.setProductId( review.productId() );
        reviewEntity.setAuthor( review.author() );
        reviewEntity.setSubject( review.subject() );
        reviewEntity.setContent( review.content() );

        return reviewEntity;
    }
}

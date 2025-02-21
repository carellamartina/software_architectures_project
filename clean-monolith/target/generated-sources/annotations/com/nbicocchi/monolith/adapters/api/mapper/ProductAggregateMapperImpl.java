package com.nbicocchi.monolith.adapters.api.mapper;

import com.nbicocchi.monolith.adapters.api.dto.ProductAggregateDTO;
import com.nbicocchi.monolith.adapters.api.dto.RecommendationDTO;
import com.nbicocchi.monolith.adapters.api.dto.ReviewDTO;
import com.nbicocchi.monolith.adapters.persistence.implementation.Product;
import com.nbicocchi.monolith.adapters.persistence.implementation.Recommendation;
import com.nbicocchi.monolith.adapters.persistence.implementation.Review;
import com.nbicocchi.monolith.core.entity.product.IProductEntity;
import com.nbicocchi.monolith.core.entity.product.impl.ProductEntity;
import com.nbicocchi.monolith.core.entity.recommendation.impl.RecommendationEntity;
import com.nbicocchi.monolith.core.entity.review.impl.ReviewEntity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-21T15:41:47+0100",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 23.0.2 (Homebrew)"
)
@Component
public class ProductAggregateMapperImpl implements ProductAggregateMapper {

    @Override
    public Product entityToPersistence(IProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        Product product = new Product();

        product.setProductId( productEntity.getProductId() );
        product.setName( productEntity.getName() );
        product.setWeight( productEntity.getWeight() );
        product.setVersion( productEntity.getVersion() );
        product.setRecommendations( recommendationEntitySetToRecommendationSet( productEntity.getRecommendations() ) );
        product.setReviews( reviewEntitySetToReviewSet( productEntity.getReviews() ) );

        return product;
    }

    @Override
    public ProductEntity persistenceToEntity(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setProductId( product.getProductId() );
        productEntity.setVersion( product.getVersion() );
        productEntity.setName( product.getName() );
        productEntity.setWeight( product.getWeight() );
        productEntity.setRecommendations( recommendationSetToRecommendationEntitySet( product.getRecommendations() ) );
        productEntity.setReviews( reviewSetToReviewEntitySet( product.getReviews() ) );

        return productEntity;
    }

    @Override
    public List<ProductEntity> persistenceToEntities(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductEntity> list = new ArrayList<ProductEntity>( products.size() );
        for ( Product product : products ) {
            list.add( persistenceToEntity( product ) );
        }

        return list;
    }

    @Override
    public List<Product> entitiesToPersistence(List<IProductEntity> productEntities) {
        if ( productEntities == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( productEntities.size() );
        for ( IProductEntity iProductEntity : productEntities ) {
            list.add( entityToPersistence( iProductEntity ) );
        }

        return list;
    }

    @Override
    public ProductAggregateDTO entityToDto(IProductEntity productEntities) {
        if ( productEntities == null ) {
            return null;
        }

        Long productId = null;
        Integer version = null;
        String name = null;
        int weight = 0;
        List<RecommendationDTO> recommendations = null;
        List<ReviewDTO> reviews = null;

        productId = productEntities.getProductId();
        version = productEntities.getVersion();
        name = productEntities.getName();
        weight = productEntities.getWeight();
        recommendations = recommendationEntitySetToRecommendationDTOList( productEntities.getRecommendations() );
        reviews = reviewEntitySetToReviewDTOList( productEntities.getReviews() );

        ProductAggregateDTO productAggregateDTO = new ProductAggregateDTO( productId, version, name, weight, recommendations, reviews );

        return productAggregateDTO;
    }

    @Override
    public ProductEntity dtoToEntity(ProductAggregateDTO product) {
        if ( product == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setProductId( product.productId() );
        productEntity.setVersion( product.version() );
        productEntity.setName( product.name() );
        productEntity.setWeight( product.weight() );
        productEntity.setRecommendations( recommendationDTOListToRecommendationEntitySet( product.recommendations() ) );
        productEntity.setReviews( reviewDTOListToReviewEntitySet( product.reviews() ) );

        return productEntity;
    }

    protected Recommendation recommendationEntityToRecommendation(RecommendationEntity recommendationEntity) {
        if ( recommendationEntity == null ) {
            return null;
        }

        Recommendation recommendation = new Recommendation();

        recommendation.setRecommendationId( recommendationEntity.getRecommendationId() );
        recommendation.setProductId( recommendationEntity.getProductId() );
        recommendation.setVersion( recommendationEntity.getVersion() );
        recommendation.setAuthor( recommendationEntity.getAuthor() );
        recommendation.setRating( recommendationEntity.getRating() );
        recommendation.setContent( recommendationEntity.getContent() );

        return recommendation;
    }

    protected Set<Recommendation> recommendationEntitySetToRecommendationSet(Set<RecommendationEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<Recommendation> set1 = new LinkedHashSet<Recommendation>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( RecommendationEntity recommendationEntity : set ) {
            set1.add( recommendationEntityToRecommendation( recommendationEntity ) );
        }

        return set1;
    }

    protected Review reviewEntityToReview(ReviewEntity reviewEntity) {
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

    protected Set<Review> reviewEntitySetToReviewSet(Set<ReviewEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<Review> set1 = new LinkedHashSet<Review>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( ReviewEntity reviewEntity : set ) {
            set1.add( reviewEntityToReview( reviewEntity ) );
        }

        return set1;
    }

    protected RecommendationEntity recommendationToRecommendationEntity(Recommendation recommendation) {
        if ( recommendation == null ) {
            return null;
        }

        RecommendationEntity recommendationEntity = new RecommendationEntity();

        recommendationEntity.setRecommendationId( recommendation.getRecommendationId() );
        recommendationEntity.setProductId( recommendation.getProductId() );
        recommendationEntity.setVersion( recommendation.getVersion() );
        recommendationEntity.setAuthor( recommendation.getAuthor() );
        recommendationEntity.setRating( recommendation.getRating() );
        recommendationEntity.setContent( recommendation.getContent() );

        return recommendationEntity;
    }

    protected Set<RecommendationEntity> recommendationSetToRecommendationEntitySet(Set<Recommendation> set) {
        if ( set == null ) {
            return null;
        }

        Set<RecommendationEntity> set1 = new LinkedHashSet<RecommendationEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Recommendation recommendation : set ) {
            set1.add( recommendationToRecommendationEntity( recommendation ) );
        }

        return set1;
    }

    protected ReviewEntity reviewToReviewEntity(Review review) {
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

    protected Set<ReviewEntity> reviewSetToReviewEntitySet(Set<Review> set) {
        if ( set == null ) {
            return null;
        }

        Set<ReviewEntity> set1 = new LinkedHashSet<ReviewEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Review review : set ) {
            set1.add( reviewToReviewEntity( review ) );
        }

        return set1;
    }

    protected RecommendationDTO recommendationEntityToRecommendationDTO(RecommendationEntity recommendationEntity) {
        if ( recommendationEntity == null ) {
            return null;
        }

        Long recommendationId = null;
        Long productId = null;
        Integer version = null;
        String author = null;
        int rating = 0;
        String content = null;

        recommendationId = recommendationEntity.getRecommendationId();
        productId = recommendationEntity.getProductId();
        version = recommendationEntity.getVersion();
        author = recommendationEntity.getAuthor();
        rating = recommendationEntity.getRating();
        content = recommendationEntity.getContent();

        RecommendationDTO recommendationDTO = new RecommendationDTO( recommendationId, productId, version, author, rating, content );

        return recommendationDTO;
    }

    protected List<RecommendationDTO> recommendationEntitySetToRecommendationDTOList(Set<RecommendationEntity> set) {
        if ( set == null ) {
            return null;
        }

        List<RecommendationDTO> list = new ArrayList<RecommendationDTO>( set.size() );
        for ( RecommendationEntity recommendationEntity : set ) {
            list.add( recommendationEntityToRecommendationDTO( recommendationEntity ) );
        }

        return list;
    }

    protected ReviewDTO reviewEntityToReviewDTO(ReviewEntity reviewEntity) {
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

    protected List<ReviewDTO> reviewEntitySetToReviewDTOList(Set<ReviewEntity> set) {
        if ( set == null ) {
            return null;
        }

        List<ReviewDTO> list = new ArrayList<ReviewDTO>( set.size() );
        for ( ReviewEntity reviewEntity : set ) {
            list.add( reviewEntityToReviewDTO( reviewEntity ) );
        }

        return list;
    }

    protected RecommendationEntity recommendationDTOToRecommendationEntity(RecommendationDTO recommendationDTO) {
        if ( recommendationDTO == null ) {
            return null;
        }

        RecommendationEntity recommendationEntity = new RecommendationEntity();

        recommendationEntity.setRecommendationId( recommendationDTO.recommendationId() );
        recommendationEntity.setProductId( recommendationDTO.productId() );
        recommendationEntity.setVersion( recommendationDTO.version() );
        recommendationEntity.setAuthor( recommendationDTO.author() );
        recommendationEntity.setRating( recommendationDTO.rating() );
        recommendationEntity.setContent( recommendationDTO.content() );

        return recommendationEntity;
    }

    protected Set<RecommendationEntity> recommendationDTOListToRecommendationEntitySet(List<RecommendationDTO> list) {
        if ( list == null ) {
            return null;
        }

        Set<RecommendationEntity> set = new LinkedHashSet<RecommendationEntity>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( RecommendationDTO recommendationDTO : list ) {
            set.add( recommendationDTOToRecommendationEntity( recommendationDTO ) );
        }

        return set;
    }

    protected ReviewEntity reviewDTOToReviewEntity(ReviewDTO reviewDTO) {
        if ( reviewDTO == null ) {
            return null;
        }

        ReviewEntity reviewEntity = new ReviewEntity();

        reviewEntity.setReviewId( reviewDTO.reviewId() );
        reviewEntity.setProductId( reviewDTO.productId() );
        reviewEntity.setAuthor( reviewDTO.author() );
        reviewEntity.setSubject( reviewDTO.subject() );
        reviewEntity.setContent( reviewDTO.content() );

        return reviewEntity;
    }

    protected Set<ReviewEntity> reviewDTOListToReviewEntitySet(List<ReviewDTO> list) {
        if ( list == null ) {
            return null;
        }

        Set<ReviewEntity> set = new LinkedHashSet<ReviewEntity>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( ReviewDTO reviewDTO : list ) {
            set.add( reviewDTOToReviewEntity( reviewDTO ) );
        }

        return set;
    }
}

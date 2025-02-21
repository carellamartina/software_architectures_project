package com.nbicocchi.monolith.adapters.api.mapper;

import com.nbicocchi.monolith.adapters.api.dto.RecommendationDTO;
import com.nbicocchi.monolith.adapters.persistence.implementation.Recommendation;
import com.nbicocchi.monolith.core.entity.recommendation.IRecommendationEntity;
import com.nbicocchi.monolith.core.entity.recommendation.impl.RecommendationEntity;
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
public class RecommendationMapperImpl implements RecommendationMapper {

    @Override
    public Recommendation entityToPersistence(IRecommendationEntity recommendationEntity) {
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

    @Override
    public RecommendationEntity persistenceToEntity(Recommendation recommendation) {
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

    @Override
    public Set<RecommendationEntity> persistenceToEntities(Set<Recommendation> recommendations) {
        if ( recommendations == null ) {
            return null;
        }

        Set<RecommendationEntity> set = new LinkedHashSet<RecommendationEntity>( Math.max( (int) ( recommendations.size() / .75f ) + 1, 16 ) );
        for ( Recommendation recommendation : recommendations ) {
            set.add( persistenceToEntity( recommendation ) );
        }

        return set;
    }

    @Override
    public Set<Recommendation> entitiesToPersistence(Set<IRecommendationEntity> recommendationEntities) {
        if ( recommendationEntities == null ) {
            return null;
        }

        Set<Recommendation> set = new LinkedHashSet<Recommendation>( Math.max( (int) ( recommendationEntities.size() / .75f ) + 1, 16 ) );
        for ( IRecommendationEntity iRecommendationEntity : recommendationEntities ) {
            set.add( entityToPersistence( iRecommendationEntity ) );
        }

        return set;
    }

    @Override
    public RecommendationDTO entityToDto(IRecommendationEntity recommendationEntity) {
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

    @Override
    public RecommendationEntity dtoToEntity(RecommendationDTO recommendation) {
        if ( recommendation == null ) {
            return null;
        }

        RecommendationEntity recommendationEntity = new RecommendationEntity();

        recommendationEntity.setRecommendationId( recommendation.recommendationId() );
        recommendationEntity.setProductId( recommendation.productId() );
        recommendationEntity.setVersion( recommendation.version() );
        recommendationEntity.setAuthor( recommendation.author() );
        recommendationEntity.setRating( recommendation.rating() );
        recommendationEntity.setContent( recommendation.content() );

        return recommendationEntity;
    }
}

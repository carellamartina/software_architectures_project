package com.nbicocchi.monolith.recommendation.domain;

import com.nbicocchi.monolith.recommendation.shared.RecommendationDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-21T16:29:24+0100",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 23.0.2 (Homebrew)"
)
@Component
class RecommendationMapperImpl implements RecommendationMapper {

    @Override
    public RecommendationDTO toDTO(Recommendation r) {
        if ( r == null ) {
            return null;
        }

        Long recommendationId = null;
        Long productId = null;
        Integer version = null;
        String author = null;
        int rating = 0;
        String content = null;

        recommendationId = r.getRecommendationId();
        productId = r.getProductId();
        version = r.getVersion();
        author = r.getAuthor();
        rating = r.getRating();
        content = r.getContent();

        RecommendationDTO recommendationDTO = new RecommendationDTO( recommendationId, productId, version, author, rating, content );

        return recommendationDTO;
    }

    @Override
    public List<RecommendationDTO> toDTOs(List<Recommendation> rs) {
        if ( rs == null ) {
            return null;
        }

        List<RecommendationDTO> list = new ArrayList<RecommendationDTO>( rs.size() );
        for ( Recommendation recommendation : rs ) {
            list.add( toDTO( recommendation ) );
        }

        return list;
    }

    @Override
    public Recommendation toEntity(RecommendationDTO rDTO) {
        if ( rDTO == null ) {
            return null;
        }

        Recommendation recommendation = new Recommendation();

        recommendation.setRecommendationId( rDTO.recommendationId() );
        recommendation.setVersion( rDTO.version() );
        recommendation.setProductId( rDTO.productId() );
        recommendation.setAuthor( rDTO.author() );
        recommendation.setRating( rDTO.rating() );
        recommendation.setContent( rDTO.content() );

        return recommendation;
    }

    @Override
    public List<Recommendation> toEntities(List<RecommendationDTO> rDTOs) {
        if ( rDTOs == null ) {
            return null;
        }

        List<Recommendation> list = new ArrayList<Recommendation>( rDTOs.size() );
        for ( RecommendationDTO recommendationDTO : rDTOs ) {
            list.add( toEntity( recommendationDTO ) );
        }

        return list;
    }
}

package com.nbicocchi.monolith.mapper;

import com.nbicocchi.monolith.persistence.model.Recommendation;
import com.nbicocchi.monolith.web.dto.RecommendationDTO;
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
public class RecommendationMapperImpl implements RecommendationMapper {

    @Override
    public RecommendationDTO recommendationToRecommendationDTO(Recommendation r) {
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
    public List<RecommendationDTO> recommendationsToRecommendationDTOs(Set<Recommendation> rs) {
        if ( rs == null ) {
            return null;
        }

        List<RecommendationDTO> list = new ArrayList<RecommendationDTO>( rs.size() );
        for ( Recommendation recommendation : rs ) {
            list.add( recommendationToRecommendationDTO( recommendation ) );
        }

        return list;
    }

    @Override
    public Recommendation recommendationDTOToRecommendation(RecommendationDTO rDTO) {
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
    public Set<Recommendation> recommendationDTOsToRecommendations(List<RecommendationDTO> rDTOs) {
        if ( rDTOs == null ) {
            return null;
        }

        Set<Recommendation> set = new LinkedHashSet<Recommendation>( Math.max( (int) ( rDTOs.size() / .75f ) + 1, 16 ) );
        for ( RecommendationDTO recommendationDTO : rDTOs ) {
            set.add( recommendationDTOToRecommendation( recommendationDTO ) );
        }

        return set;
    }
}

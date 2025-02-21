package com.example.product.service.mapper;

import com.example.product.service.persistence.model.Product;
import com.example.product.service.web.dto.ProductDTO;
import com.example.product.service.web.dto.RecommendationDTO;
import com.example.product.service.web.dto.ReviewDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-21T13:52:07+0100",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 23.0.2 (Homebrew)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO toDTO(Product p) {
        if ( p == null ) {
            return null;
        }

        Long productId = null;
        Integer version = null;
        String name = null;
        int weight = 0;
        List<RecommendationDTO> recommendations = null;
        List<ReviewDTO> reviews = null;

        productId = p.getProductId();
        version = p.getVersion();
        name = p.getName();
        weight = p.getWeight();
        Set<RecommendationDTO> set = p.getRecommendations();
        if ( set != null ) {
            recommendations = new ArrayList<RecommendationDTO>( set );
        }
        Set<ReviewDTO> set1 = p.getReviews();
        if ( set1 != null ) {
            reviews = new ArrayList<ReviewDTO>( set1 );
        }

        ProductDTO productDTO = new ProductDTO( productId, version, name, weight, recommendations, reviews );

        return productDTO;
    }

    @Override
    public Product toEntity(ProductDTO pDTO) {
        if ( pDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setProductId( pDTO.productId() );
        product.setName( pDTO.name() );
        product.setWeight( pDTO.weight() );
        product.setVersion( pDTO.version() );
        if ( product.getReviews() != null ) {
            List<ReviewDTO> list = pDTO.reviews();
            if ( list != null ) {
                product.getReviews().addAll( list );
            }
        }
        if ( product.getRecommendations() != null ) {
            List<RecommendationDTO> list1 = pDTO.recommendations();
            if ( list1 != null ) {
                product.getRecommendations().addAll( list1 );
            }
        }

        return product;
    }
}

package com.nbicocchi.monolith.product.domain;

import com.nbicocchi.monolith.product.shared.ProductDTO;
import com.nbicocchi.monolith.recommendation.shared.RecommendationDTO;
import com.nbicocchi.monolith.review.shared.ReviewDTO;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-21T16:29:24+0100",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 23.0.2 (Homebrew)"
)
@Component
class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO toDTO(Product p) {
        if ( p == null ) {
            return null;
        }

        Long productId = null;
        Integer version = null;
        String name = null;
        int weight = 0;

        productId = p.getProductId();
        version = p.getVersion();
        name = p.getName();
        weight = p.getWeight();

        List<RecommendationDTO> recommendations = null;
        List<ReviewDTO> reviews = null;

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

        return product;
    }
}

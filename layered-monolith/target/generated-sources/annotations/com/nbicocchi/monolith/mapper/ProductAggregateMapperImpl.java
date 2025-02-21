package com.nbicocchi.monolith.mapper;

import com.nbicocchi.monolith.persistence.model.Product;
import com.nbicocchi.monolith.web.dto.ProductAggregateDTO;
import com.nbicocchi.monolith.web.dto.RecommendationDTO;
import com.nbicocchi.monolith.web.dto.ReviewDTO;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-13T08:58:44+0100",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class ProductAggregateMapperImpl implements ProductAggregateMapper {

    @Override
    public ProductAggregateDTO productAggregateToProductAggregateDTO(Product p) {
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

        ProductAggregateDTO productAggregateDTO = new ProductAggregateDTO( productId, version, name, weight, recommendations, reviews );

        return productAggregateDTO;
    }

    @Override
    public Product productAggregateDTOToProductAggregate(ProductAggregateDTO pDTO) {
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

package pl.rgrybo.productcatalog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductDataRepository
        extends JpaRepository<ProductData, String> {
}

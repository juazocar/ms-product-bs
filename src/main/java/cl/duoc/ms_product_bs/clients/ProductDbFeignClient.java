package cl.duoc.ms_product_bs.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cl.duoc.ms_product_bs.model.dto.ProductDTO;

@FeignClient(name="ms-product-db-svc", url = "http://localhost:8181/api/product")
public interface ProductDbFeignClient {

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> findProductById(@PathVariable(name = "id") Long id);
}

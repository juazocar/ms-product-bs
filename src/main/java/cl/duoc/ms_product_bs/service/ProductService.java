package cl.duoc.ms_product_bs.service;

import org.springframework.stereotype.Service;

import cl.duoc.ms_product_bs.model.dto.ProductDTO;

@Service
public class ProductService {


    public ProductDTO getProductById(Long id){
        ProductDTO productDTO = null;

        if(id.longValue() == 1){
            productDTO = new ProductDTO(1L, "Producto 1", 10000L);
        }else if(id.longValue() == 2){
             productDTO = new ProductDTO(2L, "Producto 2", 20000L);
        }else if(id.longValue() == 3){
             productDTO = new ProductDTO(3L, "Producto 3", 30000L);
        }
        return productDTO;
    }
}

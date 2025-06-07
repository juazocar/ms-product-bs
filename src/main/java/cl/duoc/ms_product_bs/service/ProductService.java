package cl.duoc.ms_product_bs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.ms_product_bs.clients.ProductDbFeignClient;
import cl.duoc.ms_product_bs.model.dto.ProductDTO;

@Service
public class ProductService {

    @Autowired
    ProductDbFeignClient productDbFeignClient;

    public ProductDTO getProductById(Long id){
        ProductDTO productDTO = productDbFeignClient.findProductById(id).getBody();

        return productDTO;
    }
}

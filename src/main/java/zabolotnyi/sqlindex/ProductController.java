package zabolotnyi.sqlindex;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping()
    public List<ProductDetails> getOrders() {
        return productRepository.findAll();
    }

    @GetMapping("/getByProductCode/{supplierCode}")
    public List<ProductDetails> getOrdersBySupplierCode(@PathVariable("supplierCode") Integer supplierCode) {
        return productRepository.findAllBySupplierCode(supplierCode);
    }

    @PostMapping("/create")
    public ProductDetails postOrder(@RequestBody ProductView order) {
        return productRepository.save(
                new ProductDetails(0L, order.getName(), order.getSupplierCode(), order.getPrice(), order.getQuantity())
        );
    }
}

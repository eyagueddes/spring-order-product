import java.util.List;

import org.springframework.stereotype.Service;
import com.example.startProject.entity.Product;
import com.example.startProject.repository.ProductRepository;

@Service

public class ProductService {

private final ProductRepository repository;

   public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAll(){
        return repository.findAll();
    }
    public Product getProductById(Long id){
        return repository.findById(id).orElse(null);
    }
    
    public Product create(Product p) {
        return repository.save(p);
    }
   public Product update(Product p,Long id) {
         p.setId(id); //id → ID of the product you want to update
          return repository.save(p);
          //If ID exists → JPA performs an UPDATE

         //If ID is null or doesn’t exist → JPA performs an INSERT
        
    }
      public void delete(Long id) {
        repository.deleteById(id);
    }


} 
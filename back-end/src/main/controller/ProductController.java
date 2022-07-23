import main.data.products;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
  
  @Autowired
	private ProductService ps;
  
  @GetMapping("/search")
	public ResponseEntity<List<Product>> getAllProducts(){
			List<Product> products = new ArrayList<Product>();
			return new ResponseEntity<>(ps.listAll(),HttpStatus.OK); //Shall return products with the keyword "apple"
		
	}
}

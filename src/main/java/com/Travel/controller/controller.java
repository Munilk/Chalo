
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


import com.travel.service.service; // adjust the package if needed
import com.travel.model.Product;    // adjust the pack






@RestController
@RequestMapping("/api")
public class controller {

    @Autowired
    private service serv;

    @GetMapping("/home")
    public List<Product> home() {
        return serv.getallproducts();
    }

    @PostMapping("/addproduct")
    public ResponseEntity<String> addProduct(@RequestBody Product pd) {
        
        if(serv.addproduct(pd)){
            return ResponseEntity.ok("Product is added successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Product is not added");
        }
    }

    @GetMapping("/product/{pid}")
    public Product searchProduct(@PathVariable int pid) {
        return serv.searprd(pid);
    }

    @PutMapping("/product")
    public ResponseEntity<String> updateProduct(@RequestBody Product newprd) {
        String result = serv.uptprd(newprd);
        return ResponseEntity.ok(result);
    }
}

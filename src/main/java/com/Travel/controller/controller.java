

//


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Also import your own classes:
import com.Travel.service.service // adjust the package if needed
import com.Travel.model.product;    // adjust the package if needed



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
        boolean a = serv.addproduct(pd);
        if (a) {
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

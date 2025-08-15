import org.springframework.web.bind.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor



@controller
public class homecontroller{

@Autowired
private Services serv;
@GetMapping("/home")
public List<Product> home(){
    return serv.getallproducts();
@PutMapping("/addproduct")
public String addproduct(Product pd){
    boolean a=serv.addproduct(pd);
    if(a){
        return "Product is added successfully ";
    
    }
    else{
        return "product is not added";
    }

}

@PostMapping("/product/{pid}")
public Product searchproduct(@PathVariable int pid){
    return serv.searprd(pid);
}

@UpdateMapping("/product")
public String updateproduct(Product newprd){
    return serv.uptprd(newprd);
}

}
}

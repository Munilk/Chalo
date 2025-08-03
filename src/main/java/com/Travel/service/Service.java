
@Service

public class Service{
@Autowired
private Repo rep;
public List<Product> getallproducts(){
return rep.getallproducts();
}
public boolean addproduct(Product product){
    if (repo.addproduct(product)){
        return true;
    }
    else{
        return false;
    }
}



}

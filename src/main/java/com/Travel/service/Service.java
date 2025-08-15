
@Service

public class Service{
@Autowired
private repo rep;
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
public Product searprd(int a){
    return repo.searchprd(a);
}
public String uptprd(Product nprd){
    return repo.updateproduct(nprd);
}

}

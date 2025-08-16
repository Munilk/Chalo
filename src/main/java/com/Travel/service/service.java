
@Service

public class service{
@Autowired
private repo rep;
public List<Product> getallproducts(){
return rep.getallproducts();
}
public boolean addproduct(Product product){
    if (rep.addproduct(product)){
        return true;
    }
    else{
        return false;
    }
}
public Product searprd(int a){
    return rep.searchprd(a);
}
public String uptprd(Product nprd){
    return rep.updateproduct(nprd);
}

}

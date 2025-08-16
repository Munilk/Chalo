
@Service

public class service{
@Autowired
private repo rep;
public List<Product> getallproducts(){
return rep.getallproducts();
}
public  boolean addproduct(Product prot){
    if (rep.addproduct(prot)){
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

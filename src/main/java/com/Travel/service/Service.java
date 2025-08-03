
@Service

public class Service{
@Autowired
private Repo rep;
public List<Product> getallproducts(){
return rep.getallproducts();
}



}

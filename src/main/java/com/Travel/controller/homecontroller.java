
@controller
public class homecontroller{
@Autowired
private Services serv;
@GetMapping("/home")
public List<Product> home(){
return serv.getallproducts();

}
}

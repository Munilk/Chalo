@Repository

class Repositary{
List<Product> pds=new ArrayList<>(Arrays.asList(new Product(1,"Lenova Tab","One of the best android tablet for the students",250090.78,6,true)));
public List<Product> getallproducts(){
return pds;

}
public boolean addproduct(Product product){
    boolean a=(boolean)pds.add(product);
    return a;
}
}
import java.util.*;
import org.springframework.web.bind.annotation.*;





@Repository
//
//public interface Repositary extends JPARepository throws IOException{
public class repo{
List<Product> pds=new ArrayList<>(Arrays.asList(new Product(1,"Lenova Tab","One of the best android tablet for the students",250090.78,6,true)));
public List<Product> getallproducts(){
return pds;

}
public boolean addproduct(@ResponseBody Product product){
    boolean a=(boolean)pds.add(product);
    return a;
}

public Product searchprd(@PathVaraible int prid){
    for(Product ps=pds){
        if(ps.getId()==prid){
            return ps;
        }
        else{
            return null;
        }
    }
}

public String updateproduct(@ResponseBody Product nprddetails){
    for(Products p=pds){
        if(p.getId()==nprddetails.getId()){
            p.setName(nprddetails.getName());
            p.setDescr(nprddetails.getDescr());
            p.setPrice(nprddetails.getPrice());
            p.gsetQuantity(nprddetails.getQuantity());
            return "Product is updated";
        }
        else{
            return "Prpduct is not available in website";
        }
    }
}
}

package beans;

import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

@Named
@RequestScoped
public class MeiboBean {
    private Integer number;
    private String name;
//    @EJB
//    EmployeeDB db;
//    @Inject
//    transient Logger log;
    /**
     * @return the number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public String next(){
        //create();
        return "output.xhtml";
    }
    
//    public void create(){
//        Employee emp = new Employee(number,name);
//        try{
//            db.create(emp);
//            clear();
//        }catch(Exception e){
////            log.severe("失敗");
//        }
//    }
    public void clear(){
        number = null;
        name = null;
    }
}

package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MeiboBean {
    private Integer number;
    private String name;

    public void toConsole(){
        System.out.println(this.number + " " + this.name);
    }
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
        System.out.println(this.number + " " + this.name);
        return "output.xhtml";
    }
}

package Module3.Homework;

/**
 * Created by Дима on 19.11.2016.
 */
public class Coll {


    private long id;
    private String name;
    private int age;
    private String company;




    public Coll(String name, int age, String company, long id) {
        this.name = name;
        this.age = age;
        this.company = company;
        this.id = id;
    }

    public Coll() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompany() {
        //if(company!= "Test" && company.length() > 5)
        return company;
        // else return "";
    }

    public void setCompany(String company) {
        this.company = company;
    }

}

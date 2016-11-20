package Module3.Homework.Task3;

/**
 * Created by Дима on 20.11.2016.
 */
public class CollegeStudent extends Student {

   private String collegeName;
   private int rating;
   private long id;


    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }


    public CollegeStudent(Course[] coursesTaken, int age) {
        super(coursesTaken, age);
    }

    public CollegeStudent(Course[] coursesTaken, int age, String collegeName, int rating, long id) {
        super(coursesTaken, age);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }


    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

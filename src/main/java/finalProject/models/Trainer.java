package finalProject.models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private long trainerID;

    
    private String name;

    private String gym;

    private String email;

    private long age;

    private String photoFile;

    @ManyToMany(mappedBy = "trainerLs")
    private Set<Course> courses = new HashSet<>();




    protected Trainer() {
    }

    public Trainer(long trainerID,
                   String name,
                   String gym,
                   String email,
                   long age,
                   String photoFile
                   ) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.trainerID = trainerID;
        this.gym = gym;
        this.photoFile = photoFile;


    }

    public String getPhotoFile() {
        return photoFile;
    }

    public void setPhotoFile(String photoFile) {
        this.photoFile = photoFile;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public long getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(long trainerID) {
        this.trainerID = trainerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public Trainer(long trainerID, String name, String gym, String email, long age, String photoFile, Set<Course> courses) {
        this.trainerID = trainerID;
        this.name = name;
        this.gym = gym;
        this.email = email;
        this.age = age;
        this.photoFile = photoFile;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerID=" + trainerID +
                ", name='" + name + '\'' +
                ", gym='" + gym + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", courses=" + courses +
                '}';
    }

}






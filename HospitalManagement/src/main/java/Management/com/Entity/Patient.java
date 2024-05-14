package Management.com.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Name;
    private Long id;
    private int age;

    public Patient(String name, Long id, int age) {
        Name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "Name='" + Name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}

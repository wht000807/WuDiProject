import model.StudentModel;
import controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @RequestMapping("")
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping("student")
    public StudentModel student() {
        StudentModel student = new StudentModel();
        student.setNo("01");
        student.setName("Jack");
        return student;
    }
}

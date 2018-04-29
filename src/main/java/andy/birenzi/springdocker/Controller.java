package andy.birenzi.springdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String hello(){
        return "hello world from Docker";
    }
    @PostMapping("/")
    public String postHello(){
        return "Post hello world from Docker";
    }
}

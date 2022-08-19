package spa.simone.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/person")
  public ResponseEntity<Person> getPerson() {
    final Person person = new Person(1L, "Simone", "Spaccarotella");
    return ResponseEntity.ok(person);
  }
}

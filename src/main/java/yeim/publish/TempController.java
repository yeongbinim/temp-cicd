package yeim.publish;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {

    //test2
    @GetMapping("/temp")
    public ResponseEntity<String> temp() {
        return ResponseEntity.ok("temp");
    }
}

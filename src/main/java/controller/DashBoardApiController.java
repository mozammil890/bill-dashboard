package controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashBoardApiController implements  DashBoardApi{

    @Override
    public ResponseEntity<Integer> getTotal() {
        int total = 2356;
        return ResponseEntity.ok(total);
    }
}

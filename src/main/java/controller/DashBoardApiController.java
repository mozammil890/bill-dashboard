package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DashBoardService;
import utilities.SubmitSalesDataRequest;

@RestController
public class DashBoardApiController implements  DashBoardApi{

    @Autowired
    DashBoardService dashBoardService;

    @Override
    public ResponseEntity<Integer> getTotal() {
        int total = 2356;
        return ResponseEntity.ok(total);
    }

    @Override
    public ResponseEntity<Void> submitTotalSales(SubmitSalesDataRequest submitSalesDataRequest) {
        dashBoardService.submitTotalSalesService(submitSalesDataRequest);
        return ResponseEntity.ok().build();
    }
}

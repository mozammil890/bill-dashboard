package controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utilities.SubmitSalesDataRequest;

@RequestMapping("/v1")
public interface DashBoardApi {

    @Operation(summary = "This is a getAPI for the total sales")
    @ApiResponse(responseCode = "200" , description = "successfully fetched the data")
    @GetMapping("/get-total")
    ResponseEntity<Integer> getTotal();

    @Operation(summary = "This is Post API to submit daily sales")
    @ApiResponse(responseCode = "200" , description = "successfully data submitted")
    @PostMapping("/submit-sales")
    public ResponseEntity<Void> submitTotalSales(@RequestBody SubmitSalesDataRequest submitSalesDataRequest);
}
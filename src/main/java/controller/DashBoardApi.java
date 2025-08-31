package controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1")
public interface DashBoardApi {

    @Operation(summary = "This is a getAPI for the total sales")
    @ApiResponse(responseCode = "200" , description = "successfully fetched the data")
    @GetMapping("/get-total")
    ResponseEntity<Integer> getTotal();
}
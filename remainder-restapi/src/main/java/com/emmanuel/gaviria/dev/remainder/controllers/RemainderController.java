package com.emmanuel.gaviria.dev.remainder.controllers;

import com.emmanuel.gaviria.dev.remainder.dtos.TestCase;
import com.emmanuel.gaviria.dev.remainder.services.RemainderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class RemainderController {

    @Autowired
    private RemainderService remainderService;

    @GetMapping("/maxK")
    public ResponseEntity<Integer> calculateRemainder(
            @RequestParam(name = "x") int x,
            @RequestParam(name = "y") int y,
            @RequestParam(name = "n") int n) {
        // Calculate the maximum k for the given params
        return ResponseEntity.ok(remainderService.calculateMaximumK(x, y, n));
    }

    @PostMapping("/maxK")
    public ResponseEntity<Integer> calculateRemainder(@RequestBody TestCase testCase) {
        // Calculate the maximum k for this test case
        return ResponseEntity.ok(remainderService.calculateMaximumK(testCase.getX(), testCase.getY(), testCase.getN()));
    }
}

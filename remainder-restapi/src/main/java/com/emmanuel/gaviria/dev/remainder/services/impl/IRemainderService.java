package com.emmanuel.gaviria.dev.remainder.services.impl;

import com.emmanuel.gaviria.dev.remainder.services.RemainderService;
import org.springframework.stereotype.Service;

@Service
public class IRemainderService implements RemainderService {

    public int calculateMaximumK(int x, int y, int n) {
        // Calculate and print the result for the current test case
        return n - (n - y) % x;
    }
}

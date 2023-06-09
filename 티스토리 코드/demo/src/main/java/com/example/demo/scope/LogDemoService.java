package com.example.demo.scope;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {
    private final RequestLog requestLog;
    public void logic(String id) {
        requestLog.log(id);
    }
}

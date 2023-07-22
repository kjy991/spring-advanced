package com.advanced.spring.springadvanced.trace.logtrace;


import com.advanced.spring.springadvanced.trace.TraceStatus;

public interface LogTrace {

    TraceStatus begin(String message);

    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);
}

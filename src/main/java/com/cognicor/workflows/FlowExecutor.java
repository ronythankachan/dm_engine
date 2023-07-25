package com.cognicor.workflows;

public interface FlowExecutor<T, R> {
    R execute(T request);
}

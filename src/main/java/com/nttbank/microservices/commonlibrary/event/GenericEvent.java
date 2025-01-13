package com.nttbank.microservices.commonlibrary.event;

import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
public class GenericEvent<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 129348931L;

    private T t;

    public GenericEvent(T obj) {
        this.t = obj;
    }

    public T getT() {
        return this.t;
    }

}

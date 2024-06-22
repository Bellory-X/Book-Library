package org.dinamika.library.platform;

import jakarta.annotation.Nullable;

import java.util.Objects;
import java.util.function.Function;

public class Validator<T> {

    private final T validated;

    private Validator(@Nullable T validated) {
        this.validated = validated;
    }

    public static <T> Validator<T> requireNonNull(T validated, String nameOfBeingChecked) {
        Objects.requireNonNull(validated, nameOfBeingChecked + " must be not null");
        return new Validator<>(validated);
    }

    public Validator<T> and(Function<T, Boolean> condition, Function<T, String> lazyMessage) {
        if (validated == null) {
            return this;
        }

        if (!condition.apply(validated)) {
            String message = lazyMessage.apply(validated);
            throw new IllegalArgumentException(message);
        }

        return this;
    }
}

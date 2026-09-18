package org.example;

public record Address(
        String street,
        String city,
        States state,
        String zip
) {
}

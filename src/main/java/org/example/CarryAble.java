package org.example;

interface CarryAble {
    default String carry() {
        return "Carry something";
    }
}

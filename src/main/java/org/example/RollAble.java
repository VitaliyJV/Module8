package org.example;

interface RollAble {
    default String roll() {
        return "Roll some";
    }
}

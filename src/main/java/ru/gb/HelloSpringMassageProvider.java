package ru.gb;

public class HelloSpringMassageProvider implements MessageProvider {
    @Override
    public String getMassage() {
        return "Hello spring";
    }
}

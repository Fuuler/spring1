package ru.gb;

public interface MessageRender {
    void reader();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}

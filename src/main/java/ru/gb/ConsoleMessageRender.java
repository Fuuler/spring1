package ru.gb;

public class ConsoleMessageRender implements MessageRender {

    private MessageProvider messageProvider;

    public ConsoleMessageRender(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void reader() {
        System.out.println(messageProvider.getMassage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
package ru.luckoff.mirea.practice_10.task_3;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument CreateNew() {
        System.out.println("Text Created");
        return new TextDocument();
    }

    @Override
    public IDocument CreateOpen() {
        System.out.println("Text Opened");
        return new TextDocument();
    }
}

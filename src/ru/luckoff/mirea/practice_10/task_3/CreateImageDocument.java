package ru.luckoff.mirea.practice_10.task_3;

public class CreateImageDocument implements ICreateDocument {

    @Override
    public IDocument CreateNew() {
        System.out.println("Image Created");
        return new ImageDocument();
    }

    @Override
    public IDocument CreateOpen() {
        System.out.println("Image Opened");
        return new ImageDocument();
    }
}

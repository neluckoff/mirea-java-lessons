package ru.luckoff.mirea.practice_10.task_3;

public class CreateMusicDocument implements ICreateDocument {
    @Override
    public IDocument CreateNew() {
        System.out.println("Music Created");
        return new MusicDocument();
    }

    @Override
    public IDocument CreateOpen() {
        System.out.println("Music Opened");
        return new MusicDocument();
    }
}

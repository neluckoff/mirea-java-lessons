package ru.luckoff.mirea.practice_10.task_2;

public class MagicChair implements Chair {

    public MagicChair() {
    }

    public void doMagic() {
        System.out.println("Yooo, magic is done, bro!");
    }

    @Override
    public String toString() {
        return "Magic Chair has been created.";
    }
}

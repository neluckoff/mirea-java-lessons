package ru.luckoff.mirea.practice_12_13_14_15.task_3;

public class Shirt {
    private final String[] shirt = new String[11];
    private String num, name, color, size;

    public Shirt() {
    }

    public void addShirt(String shirt, int i) {
        switch (i) {
            case 0 -> num = shirt;
            case 1 -> name = shirt;
            case 2 -> color = shirt;
            case 3 -> size = shirt;
        }
    }

    public String toString() {
        return (num + " | " + name + " | " + color + " | " + size);
    }

    public static void main(String[] args) {
        Shirt str = new Shirt();

        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        int j=0, i=0;
        for (i = 0; i < 11; i++) {
            for (String data : shirts[i].split(",")) {
                str.addShirt(data, j);
                j++;
            }
            j = 0;
            System.out.println(str);
        }
    }
}

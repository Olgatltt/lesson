package Dom;

import java.util.Arrays;
import java.util.Scanner;

public class Notepad {
    private int count = 0;
    private int size = 10;
    private String[] array = new String[size];

    public void add(String string) {
        if (count >= size) {
            String[] newArray = Arrays.copyOf(array, size * 2);
            array = newArray;
        }
        array[count] = string;
        count++;
    }

    public void delete() {
        array[count] = null;
        count--;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
    }
}



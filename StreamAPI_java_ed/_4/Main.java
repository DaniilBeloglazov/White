package StreamAPI_java_ed._4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 1000));
        }
        Integer a3 = console.nextInt();
        list.stream().filter(a3::equals).findFirst().get();
    }
}

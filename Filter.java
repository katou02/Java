
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // 文字列ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList("red","green","blue","yellow","black"));
        // "r"を含む要素を抽出
        list.stream().filter(str -> str.contains("r"))
            .forEach(System.out::println);

        // int配列
        int[] array = {1, 4, 5, 6, 2, 7, 9, 3, 8};
        // 5以下の要素を抽出
        Arrays.stream(array).filter(num -> num <= 5)
            .forEach(System.out::println);
    }
}
public class PrintFruitParameter {
    public static void main (String[] args) {
        printData();
        printData(10);
        printData(1.2);
    }
    private static void printData() {
        System.out.println("[5] 名前：りんご");
    }
    private static void printData(int quantity) {
        System.out.println("[7] 数量：" + quantity + "個");
    }
    private static void printData(double weight) {
        System.out.println("[9] 重さ：" + weight + "Kg");
    }
}
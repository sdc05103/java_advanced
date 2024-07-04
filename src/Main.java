//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Phone a = new Apple("잡스");
        Phone b = new Samsung("재용");

        a.buyPhone();
        a.turnOn();
        System.out.println();
        b.buyPhone();
        b.turnOn();
    }
}
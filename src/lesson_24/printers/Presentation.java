package lesson_24.printers;

public class Presentation implements ColorPrintable{

    private String title;
    private int countPages;
    private String topic;

    public Presentation(String title, int countPages, String topic) {
        this.title = title;
        this.countPages = countPages;
        this.topic = topic;
    }

    @Override
    public void colorPrint() {
        System.out.printf("Распечатывается презентация %s (тема: %s) в цвете. " +
                "Всего страниц %d\n", title, topic, countPages);
    }

    @Override
    public void print() {
        System.out.printf("Распечатывается презентация %s (тема: %s) в ч/б. " +
                "Всего страниц %d\n", title, topic, countPages);
    }

    @Override
    public void print(int number) {
        System.out.println(number);
    }
}

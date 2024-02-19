package lesson_24.printers;

public class PrintApp {
    public static void main(String[] args) {

        Book book = new Book("Java", "B.Eckel");
        book.print();
        book.bookSayHello();

        Printable printableBook = new Book("Test", "someone");
        printableBook.print();
        //printableBook.boolSayHello(); такой метод по типу ссылки Printable не доступен

        Printable presentationWB = new Presentation("Title", 24, "Topic");
        presentationWB.print();
        System.out.println("=======================================");

        ColorPrintable presentationColor = new Presentation("Color",12, "Color world");
        presentationColor.print();
        presentationColor.colorPrint();

        Printable[] printables = new Printable[2];
        printables[0] = book;
        printables[1] = presentationColor;

        for (Printable printable : printables) {
            printable.print();
            printable.sayHello("World");
        }
        System.out.println("==================================");

        //вызов статического методы интерфейса
        Printable.staticMethod();

        System.out.println("==================================");

        Printer printer = new Printer();
        printer.makeCopy(book);
        printer.makeCopy(presentationWB);
        printer.makeCopy(presentationColor);



    }
}

package lesson_38;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        /* Контракт между hashCode() и equals()
        1. если два объекта равны между собой по equals(), то их хеш-коды тоже должны быть равны
        2. если хеш-коды двух объектов различны, то эти объекты абсолютно точно НЕ равны по методу equals() (при этом разные объекты могут иметь одинаковый хеш-код)
        3. вызов метода hashCode() на неизменненном объекта всегда должен возвращать одинаковое значение
         */

        Set<Integer> integersConstr = new HashSet<>(); // 16 корзин, loadFactor 0.75 (коэффициент загрузки)
        Set<Integer> integersConstr1 = new HashSet<>(28);// создастся 32 корзины (ближайшая степень двойки) задаем значение корзин, loadFactor 0.75 (коэффициент загрузки)
        Set<Integer> integersConstr2 = new HashSet<>(28, 0.80f); // 32 корзины (ближайшая степень двойки)задаем значение корзин, задаем значение loadFactor 0.75 (коэффициент загрузки)
        Set<Integer> integersConstr3 = new HashSet<>(integersConstr); // принимает коллекцию, и создает set из уникальных элементов этой коллекции

        List<Integer> startValues = List.of(15, 1, 2, 3, 3, 5, 6, 8, 8, 15, 7, 0, 16, 32, 64, 33);
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("integers ->" + integers);

        Set<Integer> integerSet = new HashSet<>(List.of(7, 6, 9, 33, 10, 15, 17, 1, 5));
        System.out.println(integerSet);

        Set<String> strings = new HashSet<>(List.of("String", "Java", "Python", "hello"));
        System.out.println(strings);

        //сохраняет порядок добавления элементов
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println(linkedSet);

        // boolean add(E e) - добавляет
        System.out.println(integers.add(100)); // true - элемент добавлен, т.к. еще не было такого значения в set
        System.out.println(integers.add(100)); // false - элемент НЕ добавлен, т.к. такое значение было в set

        // boolean remove(Object obj) - удаляет только по значению, т.к. в сетах нет индексов
        System.out.println("integers.remove(100) -> " + integers.remove(100));
        System.out.println("integers.remove(100) #2 -> " + integers.remove(100));

        // boolean contains(Object obj)
        System.out.println("integers.contains(33) -> " + integers.contains(33));

        // size()
        // isEmpty()
        // iterator() - возвращает итератор

        Iterator<Integer> iterator = integers.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        // clear() - удаляет все элементы из set

        Set<Integer> treeSet0 = new TreeSet<>(); // пустое, упорядоченное, сортируемое в естественном порядке множество
        Set<Integer> treeSet1 = new TreeSet<>(integers); // создает новое дерево, содрежащее элементы коллекции, отсортированные в естественном порядке
        Set<Integer> treeSet2 = new TreeSet<>(Comparator.reverseOrder()); // создает пустое упорядоченное множество, сортированное в порядке, указанном компаратором
        //Set<Integer> treeSet3 = new TreeSet<>(TreeSet<T>); создает новое множество, содержащее те же элементы в том же порядке

        Set<Integer> treeSet = new TreeSet<>(startValues);
        System.out.println(treeSet);

        Set<Integer> sortedReversed = new TreeSet<>((i1, i2) -> i2.compareTo(i1));
        sortedReversed.addAll(startValues);
        sortedReversed.add(11);
        System.out.println("reversedOrderSet -> " + sortedReversed);

        List<Integer> uniqueList = getUniqueList(startValues);
        System.out.println(uniqueList);

        List<Integer> uniqueList1 = getUniqueSortedList(startValues);
        System.out.println(uniqueList1);

    }
    public static<T> List<T> getUniqueList(List<T> list) {
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    public static<T> List<T> getUniqueSortedList(List<T> list) {
        Set<T> set = (Set<T>) new TreeSet<>(Comparator.reverseOrder());
        set.addAll(list);
        return new ArrayList<>(set);
    }


}

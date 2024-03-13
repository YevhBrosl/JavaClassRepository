package homework_39;

//Построение маршрута.
//
//        У вас есть карта прямых рейсов, где ключ — это название города отправления, а значение — город назначения.
//
//        Необходимо написать функцию, которая принимает карту рейсов, город отправления и город назначения
//        и возвращает список городов, через которые проходит маршрут.
//        Если прямого рейса нет, функция должна пытаться найти маршрут с пересадками.

//Условия:
//
//        Если прямого рейса нет, нужно искать возможные пересадки через другие города.
//        Если маршрут невозможно составить, функция должна возвращать пустой список.
//        Предполагается, что нет циклических маршрутов, и из города можно уехать только в один другой город (один к одному соответствие).

//Вывод: ["Boston", "Miami", "New York", "Chicago", "Denver", "Las Vegas"]


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4 {
    private static List<String> findRoute(Map<String, String> directFlights, String departureCity, String destinationCity) {
        List<String> route = new ArrayList<>();
        if (!directFlights.containsKey(departureCity) || !directFlights.containsValue(destinationCity)) {
            return route;
        }
        route.add(departureCity);
        String currentCity = departureCity;
        while (!currentCity.equals(destinationCity)) {
            String nextCity = directFlights.get(currentCity);
            route.add(nextCity);
            currentCity = nextCity;
        }
        return route;
    }

    public static void main(String[] args) {
        Map<String, String> directFlights = new HashMap<>();
        directFlights.put("New York", "Chicago");
        directFlights.put("Chicago", "Denver");
        directFlights.put("Denver", "Las Vegas");
        directFlights.put("Boston", "Miami");
        directFlights.put("Miami", "New York");
        directFlights.put("Los Angeles", "San Francisco");
        directFlights.put("San Francisco", "New York");

        List<String> route = findRoute(directFlights, "Boston", "Las Vegas");
        System.out.println(route);
    }

}

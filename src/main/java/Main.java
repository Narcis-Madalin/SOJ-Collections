import java.util.*;

public class Main {

    public static void main(String[] args) {

        // ex 1

        System.out.println("Ex. 1\n");
        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(3);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(6);
        numbers.add(5);

        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()) {
            Integer number = iterator.next();
            if(number % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println();

        // ex 2

        System.out.println("Ex 2\n");
        Set<String> siruri = new HashSet<>();

        siruri.add("Ana are mere");
        siruri.add("Ana are mere");
        siruri.add("Ana are mere");
        siruri.add("Si Ioana are pere");
        siruri.add("Sir 3");
        siruri.add("Sir 4");

        Iterator<String> stringIterator = siruri.iterator();

        while(stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

        System.out.println("\nSetul nu pastreaza duplicate, si nu se pastreaza ordinea inserarii sirurilor in set\n");

        // ex 3

        System.out.println("Ex 3\n");

        Map<String, Integer> map = new HashMap<>();

        map.put("Timisoara", 14);
        map.put("Bucuresti", 5);
        map.put("Arad", 30);
        map.put("Cluj-Napoca", 9);
        map.put("Constanta", 3);
        map.put("Targu Jiu", 12);
        map.put("Brasov", 7);

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if(stringIntegerEntry.getValue() > 10){
                System.out.println(stringIntegerEntry);
            }
        }

        // ex 4

        System.out.println("\nEx 4\n");

        List<Integer> listOfNumbers = new ArrayList<>();

        listOfNumbers.add(7);
        listOfNumbers.add(4);
        listOfNumbers.add(5);
        listOfNumbers.add(2);
        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(4);
        listOfNumbers.add(1);

        Iterator<Integer> integerIterator = listOfNumbers.iterator();

        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }

        System.out.println();

        // crearea unui set cu numerele din lista pentru a elimina duplicatele

        Set<Integer> setDeNumere = new HashSet<>(listOfNumbers);

        listOfNumbers = new ArrayList<>(setDeNumere);

        System.out.println("Lista de numere cu duplicatele eliminate\n");

        for (Integer number : listOfNumbers) {
            System.out.println(number);
        }

        // folosirea unui comparator ca si criteriu pentru sortarea descrescatoare

        listOfNumbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println("\nLista de numere ordonata descrescator\n");

        for (Integer number : listOfNumbers) {
            System.out.println(number);
        }

        // crearea unui set de string-uri din lista sortata anterior

        Set<String> stringSet = new HashSet<>();

        for (Integer number : listOfNumbers) {
            stringSet.add("" + number);
        }

        System.out.println("\nSetul de string-uri din lista sortata anterior\n");

        for (String s : stringSet) {
            System.out.println(s);
        }

        // crearea map-ului care are ca si cheie elem. din set, si ca si valoare, elem. din lista

        // iterator pt a parcurge setul de string-uri de mai sus
        Iterator<String> stringIterator1 = stringSet.iterator();

        Map<String, Integer> map2 = new HashMap<>();

        for(int i = 0; i < listOfNumbers.size() && stringIterator1.hasNext(); i++){
            map2.put(stringIterator1.next() , listOfNumbers.get(i));
        }

        System.out.println("\nKeySet:");

        for (String s : map2.keySet()) {
            System.out.println(s);
        }

        System.out.println("\nValues:");

        for (Integer value : map2.values()) {
            System.out.println(value);
        }

        System.out.println("\nMap:");

        for (Map.Entry<String, Integer> s : map2.entrySet()) {
            System.out.println(s);
        }

    }
}

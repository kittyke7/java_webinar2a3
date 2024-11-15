import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    //    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number = 0;
//
//        while (true) {
//            try {
//                number = scanner.nextInt();
//                if (number >= 1 && number <= 10) {
//                    break;
//                } else {
//                    System.out.println("Must be between 1 and 10");
//                }
//            } catch (Exception e) {
//                System.out.println("Invalid input");
//                scanner.nextLine();
//            }
//
//        }
//               System.out.println("Your number is " + number);
//    }
//    public static void divide(int a, int b) throws Exception {
//        if (b == 0) {
//            throw new Exception("Hups, divide by zero");
//        } else {
//            return a / b;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] numbers = new int[3];
//        try {
//            int a = divide(5, 0);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }


//public static double calculatePrice(int scoopsCount) {
//    if (scoopsCount % 2 == 0) {
//        return scoopsCount * 1.5;
//    } else {
//        return scoopsCount * 1.25;
//    }
//}
//    public static void main(String[] args) {
//        System.out.println(calculatePrice(1));
//        System.out.println(calculatePrice(2));
//        System.out.println(calculatePrice(3));
//        System.out.println(calculatePrice(6));
//
//        }
//    }

//public static void printSumAndAvg(int start, int stop) {
//if (stop < start) {
//    System.out.println("Sucet " + 0);
//    System.out.println("Priemer " + 0);
//} else if (stop == start) {
//    System.out.println("Sucet " + stop);
//    System.out.println("Priemer " + stop);
//} else {
//    double sum = 0;
//    for (int i = start; i <= stop; i++) {
//        sum += i;
//    }
//
//    System.out.println("Sucet " + sum);
//    double avg = sum / (stop - start + 1);
//    System.out.println("Priemer " + avg);
//}
//}
//
//public static void main(String[] args) {
//    printSumAndAvg(1,3);
//    System.out.println();
//    printSumAndAvg(2,4);
//    System.out.println();
//    printSumAndAvg(1,3);
//    System.out.println();
//    printSumAndAvg(3,2);
//    System.out.println();
//    printSumAndAvg(1,100);
//}
//

//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    int userNumber = 0;
//    while (userNumber != 7) {
//        System.out.println("Zadaj cislo: ");
//    try {
//       userNumber = scanner.nextInt();
//    } catch (InputMismatchException e) {
//        System.out.println("Neplatne cislo, napis este raz");
//        scanner.nextLine();
//    }
//    }
//    System.out.println("Koniec programu");
//}

//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    int sum = 0;
//    int numbersCount = 0;
//
//    while (true) {
//        System.out.println("Zadaj cislo alebo q ak chces skoncit: ");
//        String userInput = scanner.nextLine();
//        if (userInput.equals("q")) {
//            break;
//        }
//        try {
//            double number = Double.parseDouble(userInput);
//            sum += number;
//            numbersCount +=1;
//        } catch (Exception e) {
//            System.out.println("Neplatne cislo alebo znak");
//
//        }
//    }
//    System.out.println("Sucet je " + sum);
//    double avg = 0;
//    if (numbersCount > 0) {
//        avg = sum / numbersCount;
//    }
//    System.out.println("Priemer je " + avg);
//}

//    public static void main(String[] args) {
//        for (int number = 2; number <= 1000; number++) {
//            boolean isPrime = true;
//            for (int divider = 2; divider < number; divider++) {
//                if (number % divider == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.println(number);
//            }
//        }

    //    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int limit = 1000;
//        System.out.print(a + " ");
//        System.out.print(b + " ");
//
//        while (a + b <= limit) {
//            int next = a + b;
//            a = b;
//            b = next;
//            System.out.print(next + " ");
//    }
//    }
    public static void main(String[] args) {
//    ArrayList<String> names = new ArrayList<>();
//    names.add("Jakub");
//    names.add("Petra");
//    names.add("Jakub");

//    System.out.println(names);
//
//        HashSet<String> name = new HashSet<>();
//        name.add("Filip");
//        name.add("David");
//        name.add("Filip");
//
//        System.out.println(name);

//        HashMap<String, String> dictionary = new HashMap<>();
//        dictionary.put("Jablko", "Ovocie, ktore je okruhle");
//        dictionary.put("Cucoriedky", "Ovocie, ktore rastie na krikoch");
//        System.out.println(dictionary);
//
//        for (Map.Entry<String, String> entry: dictionary.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("banana");

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("mango")) {
                iterator.remove();
            }
        }
        System.out.println(fruits);
    }
}
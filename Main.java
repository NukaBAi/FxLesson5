import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Kia");
//        cars.add("Ford");
//        cars.add("BMW");
//        cars.add("Mazda");
//        System.out.println(cars);
//
//    }
//}


//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Kia");
//        cars.add("Ford");
//        cars.add("BMW");
//        cars.add("Mazda");
//        for (int i = 0; i < cars.size(); i++){
//            System.out.println(cars.get(i));
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Kia");
//        cars.add("Ford");
//        cars.add("BMW");
//        cars.add("Mazda");
//        for (String i : cars){
//            System.out.println(i);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(10);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(20);
//        for (Integer i : myNumbers){
//            System.out.println(i);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Kia");
//        cars.add("Ford");
//        cars.add("BMW");
//        cars.add("Mazda");
//        Collections.sort(cars);
//        for (String i : cars){
//            System.out.println(i);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(33);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(34);
//        myNumbers.add(8);
//        myNumbers.add(12);
//
//        Collections.sort(myNumbers);
//        for(int i : myNumbers) {
//            System.out.println(i);
//        }
//    }
//}

//public class Main {
//    public static void main (String[] atgs){
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//
//        String car = cars.get(0);
//        System.out.println("get method:" + cars);
//
//        cars.set(0, "Opel");
//        System.out.println("set method:" + cars);
//
//        cars.remove(0);
//        System.out.println("remove method:" + cars);
//
//        cars.clear();
//        System.out.println("clear method:" + cars);
//
//        int s = cars.size();
//        System.out.println("list size" + s);
//
//
//    }
//}


//task 1

//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Pink");
//        colors.add("Yellow");
//        colors.add("Blue");
//        colors.add("Black");
//        Collections.sort(colors);
//        for (String i : colors){
//            System.out.println(i);
//        }
//    }
//}

//task2

//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Pink");
//        colors.add("Yellow");
//        colors.add("Blue");
//        colors.add("Black");
//        colors.add(0, "Pink");
//        System.out.println(colors);
//    }
//}

//task3

//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Pink");
//        colors.add("Yellow");
//        colors.add("Blue");
//        colors.add("Black");
//        String color = colors.get(0);
//        System.out.println("get method:" + color);
//    }
//}

//task4

//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Pink");
//        colors.add("Yellow");
//        colors.add("Blue");
//        colors.add("Black");
////        String color = colors.get(0);
//        colors.set(0, "Red");
//        System.out.println("set method:" + colors);
//    }
//}

//task5

//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Pink");
//        colors.add("Yellow");
//        colors.add("Blue");
//        colors.add("Black");
//        colors.remove(0);
//        System.out.println("remove method:" + colors);
//    }
//}

//task6

//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Pink");
//        colors.add("Yellow");
//        colors.add("Blue");
//        colors.add("Black");
//        String color = colors.get(0);
//        System.out.println("get method:" + color);
//    }
//}

//task7

//public class Main{
//    public static void main(String[] args){
//        ArrayList<String> colors = new ArrayList<>();
//        colors.add("Pink");
//        colors.add("Yellow");
//        colors.add("Blue");
//        colors.add("Black");
//
//        ArrayList<String> color = new ArrayList<>();
//        color = colors;
//        System.out.println(colors);
//        System.out.println(color);
//    }
//}

//task8

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<>();
//        colors.add("Pink");
//        colors.add("Yellow");
//        colors.add("Blue");
//        colors.add("Black");
//
//        Collections.shuffle(colors);
//        System.out.println(colors);
//    }
//}

//task9

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<>();
//        colors.add("Pink");
//        colors.add("Yellow");
//        colors.add("Blue");
//        colors.add("Black");
//
//        Collections.reverse(colors);
//        System.out.println(colors);
//    }
//}
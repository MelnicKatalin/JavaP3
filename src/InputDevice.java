import fruits.Apple;
import fruits.Banana;
import fruits.Fruit;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

import fruits.Mango;

public class InputDevice {

    public String getType(){
        return "random";
    }

    public int[] getNumbers(int n){
        int[] numbers = new int[n];
        for(int idx = 0; idx < n;idx++){
            numbers[idx] = this.nextInt();
        }

        return numbers;
    }

    public String getLine() {
        return "The quick brown fox jumps over the lazy dog";
    }

    public int nextInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public ArrayList<Fruit> readFruit(){
        ArrayList<Fruit> fruits = new ArrayList<Fruit>(10);
        Arrays.asList(new Banana(15, 3, 6), new Banana(25, 19, 2),
        new Apple(11, 4, 8, Fruit.Color.RED), new Mango(20, 4, 4, Fruit.Color.GREEN));
        return fruits;
    }

    public void testFruitComparison()
    {
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits = InputDevice.readFruit();
        Collections.sort(fruits);
        System.out.println(fruits);
        System.out.println(Collections.min(fruits).toString());
        System.out.println(Collections.max(fruits).toString());
    }

    public void testStreams()
    {
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits = InputDevice.readFruit();
        System.out.println(fruits.stream().filter(p -> p.getSugar_content() < 20).collect(Collectors.toList()));
        System.out.println(fruits.stream().mapToDouble(i -> i.getSugar_content()).sum());
        System.out.println(fruits.stream().mapToDouble(i -> i.getSugar_content() / i.getWater_content()).average().getAsDouble());
    }
}

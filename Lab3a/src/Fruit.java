import java.awt.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;

public abstract class Fruit
{
    int weight;
    int sugar;
    int water;
    Color color;
    public Fruit(int weight, int sugar, int water, Color color)
    {
        this.weight = weight;
        this.sugar = sugar;
        this.water = water;
        this.color = color;
    }
    enum Color
    {
        Red,Blue,Yellow,Green
    }




}

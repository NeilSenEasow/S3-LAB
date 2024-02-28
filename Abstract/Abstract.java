abstract class Shape   {
    public abstract void Numberofsides();
}
class Triangle extends Shape   {
    public void Numberofsides()   {
        System.out.print("Triangle has 3 sides\n");
    }
}

class Rectangle extends Shape   {
    public void Numberofsides()   {
        System.out.print("Rectangle has 4 sides\n");
    }
}

class Hexagon extends Shape   {
    public void Numberofsides()   {
        System.out.print("Hexagon has 6 sides\n");
    }
}

public class Abstract   {
    public static void main(String[] args)   {
        Shape r = new Rectangle();
        r.Numberofsides();
        Shape t = new Triangle();
        t.Numberofsides();
        Shape h = new Hexagon();
        h.Numberofsides();
    }
}


/*
 Write a java program to create an abstract class named Shape that contains an empty method named numberOfSides( ). Provide three classes named Rectangle, Triangle and Hexagon such that each one of the classes extends the class Shape.
 */
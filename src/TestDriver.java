import com.cf.designPatterns.abstractFactory.Client;
import com.cf.designPatterns.abstractFactory.FurnitureFactory;
import com.cf.designPatterns.abstractFactory.ModernFurnitureFactory;
import com.cf.designPatterns.abstractFactory.VictorianFurnitureFactory;
import com.cf.designPatterns.adapter.OldPrinter;
import com.cf.designPatterns.adapter.Printer;
import com.cf.designPatterns.adapter.PrinterAdapter;
import com.cf.designPatterns.bridge.CircleShape;
import com.cf.designPatterns.bridge.DrawingAPI1;
import com.cf.designPatterns.bridge.DrawingAPI2;
import com.cf.designPatterns.builder.*;
import com.cf.designPatterns.chainOfResponsibility.*;
import com.cf.designPatterns.composite.CompositeGraphic;
import com.cf.designPatterns.composite.Graphic;
import com.cf.designPatterns.decorator.*;
import com.cf.designPatterns.factoryMethod.ConcreteCreatorA;
import com.cf.designPatterns.factoryMethod.ConcreteCreatorB;
import com.cf.designPatterns.factoryMethod.Creator;
import com.cf.designPatterns.interpreter.Add;
import com.cf.designPatterns.interpreter.Expression;
import com.cf.designPatterns.interpreter.Number;
import com.cf.designPatterns.interpreter.Subtract;
import com.cf.designPatterns.iterator.NameRepositoryIterable;
import com.cf.designPatterns.observer.*;
import com.cf.designPatterns.prototype.ConcretePrototype1;
import com.cf.designPatterns.prototype.ConcretePrototype2;
import com.cf.designPatterns.singleton.Singleton;
import com.cf.designPatterns.templateMethod.*;

public class TestDriver {
    public static void main(String[] args) {

        // Singleton
        System.out.println("___DESIGN PATTERN SINGLETON___");
        Singleton s1 = Singleton.getIstance();
        Singleton s2 = Singleton.getIstance();
        if(s1 == s2){
            System.out.println("Unique istance confirmed!");
        }
        System.out.println();
        System.out.println();


        // Builder
        System.out.println("___DESIGN PATTERN BUILDER___");
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineer = new ConstructionEngineer(concreteHouseBuilder);
        House house = engineer.constructHouse();
        System.out.println("House is: " + house);
        System.out.println();
        System.out.println();

        // Iterator
        System.out.println("___DESIGN PATTERN ITERATOR___");
        NameRepositoryIterable namesRepository = new NameRepositoryIterable();
        for (String name : namesRepository) {
            System.out.println("Name: " + name);
        }
        System.out.println();
        System.out.println();


        // Decorator
        System.out.println("___DESIGN PATTERN DECORATOR___");
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("-----------------------------");
        System.out.println("Circle with red border");
        redCircle.draw();
        System.out.println();
        System.out.println();


        // Template Method
        System.out.println("___DESIGN PATTERN TEMPLATE METHOD___");
        BattlefieldGame battlefield4 = new BattlefieldGame();
        battlefield4.play();
        System.out.println("-----------------------------");
        CricketGame cricketSport2024 = new CricketGame();
        cricketSport2024.play();
        System.out.println();
        System.out.println();


        // Composite
        System.out.println("___DESIGN PATTERN COMPOSITE___");
        // Creazione di leaf
        Graphic circle1 = new com.cf.designPatterns.composite.Circle();
        Graphic circle2 = new com.cf.designPatterns.composite.Circle();
        // Creazione di composite
        CompositeGraphic composite = new CompositeGraphic();
        composite.add(circle1);
        composite.add(circle2);
        // Creazione di una composizione più complessa
        CompositeGraphic complexComposite = new CompositeGraphic();
        complexComposite.add(composite); // Si possono aggiungere composizione ad altre composizioni
        complexComposite.add(new com.cf.designPatterns.composite.Circle());
        // Disegna la composizione
        complexComposite.draw();
        System.out.println();
        System.out.println();


        // Observer
        System.out.println("___DESIGN PATTERN OBSERVER___");
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver(subject);
        Observer observer2 = new ConcreteObserver(subject);
        subject.setState(10);
        subject.setState(20);
        System.out.println();
        System.out.println();


        // Abstract Factory
        System.out.println("___DESIGN PATTERN ABSTRACT FACTORY___");
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        FurnitureFactory modernFactory = new ModernFurnitureFactory();

        Client client1 = new Client(victorianFactory);
        Client client2 = new Client(modernFactory);

        client1.useFurniture();
        client2.useFurniture();

        System.out.println();
        System.out.println();


        // Factory
        System.out.println("___DESIGN PATTERN FACTORY METHOD___");
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation();
        Creator creatorB = new ConcreteCreatorB();
        creatorB.someOperation();

        System.out.println();
        System.out.println();


        // Chain of Responsibility
        System.out.println("___DESIGN PATTERN CHAIN OF RESPONSIBILITY___");
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        Handler fallbackHandler = new FallbackHandler();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        handler3.setNextHandler(fallbackHandler);

        handler1.handleRequest("Request1");
        handler1.handleRequest("Request2");
        handler1.handleRequest("Request3");
        handler1.handleRequest("Request4");

        System.out.println();
        System.out.println();



        // Prototype
        System.out.println("___DESIGN PATTERN PROTOTYPE___");
        ConcretePrototype1 prototype1 = new ConcretePrototype1("test");
        ConcretePrototype2 prototype2 = new ConcretePrototype2(123);

        ConcretePrototype1 clone1 = (ConcretePrototype1) prototype1.clone();
        ConcretePrototype2 clone2 = (ConcretePrototype2) prototype2.clone();

        System.out.println(clone1); // Output: ConcretePrototype1 [field=example]
        System.out.println(clone2); // Output: ConcretePrototype2 [number=123]

        System.out.println();
        System.out.println();



        // Adapter
        System.out.println("___DESIGN PATTERN ADAPTER___");
        OldPrinter oldPrinter = new OldPrinter();
        Printer printer = new PrinterAdapter(oldPrinter);
        printer.print();

        System.out.println();
        System.out.println();



        // Bridge
        System.out.println("___DESIGN PATTERN BRIDGE___");
        com.cf.designPatterns.bridge.Shape[] shapes = new com.cf.designPatterns.bridge.Shape[] {
                new CircleShape(1, 2, 3, new DrawingAPI1()),
                new CircleShape(5, 7, 11, new DrawingAPI2()),
        };

        for (com.cf.designPatterns.bridge.Shape shape : shapes) {
            shape.draw();
            shape.resizeByPercentage(10);
            shape.draw();
        }

        System.out.println();
        System.out.println();



        // Interpreter
        System.out.println("___DESIGN PATTERN INTERPRETER___");
        // Costruzione dell'albero di espressioni: (5 + 3) - 2
        Expression expression = new Subtract(
                new Add(
                        new Number(5),
                        new Number(3)
                ),
                new Number(2)
        );

        int result = expression.interpret();
        System.out.println("Result: " + result);  // Output: Result: 6

        System.out.println();
        System.out.println();
    }
}
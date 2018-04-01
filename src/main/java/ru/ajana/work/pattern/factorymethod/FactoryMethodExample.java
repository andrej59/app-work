package ru.ajana.work.pattern.factorymethod;

/**
 * Created by Андрей on 20.12.2015.
 */
public class FactoryMethodExample {
    static class Product {
    }


    static class ConcreteProductA extends Product {
    }


    static   class ConcreteProductB extends Product {
    }


    static abstract class Creator {
        public abstract Product factoryMethod();
    }


    static class ConcreteCreatorA extends Creator {
        @Override
        public Product factoryMethod() {
            return new ConcreteProductA();
        }
    }

    static class ConcreteCreatorB extends Creator {
        @Override
        public Product factoryMethod() {
            return new ConcreteProductB();
        }
    }

    public static void main(String[] args) {
        // an array of creators
        Creator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};
        // iterate over creators and create products
        for (Creator creator : creators) {
            Product product = creator.factoryMethod();
            System.out.printf("Created {%s}\n", product.getClass());
        }
    }
}

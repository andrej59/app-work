package ru.ajana.work.common.enums;

/**
 * Перечисление сезонов с абстрактным методом.
 *
 * @author Andrey Kharintsev on 24.11.2018
 */
public enum SeasonEnum implements InterfaceEnum {
    WINTER {
        @Override
        public Enum getEnum() {
            return this;
        }
        @Override
        public void printHours() {
            System.out.println("9am-3pm");
        }
    }, SPRING {
        @Override
        public Enum getEnum() {
            return SeasonEnum.SPRING;
        }

        @Override
        public void printHours() {
            System.out.println("9am-5pm");
        }
    }, SUMMER {
        @Override
        public Enum getEnum() {
            return null;
        }
        @Override
        public void printHours() {
            System.out.println("9am-7pm");
        }
    }, FALL {
        @Override
        public Enum getEnum() {
            return null;
        }

        public void printHours() {
            System.out.println("9am-5pm");
        }
    };

    public abstract void printHours();
}

package homework_08.task_05;

/*
Задание 5+
Используя Intelij IDEA создать проект, пакет.
Создать класс Animal с именем String, возрастом int, хвостом Boolean.
В классе переопределить метод toString, что бы вывод был сдедующим «Имя: Васька, возраст: 45, хвост: нет».
В классе Animal переопределить методы equals & hashCode.
 */


import java.util.Objects;

public class Animal {

    private String name;
    private int age;
    private boolean tail = true;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        int i = 0;
        if(tail == true){
            i = 1;
        } else {
            i = 2;
        }
        return 681609170 + i;
    }

    private String tailStr(boolean tail){
        String a;
        if(tail){
          a = " Хвост есть ";
        } else {
            a = " Нет ";
        }
        return  a;
    }

    @Override
    public String toString() {
        return " Animal " +
                " имя = " + name +
                " возраст = " + age +
                " хвост = " + tailStr(tail);
    }

}

class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal("Васька",45,false);
        System.out.println( animal1.toString() );
        Animal animal2 = new Animal("Васька",45,false);
        System.out.println( animal1.hashCode());
        System.out.println( animal2.hashCode());

        System.out.println(animal1.equals(animal2));
    }

}

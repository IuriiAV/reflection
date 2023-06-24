package org.reflection.stringcollector;

//В данном классе должно быть получено только поле surname
//префикс FE
public class StudentFE extends AbstractStudent {

    private final String name;

    private final String surname;

    public StudentFE() {
        name = NameUtil.getRandomName();
        surname = NameUtil.getRandomName();
    }
}
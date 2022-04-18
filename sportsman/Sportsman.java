package sportsman;

import java.util.*;

public class Sportsman {
    private int id;
    private String name;
    private int age;
    private String gender;

    private static Map<Integer, Sportsman> allUsers;
    private static int countId = 0;//присваивает id new Sp-man

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sportsman sportsman = (Sportsman) o;
        return age == sportsman.age &&
                Objects.equals(name, sportsman.name) &&
                gender.equals(sportsman.gender) ;
    }
    //проверяет есть-ли объект в списке
    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    private boolean hasUser(){
        for (Sportsman sportsman : allUsers.values()){
            if (sportsman.equals(this) && sportsman.hashCode() == this.hashCode()){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + gender +
                '}';
    }

//конструктор класса
    public Sportsman(String name, int age, String gender) {
        if (allUsers == null){
            allUsers = new HashMap<>();
        }

        this.name = name;
        this.age = age;
        this.gender = gender;

        if (!hasUser()){
            countId++;
            this.id = countId;
            allUsers.put(id, this);
        }
    }

    //геттеры и сеттеры
    public void setAge(int age) {
        if (age < 0)
            throw new IllegalArgumentException("can't be smaller than 0.");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //возвращает список всех спортсменов
    public static List<Sportsman> getAllSprotsman(){
        return new ArrayList<>(allUsers.values());
    }
    //возвращает список всех спортсменов в зависимости от пола
    public static List<Sportsman> getAllSprotsman(String gender){
        List<Sportsman> listAllSportsman = new ArrayList<>();
        for (Sportsman sportsman : allUsers.values()){
            if (sportsman.gender.equals(gender) ){
                listAllSportsman.add(sportsman);
            }
        }
        return listAllSportsman;
    }

    //кол-во всех спортсменов
    public static int getHowManySportsman(){
        return allUsers.size();
    }

    //кол-во спортсменов в зависимости о пола
    public static int getHowManySportsman(String gender){
        return getAllSprotsman(gender).size();
    }
}

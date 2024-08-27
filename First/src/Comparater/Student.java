package Comparater;

public class Student implements Comparable<Student> {                    // Implementing Comparable Interface so that Comparater.Student Object can be Sorted using Collections.sort

    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Comparater.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.age, that.age);
    }
}

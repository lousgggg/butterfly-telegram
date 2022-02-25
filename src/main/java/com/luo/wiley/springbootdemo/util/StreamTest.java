package com.luo.wiley.springbootdemo.util;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest {
  public static void main(String[] args) {
    List<Person> personList = new ArrayList<Person>();
    personList.add(new Person("Tom", 8900, 23, "male", "New York"));
    personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
    personList.add(new Person("Lily", 7800, 21, "female", "Washington"));

    // 每个员工减去起征点后的薪资之和（这个例子并不严谨，但一时没想到好的例子）
    Integer sum = personList.stream().map(Person::getSalary).reduce(0, (i, j) -> (i + j - 5000));
    System.out.println("员工扣税薪资总和：" + sum);

    // stream的reduce
    Optional<Integer> sum2 = personList.stream().map(Person::getSalary).reduce(Integer::sum);
    System.out.println("员工薪资总和：" + sum2.get());

    Short a = 128;
    Short b = 128;
    System.out.println("result: " + (a == b));
  }
}

@Data
class Person {
  private String name;

  private Integer salary;

  private Integer age;

  private String sex;

  private String city;

  public Person(String name, Integer salary, Integer age, String sex, String city) {
    this.name = name;
    this.salary = salary;
    this.age = age;
    this.sex = sex;
    this.city = city;
  }

}

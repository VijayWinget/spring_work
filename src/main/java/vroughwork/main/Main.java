/**
 * 
 */
package vroughwork.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create a list of objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("David Kim 01", "New Jersey", "davidkim", "p@ssword12345",
                "25 Cedar St", 33, true, false, true));
        people.add(new Person("David Kim 02", "New Jersey", "davidkim", "p@ssword12345",
                "25 Cedar St", 33, false, true, false));
        people.add(new Person("David Kim 03", "New Jersey", "davidkim", "p@ssword12345",
                "25 Cedar St", 33, false, false, false));
        people.add(new Person("David Kim 04", "New Jersey", "davidkim", "p@ssword12345",
        		"25 Cedar St", 33, false, false, false));
        people.add(new Person("David Kim 05", "New Jersey", "davidkim", "p@ssword12345",
        		"25 Cedar St", 33, false, false, true));
        people.add(new Person("David Kim 06", "New Jersey", "davidkim", "p@ssword12345",
        		"25 Cedar St", 33, false, false, true));
        people.add(new Person("David Kim 07 ", "New Jersey", "davidkim", "p@ssword12345",
        		"25 Cedar St", 33, false, true, false));
        people.add(new Person("David Kim 08", "New Jersey", "davidkim", "p@ssword12345",
        		"25 Cedar St", 33, false, true, false));
        people.add(new Person("David Kim 09 ", "New Jersey", "davidkim", "p@ssword12345",
        		"25 Cedar St", 33, false, false, false));

        // print the list before sorting
        System.out.println("Before sorting:");
        for (Person person : people) {
//            System.out.println(person);
        }

        // sort the list using a custom Comparator
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.isverified != o2.isverified) {
                    return o1.isverified ? -1 : 1;
                } else if (o1.isDuty != o2.isDuty) {
                    return o1.isDuty ? -1 : 1;
                } else if (o1.isvaccinated != o2.isvaccinated) {
                    return o1.isvaccinated ? -1 : 1;
                } else {
                    return 0;
                }
            }
        });
        
        
        

        // print the list after sorting
        System.out.println("After sorting:");
        for (Person person : people) {
            System.out.println(person);
        }
    }

    static class Person {
        String name;
        String state;
        String username;
        String password;
        String address;
        int id;
        boolean isDuty;
        boolean isverified;
        boolean isvaccinated;

        public Person(String name, String state, String username, String password, String address,
                      int id, boolean isDuty, boolean isverified, boolean isvaccinated) {
            this.name = name;
            this.state = state;
            this.username = username;
            this.password = password;
            this.address = address;
            this.id = id;
            this.isDuty = isDuty;
            this.isverified = isverified;
            this.isvaccinated = isvaccinated;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", state='" + state + '\'' +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", address='" + address + '\'' +
                    ", id=" + id +
                    ", isDuty=" + isDuty +
                    ", isverified=" + isverified +
                    ", isvaccinated=" + isvaccinated +
                    '}';
        }
    }
}


package ru.ajana.work.task;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppTask1 {

    class User {
        private String      username;
        private Integer     age;
        private List<Group> groups;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public List<Group> getGroups() {
            return groups;
        }

        public void setGroups(List<Group> groups) {
            this.groups = groups;
        }
    }


    class Group {
        private String name;
        private String description;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        String str;
    }

    public List<User> consume(Stream<User> usersStream) {
        new HashMap();
        return usersStream.filter(
                u -> u.getGroups().stream()
            .filter(g -> g.getName().startsWith("A"))
                    .count() > 0)
            .collect(Collectors.toList());
    }
}

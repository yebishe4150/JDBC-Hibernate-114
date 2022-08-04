package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("John", "Doe", (byte) 25);
        userService.saveUser("Jane", "Doe", (byte) 30);
        userService.saveUser("Tom", "Smith", (byte) 35);
        userService.saveUser("Emma", "Jones", (byte) 28);

        userService.getAllUsers().forEach(user ->
                System.out.println(user.getName() + " " + user.getLastName() + " " + user.getAge()));

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

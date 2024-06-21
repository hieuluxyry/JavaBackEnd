package src;

import src.entity.User;
import src.impl.Manager;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserManager implements Manager {
    private List<User> users;
    private final String PATH_FILE = "data.txt";

    public UserManager() {
        this.users = new ArrayList<User>();
    }

    @Override
    public void addUser(User user) {
        try {
            writeDataToFile(user);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void showList() {
        try {
            this.users = readDataToFile();
            for (User user : this.users) {
                System.out.println(user);
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteUser(int id) {
        try {
            this.users = readDataToFile();
            User userToRemove = null;
            for (User item : this.users) {
                if (item.getId() == id) {
                    userToRemove = item;
                    break;
                }
            }
            if (userToRemove != null) {
                this.users.remove(userToRemove);

                // Write the updated user list back to the file
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH_FILE))) {
                    for (User item : this.users) {
                        bufferedWriter.write(item.getId() + "," + item.getUsername() + "," + item.getPassword() + "," + item.getBirthDay());
                        bufferedWriter.newLine();
                    }
                }
            } else {
                System.out.println("User with ID " + id + " not found.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateUser(int id, User user) {
        try {
            this.users = readDataToFile();
            // find user
            for (User item : this.users) {
                if (item.getId() == id) {
                    item.setUsername(user.getUsername());
                    item.setPassword(user.getPassword());
                    item.setBirthDay(user.getBirthDay());
                }
            }
            // ghi lai vao file
             File myFile = new File(PATH_FILE);
            if (!myFile.exists()) {
                throw new FileNotFoundException("File not found");
            }
            FileWriter fileWriter = new FileWriter(myFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (User item : this.users) {
                bufferedWriter.write(item.getId() + "," + item.getUsername() + "," + item.getPassword() + "," + item.getBirthDay());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<User> readDataToFile() throws IOException {
        File myFile = new File(PATH_FILE);
        if (!myFile.exists()) {
            throw new FileNotFoundException("File not found");
        }
        FileReader filereader = new FileReader(myFile);
        BufferedReader bufferedReader = new BufferedReader(filereader);
        String line;
        List<User> listUsers = new ArrayList<User>();
        while ((line = bufferedReader.readLine()) != null && !line.isEmpty()) {
            String[] data = line.split(",");
            int id = Integer.parseInt(data[0]);
            String username = data[1];
            String password = data[2];
            String birthDay = data[3];
            User user = new User(id, username, password, birthDay);
            listUsers.add(user);
        }
        return listUsers;
    }

    public void writeDataToFile(User user) throws IOException {
        File myFile = new File(PATH_FILE);
        if (!myFile.exists()) {
            throw new FileNotFoundException("File not found");
        }
        String newLine = user.getId()  + "," + user.getUsername() + "," + user.getPassword() + "," + user.getBirthDay();
        FileWriter fileWriter = new FileWriter(myFile, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.newLine();
        writer.append(newLine);
        writer.close();
    }

}

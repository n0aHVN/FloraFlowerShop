package murach.Data.Homework;

import java.io.*;
import java.util.*;

import murach.Business.Homework.UserHomework;
public class UserIO {

    public static boolean add(UserHomework user, String filepath) {
        try {
            File file = new File(filepath);
            PrintWriter out = new PrintWriter(
                    new FileWriter(file, true));
            out.println(user.getEmail() + "|"
                    + user.getFirstName() + "|"
                    + user.getLastName());

            out.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static UserHomework getUser(String email, String filepath) {
        try {
            File file = new File(filepath);
            BufferedReader in = new BufferedReader(
                    new FileReader(file));
            UserHomework user = new UserHomework();
            String line = in.readLine();
            while (line != null) {
                StringTokenizer t = new StringTokenizer(line, "|");
                if (t.countTokens() < 3) {
                    return new UserHomework("", "", "");
                }
                String token = t.nextToken();
                if (token.equalsIgnoreCase(email)) {
                    String firstName = t.nextToken();
                    String lastName = t.nextToken();
                    user.setEmail(email);
                    user.setFirstName(firstName);
                    user.setLastName(lastName);
                }
                line = in.readLine();
            }
            in.close();
            return user;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<UserHomework> getUsers(String filepath) {
        try {
            ArrayList<UserHomework> users = new ArrayList<UserHomework>();
            BufferedReader in = new BufferedReader(
                    new FileReader(filepath));
            String line = in.readLine();
            while (line != null) {
                StringTokenizer t = new StringTokenizer(line, "|");
                String email = t.nextToken();
                String firstName = t.nextToken();
                String lastName = t.nextToken();
                UserHomework user = new UserHomework(firstName, lastName, email);
                users.add(user);
                line = in.readLine();
            }
            in.close();
            return users;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

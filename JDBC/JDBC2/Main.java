import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        DBUtil dbUtil = new DBUtil("jdbc:mysql://localhost:3306/student", "root", "123456");

        /*boolean isAdded =
        dbUtil.addEmp(
                5690,
                "Sachin Tendulkar",
                "MANAGER",
                7934,
                "2020-09-13",
                3400,
                900,
                30
        );
        System.out.println(isAdded);*/
        /*Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        */
        //boolean result = dbUtil.login(username, password);
        /*boolean result = dbUtil.addUser(
                username,
                password,
                "/Users/vishal/java/core java/workspaces/demo_files/arrow-right.png"
        );
        System.out.println(result);*/

        /*ArrayList<User> users = dbUtil.getUsers();
        for(User user : users) {
            System.out.println(user);
        }
       */

        dbUtil.storedProcedureCallDemo();

        dbUtil.close();
    }
}



/*
CREATE PROCEDURE `insert_user_and_return_length`(
    IN username VARCHAR(255),
    IN password VARCHAR(255),
    OUT id INT
)
BEGIN
    -- Insert the user into the table
    INSERT INTO users (username, password) VALUES (username, password);

    -- Set the OUT parameter to the length of the username
    SET id = CHAR_LENGTH(username);
END


* */
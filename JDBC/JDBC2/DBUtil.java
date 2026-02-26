import java.io.*;
import java.sql.*;
import java.util.ArrayList;

public class DBUtil {
    private Connection conn;

    public DBUtil(String host, String username, String password) throws SQLException {
        conn = DriverManager.getConnection(host, username, password);
    }

    public ArrayList<Employee> getEmployees() {
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(
                    "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp"
            );

            ArrayList<Employee>  employees = new ArrayList<>();

            while(rs.next()) {
                employees.add(
                        new Employee(
                                rs.getInt(1),
                                rs.getString("ename"),
                                rs.getString("job"),
                                rs.getInt("mgr"),
                                rs.getString("hiredate"),
                                rs.getInt("sal"),
                                rs.getInt("comm"),
                                rs.getInt("deptno")
                        )
                );
            }
            return employees;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<Employee> getEmployeesByDeptNo(int deptNo) {
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(
                    "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp where deptno = " + deptNo
            );

            ArrayList<Employee>  employees = new ArrayList<>();

            while(rs.next()) {
                employees.add(
                        new Employee(
                                rs.getInt(1),
                                rs.getString("ename"),
                                rs.getString("job"),
                                rs.getInt("mgr"),
                                rs.getString("hiredate"),
                                rs.getInt("sal"),
                                rs.getInt("comm"),
                                rs.getInt("deptno")
                        )
                );
            }
            return employees;
        } catch (SQLException e) {
            return null;
        }
    }

    public boolean addEmp(
            int empNo,
            String empName,
            String job,
            int managerNo,
            String hireDate,
            int sal,
            int comm,
            int deptNo
    ) {
        try {
            String query = "insert into emp values(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pStmt = conn.prepareStatement(query);

            pStmt.setInt(1, empNo);
            pStmt.setString(2, empName);
            pStmt.setString(3, job);
            pStmt.setInt(4, managerNo);
            pStmt.setString(5, hireDate);
            pStmt.setInt(6, sal);
            pStmt.setInt(7, comm);
            pStmt.setInt(8, deptNo);

            return pStmt.executeUpdate() == 1;

        } catch (SQLException e) {
            return false;
        }
    }

    public int getEmployeesCount() {
        try {
            ResultSet rs = conn.createStatement().executeQuery(
                    "select count(*) as emp_count  from emp"
            );

            rs.next();
            return rs.getInt("emp_count");

        } catch (SQLException e) {
            return -1;
        }
    }

    public boolean updateSalAndComm(
            int empNo,
            int newSal,
            int newComm
    ) {
        String sql = "update emp set sal = " + newSal + ", comm = " + newComm + " where empno = " + empNo;
        try {
            return conn.createStatement()
                    .execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean login(String username, String password) {
        String sql = "select username from users where username = ? and password = ?" ;
        //System.out.println(sql);

        try {
            PreparedStatement pStmt = conn.prepareStatement(sql);

            pStmt.setString(1, username);
            pStmt.setString(2, password);

            System.out.println(pStmt);

            ResultSet rs = pStmt.executeQuery();
            return rs.next();

        } catch (Exception e) {
            return false;
        }
    }

    public boolean addUser(String username, String password, String filePath) {
        try {
            PreparedStatement pStmt =
                    conn.prepareStatement(
                            "insert into users values(?, ?, ?)"
                    );
            pStmt.setString(1, username);
            pStmt.setString(2, password);

            FileInputStream fin = new FileInputStream(filePath);
            pStmt.setBlob(3, fin);

            return pStmt.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<User> getUsers() {
        String basePath = "/Users/vishal/java/core java/workspaces/demo_files/";

        try {
            PreparedStatement pStmt =
                    conn.prepareStatement("select * from users");
            ResultSet rs = pStmt.executeQuery();

            ArrayList<User> users = new ArrayList<>();

            while(rs.next()) {
                String username = rs.getString(1);
                String password = rs.getString(2);
                String userFilePath = null;
                Blob blob = rs.getBlob(3);

                if(blob != null) {
                    InputStream in = blob.getBinaryStream();
                    File userFile = new File(basePath + username + ".png");
                    if (!userFile.exists()) {
                        userFile.createNewFile();
                    }
                    FileOutputStream fout = new FileOutputStream(userFile);
                    byte[] data = new byte[1024];
                    int count;
                    while ((count = in.read(data)) != -1) {
                        fout.write(data, 0, count);
                    }
                    in.close();
                    fout.close();
                    userFilePath = basePath + username + ".png";
                }
                users.add(
                        new User(username, password, userFilePath)
                );
            }

            return users;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void storedProcedureCallDemo() {
        String sql = "{CALL insert_user_and_return_length(?, ?, ?)}";
        CallableStatement cstmt = null;
        try {
            cstmt = conn.prepareCall(sql);
            // Set IN parameters
            cstmt.setString(1, "puneuser01");
            cstmt.setString(2, "abc123");

            // Register OUT parameter
            cstmt.registerOutParameter(3, Types.INTEGER);

            cstmt.execute();
            int length = cstmt.getInt(3);
            System.out.println("length = " + length);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

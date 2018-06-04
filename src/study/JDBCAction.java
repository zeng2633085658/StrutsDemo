package study;


import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

public class JDBCAction extends ActionSupport {
    private String user;
    private String password;
    private String name;

    public String execute() {
        String ret = ERROR;
        Connection conn = null;
        try {
            String URL = "jdbc:mysql://localhost/study";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, "root", "123456");
            String sql = "select * from test where username='" + user + "'" +
                    " and password='" + password + "'";
            System.out.println(sql);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                name = rs.getString("username");
                System.out.println(name);
                ret = SUCCESS;
            }
        } catch (Exception e) {
            ret = ERROR;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                }
            }

        }
        return ret;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

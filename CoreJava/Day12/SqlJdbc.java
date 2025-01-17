package Day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static java.lang.Class.forName;

public class SqlJdbc {
    public static void main(String[] args) {
        Connection con = null;
        Statement smt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1525");
            System.out.println(con);
            smt = con.createStatement();
            System.out.println(smt);
            String []sql={"insert into mark values(1,\"Nisha\",98)","insert into mark values(2,\"Adhithya \",95)","insert into mark values(3,\"Jackson\",93)"};
            for (int i = 0; i < sql.length; i++) {
                int h = smt.executeUpdate(sql[i]);
                System.out.println(h);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (con!=null){
                    con.close();
                }if (smt!=null){
                    smt.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
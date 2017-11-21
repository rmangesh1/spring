package mang.no.study;

import org.apache.commons.io.IOUtils;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

import java.io.*;
import java.sql.*;

/**
 * Created by mrana on 17.10.2017.
 */
public class ExtractFiles {
    public static void main(String[] args) {

        LobHandler lobHandler = new DefaultLobHandler();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@vm-pdb-995:1521/p4efak_dg_rw_jdbc", "mrana", "22Dec!988");

            Statement stmt=con.createStatement();

            /*ResultSet rs = stmt.executeQuery("select fi.FILE_NAME,fc.content  from FAKTURA_COMMON.FIL fi, FAKTURA_COMMON.FILCONTENT fc where fc.fil_id = fi.id and  fi.id in (\n" +
                    "select UT_FIL from EFAKTURA_B2B.FAKTURA where BUYER_KUNDE_IDENTIFIKATOR='917568278' and trunc(behandlet_time) between TO_DATE('15.08.2017','dd.MM.yyyy') and TO_DATE('16.10.2017','dd.MM.yyyy') )");*/

            ResultSet rs = stmt.executeQuery("select fi.FILE_NAME,fc.content  from FAKTURA_COMMON.FIL fi, FAKTURA_COMMON.FILCONTENT fc where fc.fil_id = fi.id and  fi.id in (select PRINT_OUTPUT_FILE from FAKTURA_COMMON.LAYOUT_TASK_RESULT where id in (select LAYOUT_TASK_RESULT from FAKTURA_COMMON.LAYOUT_TASK where CORRELATION_ID in (\n" +
                    "select id from EFAKTURA_B2B.FAKTURA where BUYER_KUNDE_IDENTIFIKATOR='917568278' and trunc(behandlet_time) between TO_DATE('15.08.2017','dd.MM.yyyy') and TO_DATE('16.10.2017','dd.MM.yyyy'))))");

            while(rs.next()) {
                //Blob b = rs.getBlob(2);
                File file = new File("C:\\Users\\mrana\\Desktop\\ISSERVICEDESK-3816\\pdfs\\"+rs.getString(1));
                InputStream in = rs.getBlob(2).getBinaryStream();
                OutputStream out = new FileOutputStream(file);
                IOUtils.copy(in,out);

            }

            System.out.println("Generated files... ");

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

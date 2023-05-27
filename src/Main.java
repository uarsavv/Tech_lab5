import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws SQLException, ParseException {
        SQLManager sqlMan = new SQLManager();
        sqlMan.Conn();
        sqlMan.ReadDB();
        //sqlMan.DeleteByID(22);
        sqlMan.WriteDB("Special Feel", "Twice", 20210000L, 15.5F, 14, 1);
        System.out.println(sqlMan.FindById(1));
        System.out.println(sqlMan.FindByArtist("Sting"));
        sqlMan.CloseDB();
    }
}
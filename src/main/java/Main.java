import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

//        SerilLearn serilLearn = new SerilLearn();
//        File file = new File("firstFile.bin");
//
//        FileOutputStream fo = new FileOutputStream(file);
//
//        ObjectOutputStream oo = new ObjectOutputStream(fo);
//
//        oo.writeObject(serilLearn);
//        oo.flush();
//        oo.close();
//
//        FileInputStream fi = new FileInputStream(file);
//
//        ObjectInputStream si = new ObjectInputStream(fi);
//        SerilLearn serilLearn2 = (SerilLearn) si.readObject();
//        si.close();

        InputStream fis;
        Properties property = new Properties();

        fis = new FileInputStream("src/main/resources/config.properties");
        property.load(fis);


        String host = property.getProperty("db.host");
        String login = property.getProperty("db.login");
        String password = property.getProperty("db.password");
//
//        System.out.println("Host: "+ host);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            System.out.println("Connection succesfull!");
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }


        Connection connection = DriverManager.getConnection(host,login,password);
    }
}

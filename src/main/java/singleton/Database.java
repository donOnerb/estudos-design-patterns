package singleton;

import static java.util.Objects.isNull;

public class Database {

    private static Database instance;

    private Database() {
    }

    public static Database getInstance() {
        if (isNull(instance)) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println(sql);
    }

    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.query("select * from table");
    }
}

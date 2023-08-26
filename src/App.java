

import org.hibernate.Session;

import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Session s=SessionFactoryConfiguration.getInstance().getSession();
    }
}

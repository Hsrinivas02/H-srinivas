package pom;

public class s2 {

    saaucek1 s = new saaucek1();

    public void exe(String k) {

        if (k.equals("lb")) {

            s.launch();

        } else if (k.equals("url")) {

            s.url();

        } else if (k.equals("user")) {

            s.user();

        } else if (k.equals("pass")) {

            s.pass();

        } else if (k.equals("login")) {

            s.login();
        }
        else if(k.equals("close")) {
        	s.close();
        }
    }
}
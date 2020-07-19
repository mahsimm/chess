
package Refrnces;

//import com.sun.org.apache.xml.internal.security.encryption.Serializer;
import java.io.Serializable;


public class User_Info implements Serializable{
    String first_name=null;
    String last_name=null;
    String user_name=null;
    String pass=null;
    int math_win=0;
    int math_lose=0;

    
        public User_Info(String first_name,String last_name,String user_name,String pass,int w,int l) 
        {
            this.first_name=first_name;
            this.last_name=last_name;
            this.user_name=user_name;
            this.pass=pass;
            this.math_win=w;
            this.math_lose=l;
        }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getMath_win() {
        return math_win;
    }

    public void setMath_win(int math_win) {
        this.math_win = math_win;
    }

    public int getMath_lose() {
        return math_lose;
    }

    public void setMath_lose(int math_lose) {
        this.math_lose = math_lose;
    }

   
    
    
        
    
    
    
}

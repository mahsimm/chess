/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkWithFile;

import Refrnces.Path;
import Refrnces.User_Info;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MASON
 */
public class WorkWithFile 
{
       String first_name=null;
    String last_name=null;
    String user_name=null;
    String pass=null;
    int math_win=0;
    int math_lose=0;
    
    Path path;

        public WorkWithFile(String f,String l,String un,String p, int win,int lose) {
            this.first_name=f;
            this.last_name=l;
            this.user_name=un;
            this.pass=p;
            this.math_win=win;
            this.math_lose=lose;

        }

            public WorkWithFile() {
            }
        
         public void addoneUser(String path,boolean b)throws  IOException, ClassNotFoundException
            
            {
                  User_Info user=new User_Info(first_name, last_name, user_name, pass,math_win,math_lose);
                  System.out.println(first_name+last_name+user_name+pass+math_lose+math_win);
                  FileOutputStream z2 = new FileOutputStream(path,b);
                   try(ObjectOutputStream z3 = new ObjectOutputStream(z2)){
                        z3.writeObject(user);
            
         }
                      System.err.println("add one user");

            }
         
         public void overWrite(String path,ArrayList<User_Info> user) throws FileNotFoundException, IOException

               {
                    FileOutputStream myfile1 = new FileOutputStream(path,false);
                    for (int i = 0; i < user.size(); i++) {
                        try{
                                ObjectOutputStream owrite = new ObjectOutputStream(myfile1);
                                owrite.writeObject(user.get(i)); 
                            }catch(IOException e){}
                                    }

                    System.err.println("overWrite");

                }
      
         
           public HashMap search(String sn,String path)throws IOException, ClassNotFoundException
                        
                {
                       HashMap hashMap=new HashMap();
            ArrayList<User_Info> array=showallmem(path);
            for (int i = 0; i < array.size(); i++) 
            {
                if(array.get(i).getUser_name().toString().equals(sn))
                {
                hashMap.put("un",array.get(i).getUser_name().toString());
                hashMap.put("p",array.get(i).getPass().toString());
                hashMap.put("fn", array.get(i).getFirst_name().toString());
                hashMap.put("ln", array.get(i).getLast_name().toString());
                hashMap.put("win", String.valueOf(array.get(i).getMath_win()));
                hashMap.put("lose", String.valueOf(array.get(i).getMath_lose()));
                }
                
            }
                    return hashMap;

                }
         
              public ArrayList showallmem(String path)throws IOException, ClassNotFoundException
                    {
                       ArrayList<User_Info> array=new ArrayList<>(); 
                      HashMap hashMap=new HashMap();


                     File file=new File(path);
                    try {
                        FileInputStream fis=new FileInputStream(file);

                        try{
                        while (true)
                        {
                           ObjectInputStream ois=new ObjectInputStream(fis);
                            User_Info user=(User_Info)ois.readObject();
                            array.add(user);

                        }
                        }catch(EOFException  | ClassNotFoundException | FileNotFoundException e){} catch(IOException e){}


                    } catch (FileNotFoundException e) {
                    } 
                       
                    return  array;
                    }
              
                public void Edit(String un,User_Info usi ,String path) throws IOException, ClassNotFoundException
                        {
                            HashMap hashMap=search(un, path);
                            ArrayList<User_Info> users=showallmem(path);
                            
                            for (int i = 0; i <users.size(); i++)
                            {
                                if(users.get(i).getUser_name().toString().equals(un))
                                {
                                    users.set(i,usi);
                                
                                    overWrite(path, users);
                                    break;
                                }
                                
                            }


                        }
        
    
}

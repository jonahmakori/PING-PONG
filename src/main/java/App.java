

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
   public static void main(String[] args) {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("I'm a ping-pong Application!");
       System.out.println("Enter a Number:");
       try {
           String stringUserNumber = bufferedReader.readLine();
           int intUserNumber = Integer.parseInt(stringUserNumber);
           PingPong pingPong = new PingPong();
           ArrayList<Object> pingPongResult = pingPong.runPingPong(intUserNumber);
           System.out.println(pingPongResult);
       }
       catch (IOException e){
           e.printStackTrace();
       }
   }
}
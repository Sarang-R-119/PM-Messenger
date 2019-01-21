/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papamuro.s.messenger;

import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class PapaMuroSMessenger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Server-1/Client-2");
        Scanner s=new Scanner(System.in);
        int ss= s.nextInt();
        if(ss==1){
            Server obj= new Server();
            obj.setVisible(true);
        }
        else{
            client obj= new client();
            obj.setVisible(true);
        }
    }
    
}

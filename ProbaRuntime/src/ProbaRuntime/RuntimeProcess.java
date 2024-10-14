//Hainbat prozesu sortzea Runtime bidez, gero haietako azkena suntsitzeko

//Argudio desberdinak erabili kodea probatzeko 

package ProbaRuntime;

import java.io.IOException;

public class RuntimeProcess {

    public static void main(String[] args) {

        if (args.length <= 0) {

            System.err.println( "Exekutatzeko programa bat behar da");

            System.exit(-1);

        }

        Runtime runtime = Runtime.getRuntime();//Runtime klaseko instantzia bat lortzen du

        try {

            Process process = runtime.exec(args);

            int retorno = process.waitFor(); 

            System.out.println(args [0] +  "exekuzioak itzuli egiten du" + retorno);

            Thread.sleep(2000); //2000 milisegundoko atzerapena



             process = runtime.exec("c:/Program Files/Internet Explorer/iexplore.exe");

             int retorno2 = process.waitFor();

             System.out.println("Nabigatzailearen exekuzioak itzuli egiten du " + retorno2);

             Thread.sleep(2000);



            process=runtime.exec("cmd /c start iexplore http://google.es");

            int retorno3 = process.waitFor(); 

            System.out.println("Google-en exekuzioak itzuli egiten du " + retorno3);

           process.destroy();

        } catch (InterruptedException ex) {

            System.err.println("Ume-prozesuak oker amaitu zuen");

            System.exit(-1);

        } catch (IOException ex) {

            System.err.println("S/I salbuespena!!");

            System.exit(-1);

        }

    }

}

//Notepad .exe argumentua rabili dugu eta hau ireki odnoren InternetExplorer irekitzen zaigu
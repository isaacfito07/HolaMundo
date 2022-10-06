
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String turno="X";
        int count=1;
        String [][] arreglo = new String[3][3];
        boolean access; //Variable para entrar a la condicional de espacios ocupados
        boolean accessWin=false;//Variable para entrar a la condicon de ganador

        //Modificacion
        while(count<=9){
            access=true;
            while(access){
                System.out.println("\n\nEl turno es de '"+turno+"'");
                System.out.print("Inserte i: ");
                int i=sc.nextInt();
                System.out.print("Inserte k: ");
                int k=sc.nextInt();

                if(noOcupado(arreglo,i,k)){
                    arreglo[i][k]=turno;
                    if(ganadorX(arreglo)){
                        System.out.print("\n\n\n\n\n");
                        System.out.println("***************************** El ganador es X *****************************");
                        accessWin=true;
                    }
                    if(ganadorO(arreglo)){                        
                        System.out.print("\n\n\n\n\n");
                        System.out.println("***************************** El ganador es O *****************************");
                        accessWin=true;
                    }
                access=false;
                }else{
                    System.out.print("Espacio ocupado!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
                }
            }

            //Imprimir la tabla del gato
            System.out.println("\n");
            for(int x=0; x<=2; x++){
                for(int y=0; y<=2;y++){
                    System.out.print(arreglo[x][y]+" ");
                }
                System.out.println();
            }

            if(turno=="X"){
                turno="O";
            }else{
                turno="X";
            }

            if(count==9 && !accessWin){
                System.out.println("\nEMPATE");
            }
            if (accessWin) {
                break;
            }
            count++;
        }
        System.out.println("\nGAME OVER");
    }

    public static boolean noOcupado(String [][] arreglo,int i,int k){
        if(arreglo[i][k]==null){
            return true;
        }else{
            return false;
        }
    }

    public static boolean ganadorX(String [][] arreglo){
        if(arreglo[0][0]=="X" && arreglo[0][1]=="X" && arreglo[0][2]=="X"){
            return true;
        }
        if(arreglo[1][0]=="X" && arreglo[1][1]=="X" && arreglo[1][2]=="X"){
            return true;
        }
        if(arreglo[2][0]=="X" && arreglo[2][1]=="X" && arreglo[2][2]=="X"){
            return true;
        }
        if(arreglo[0][0]=="X" && arreglo[1][0]=="X" && arreglo[2][0]=="X"){
            return true;
        }
        if(arreglo[0][1]=="X" && arreglo[1][1]=="X" && arreglo[2][1]=="X"){
            return true;
        }
        if(arreglo[0][2]=="X" && arreglo[1][2]=="X" && arreglo[2][2]=="X"){
            return true;
        }
        if(arreglo[0][0]=="X" && arreglo[1][1]=="X" && arreglo[2][2]=="X"){
            return true;
        }
        if(arreglo[2][0]=="X" && arreglo[1][1]=="X" && arreglo[0][2]=="X"){
            return true;
        }
        return false;
    }

    public static boolean ganadorO(String [][] arreglo){
        if(arreglo[0][0]=="O" && arreglo[0][1]=="O" && arreglo[0][2]=="O"){
            return true;
        }
        if(arreglo[1][0]=="O" && arreglo[1][1]=="O" && arreglo[1][2]=="O"){
            return true;
        }
        if(arreglo[2][0]=="O" && arreglo[2][1]=="O" && arreglo[2][2]=="O"){
            return true;
        }
        if(arreglo[0][0]=="O" && arreglo[1][0]=="O" && arreglo[2][0]=="O"){
            return true;
        }
        if(arreglo[0][1]=="O" && arreglo[1][1]=="O" && arreglo[2][1]=="O"){
            return true;
        }
        if(arreglo[0][2]=="O" && arreglo[1][2]=="O" && arreglo[2][2]=="O"){
            return true;
        }
        if(arreglo[0][0]=="O" && arreglo[1][1]=="O" && arreglo[2][2]=="O"){
            return true;
        }
        if(arreglo[2][0]=="O" && arreglo[1][1]=="O" && arreglo[0][2]=="O"){
            return true;
        }
        return false;
    }
}

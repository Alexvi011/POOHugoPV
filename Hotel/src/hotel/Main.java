/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import java.util.Scanner;
import ico.fes.habitaciones.Habitacion;


/**
 *
 * @author alexv
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int i;
        int j;
        int h;
        int s=0;
        int d=0;
        int u=0;
        int k=0;
        int p=0;
        System.out.println("Bienvenido al Hotel Diamond Inn");
        System.out.println("Ingresar más reservasiones:\n1:Si\n2:No");
        i=teclado.nextInt();
        while(i!=0){System.out.println("¿Cuantas noches se quedara?:");
        j=teclado.nextInt();
        Habitacion sencilla=new Habitacion("Sencilla",(1600*j),j);
        Habitacion doble=new Habitacion("Doble",(2650*j),j);
        Habitacion suite=new Habitacion("Suite",(4890*j),j);
        Habitacion king=new Habitacion("King",(6250*j),j);
        Habitacion presidencial=new Habitacion("Presidencial",(8100*j),j);
        //**********************************************************************
        System.out.println("¿Qué habitación desea?:\n1:Sencilla "
                + "(1600 por noche,2200 todo incluido )\n"
                + "2:Doble (2650 por noche,3650 todo incluido)\n3:Suite (4890 por noche,5950 todo incluido)\n"
                + "4:King (6250 por noche, 7850 todo incluido)\n"
                + "5:Presidencial (8100 por noche,9959 todo incluido)\n6:Ninguna\n");
        System.out.println("Ingrese:");
        i=teclado.nextInt();
        switch(i){
            case 1: System.out.println("¿Desea todo incluido?"
                    + "(Aumento en cada habitacion), 1:Si, 2:No");
            h=teclado.nextInt();
            if(h==1){
                System.out.println("\n¿Desea un tipo de vista?:\n"
                        + "1:Al mar, un cargo extra de $350 por habitacion\n"
                        + "2:Al campo de golf $200 por habitacion\n"
                        +"3:No\n");
                h=teclado.nextInt();
                switch(h){
                    case 1:sencilla.setCosto((2200*j)+350);
                        break;
                    case 2:sencilla.setCosto((2200*j)+200);
                        break;
                    case 3: System.out.println(sencilla);
                       
                
            }s+=1;System.out.println(sencilla);
            System.out.println("Ingresar más reservasiones:\n1:Si\n2:No");
        i=teclado.nextInt();;
                break;
            }else{
                System.out.println("\n¿Desea un tipo de vista?:\n"
                        + "1:Al mar, un cargo extra de $350 por habitacion\n"
                        + "2:Al campo de golf $200 por habitacion\n"
                        +"3:No\n");
                h=teclado.nextInt();
                switch(h){
                    case 1:sencilla.setCosto((1600*j)+350);
                        break;
                    case 2:sencilla.setCosto((1600*j)+200);
                        break;
                    case 3:;
                    break;
                        
                }
            }s+=1;System.out.println(sencilla);
            System.out.println("Ingresar más reservasiones:\n1:Si\n2:No");
        i=teclado.nextInt();;
                break;
        //**********************************************************************    
            case 2: System.out.println("¿Desea todo incluido?"
                    +"(Aumento en cada habitacion), 1:Si , 2:No");
            h=teclado.nextInt();
            if(h==1){
                System.out.println("\n¿Desea un tipo de vista?:\n"
                        + "1:Al mar, un cargo extra de $350 por habitacion\n"
                        + "2:Al campo de golf $200 por habitacion\n"
                        +"3:No\n");
                h=teclado.nextInt();
                switch(h){
                    case 1:doble.setCosto((3650*j)+350);
                        break;
                    case 2:doble.setCosto((3650*j)+200);
                        break;
                    case 3: System.out.println(doble);
                        
                
            }d+=1;System.out.println(doble);
            System.out.println("Ingresar más reservasiones:\n1:Si\n2:No");
        i=teclado.nextInt();;
                break;
            }else{
                System.out.println("\n¿Desea un tipo de vista?:\n"
                        + "1:Al mar, un cargo extra de $350 por habitacion\n"
                        + "2:Al campo de golf $200 por habitacion\n"
                        +"3:No\n");
                h=teclado.nextInt();
                switch(h){
                    case 1:doble.setCosto((2650*j)+350);
                        break;
                    case 2:doble.setCosto((2650*j)+200);
                        break;
                    case 3:;
                    break;
                        
                }
            }d+=1;System.out.println(doble);
            System.out.println("Ingresar más reservasiones:\n1:Si\n2:No");
        i=teclado.nextInt();;
            break;
        //**********************************************************************        
            case 3:System.out.println("¿Desea todo incluido?"
                    +"(Aumento en cada habitacion), 1:Si , 2:No");
            h=teclado.nextInt();
            if(h==1){
                System.out.println("\n¿Desea un tipo de vista?:\n"
                        + "1:Al mar, un cargo extra de $350 por habitacion\n"
                        + "2:Al campo de golf $200 por habitacion\n"
                        +"3:No\n");
                h=teclado.nextInt();
                switch(h){
                    case 1:suite.setCosto((5950*j)+350);
                        break;
                    case 2:suite.setCosto((5950*j)+200);
                        break;
                    case 3: System.out.println(suite);
                        
                
            }u+=1;System.out.println(suite);
            System.out.println("Ingresar más reservasiones:\n1:Si\n2:No");
        i=teclado.nextInt();;
                break;
            }else{
                System.out.println("\n¿Desea un tipo de vista?:\n"
                        + "1:Al mar, un cargo extra de $350 por habitacion\n"
                        + "2:Al campo de golf $200 por habitacion\n"
                        +"3:No\n");
                h=teclado.nextInt();
                switch(h){
                    case 1:suite.setCosto((4890*j)+350);
                        break;
                    case 2:suite.setCosto((4890*j)+200);
                        break;
                    case 3:;
                    break;
                        
                }
            }u+=1;System.out.println(suite);
            System.out.println("Ingresar más reservasiones:\n1:Si\n2:No");
        i=teclado.nextInt();; 
                break;
        //**********************************************************************        
            case 4:System.out.println("¿Desea todo incluido?"
                    +"(Aumento en cada habitacion), 1:Si , 2:No");
            h=teclado.nextInt();
            if(h==1){
                System.out.println("\n¿Desea un tipo de vista?:\n"
                        + "1:Al mar, un cargo extra de $350 por habitacion\n"
                        + "2:Al campo de golf $200 por habitacion\n"
                        +"3:No\n");
                h=teclado.nextInt();
                switch(h){
                    case 1:king.setCosto((7850*j)+350);
                        break;
                    case 2:king.setCosto((7850*j)+200);
                        break;
                    case 3: System.out.println(king);
                        
                
            }k+=1; System.out.println(king);
            System.out.println("Ingresar más reservasiones:\n1:Si\n2:No");
        i=teclado.nextInt();;
                break;
            }else{
                System.out.println("\n¿Desea un tipo de vista?:\n"
                        + "1:Al mar, un cargo extra de $350 por habitacion\n"
                        + "2:Al campo de golf $200 por habitacion\n"
                        +"3:No\n");
                h=teclado.nextInt();
                switch(h){
                    case 1:king.setCosto((6250*j)+350);
                        break;
                    case 2:king.setCosto((6250*j)+200);
                        break;
                    case 3:;
                    break;
                        
                }
            }k+=1;System.out.println(king);
            System.out.println("Ingresar más reservasiones:\n1:Si\n2:No");
        i=teclado.nextInt();; 
                break;
        //**********************************************************************        
            case 5:System.out.println("¿Desea todo incluido?"
                    +"(Aumento en cada habitacion), 1:Si , 2:No");
            h=teclado.nextInt();
            if(h==1){
                System.out.println("\n¿Desea un tipo de vista?:\n"
                        + "1:Al mar, un cargo extra de $350 por habitacion\n"
                        + "2:Al campo de golf $200 por habitacion\n"
                        +"3:No\n");
                h=teclado.nextInt();
                switch(h){
                    case 1:presidencial.setCosto((9950*j)+350);
                        break;
                    case 2:presidencial.setCosto((9950*j)+200);
                        break;
                    case 3: System.out.println(presidencial);
                        
                
            }p+=1;System.out.println(presidencial);
            System.out.println("Ingresar más reservasiones:\n1:Si\n2:No");
        i=teclado.nextInt();;
                break;
            }else{
                System.out.println("\n¿Desea un tipo de vista?:\n"
                        + "1:Al mar, un cargo extra de $350 por habitacion\n"
                        + "2:Al campo de golf $200 por habitacion\n"
                        +"3:No\n");
                h=teclado.nextInt();
                switch(h){
                    case 1:presidencial.setCosto((8100*j)+350);
                        break;
                    case 2:presidencial.setCosto((8100*j)+200);
                        break;
                    case 3:;
                    break;
                        
                }
            }p+=1;System.out.println(presidencial);
            System.out.println("Ingresar más reservasiones:\n1:Si\n2:No");
        i=teclado.nextInt();; 
                break;
        //**********************************************************************
            case 6: System.out.println("Hasta la proxima!!!");
            System.out.println("Ingresar más reservasiones:\n1:Si\n2:No");
        i=teclado.nextInt();
                break;
            
            
            
            
        }}
        System.out.println("Hasta la proxima!!!");
        System.out.println("¿Quieres ver cuantas reservaciones "
                + "se hicieron el dia de hoy? 1:Si,2:No");
        i=teclado.nextInt();
        if(i==1){
            System.out.println("Habitaciones sencillas:"+s);
            System.out.println("Habitaciones dobles:"+d);
            System.out.println("Habitaciones suite:"+u);
            System.out.println("Habitaciones king:"+k);
            System.out.println("Habitaciones presidencia:"+p);
            }else{
            System.out.println("Bye");
        }
        
        
        
        
        

    }
    
}

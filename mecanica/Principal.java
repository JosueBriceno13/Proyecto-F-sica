package mecanica;

import java.util.Scanner;

public class Principal {
MecanicaMetodos bandera=new MecanicaMetodos();

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Principal proyectil=new Principal();
        int opcion1,opcion;
        double Vo,tiempo,angulo;
        System.out.println("Simulacion Lanzamiento de Proyectiles");
            do{
              System.out.println("======Opciones======");
              System.out.println("1. Lanzamiento Horizontal.");
              System.out.println("2. Lanzamiento Inclinado.");
              System.out.println("3. Salir.");
              opcion1=leer.nextInt();
              switch(opcion1){
                 case 1:
                 System.out.println("Ingrese la velocidad inicial.");
                 Vo=leer.nextDouble();
                 System.out.println("Ingrese el tiempo.");
                 tiempo=leer.nextDouble();
                 MecanicaMetodos Horizontal=new MecanicaMetodos(Vo,tiempo);
                 proyectil.LanzamientoH(Horizontal);
                 break;
                 case 2:
                 System.out.println("Ingrese la velocidad inicial.");
                 Vo=leer.nextDouble();
                 System.out.println("Ingrese el tiempo.");
                 tiempo=leer.nextDouble();
                 System.out.println("Ingrese el angulo.");
                 angulo=leer.nextDouble();
                 MecanicaMetodos Invertido=new MecanicaMetodos(Vo,tiempo,angulo);
                 proyectil.Inclinado(Invertido);
                 break;
                 case 3:
                 System.out.println("=====================");
                 System.out.println("Fin Programa.");
                 default:
                 System.out.println("=====================");
                 System.out.println("Ha elegido una opcion invalida.");
                 System.out.println("=====================");
                 System.out.println("Por favor elija una opción.");
                 break;
               }
            }
       while(opcion1!=3);
    }
    public void LanzamientoH (MecanicaMetodos Horizontal){
        Scanner leer=new Scanner(System.in);
        int sw,opcion;
        do{
            System.out.println("=====================");
            System.out.println("1. Velocidad.");
            System.out.println("2. Desplazamiento.");
            System.out.println("3. Altura(Posición) en funcion del tiempo.");
            System.out.println("4. Tiempo de Vuelo.");
            System.out.println("5. Direccion(Desplazamiento).");
            System.out.println("6. Salir.");
            sw=leer.nextInt();
            if(sw==1){
                do{
                    System.out.println("=====================");
                    System.out.println("1. Componente Horizontal");
                    System.out.println("2. componente Vertical.");
                    System.out.println("3. Magnitud de la Velocidad.");
                    System.out.println("4. Direccion de la Velocidad.");
                    System.out.println("5. Salir.");
                    opcion=leer.nextInt();
                    switch(opcion){
                        case 1:
                        bandera.coH(Horizontal);
                        break;
                        case 2:
                        bandera.coV(Horizontal);
                        break;
                        case 3:
                        bandera.MgV(Horizontal);
                        break;
                        case 4:
                        bandera.DiV(Horizontal);
                        break;
                        case 5:
                        System.out.println(" ");
                        System.out.println("Fin calculo velocidades.");
                        break;
                        default:
                        System.out.println("OPCIÓN INVALIDA");
                        System.out.println("");
                        break;
                    }
                   }while(opcion!=5);
               }
            if(sw==2){
                do{
                    System.out.println("=====================");
                System.out.println("1. Horizontal");
                System.out.println("2. Vertical.");
                System.out.println("3. Desplazamiento Total.");
                System.out.println("4. Alcance.");
                System.out.println("5. Salir.");
                opcion=leer.nextInt();
                 switch(opcion){
                    case 1:
                    bandera.horizontal(Horizontal);
                    break;
                    case 2:
                    bandera.vertical(Horizontal);
                    break;
                    case 3:
                    bandera.DesplazamientoTotal(Horizontal);
                    break;
                    case 4:
                    bandera.Alcance(Horizontal);
                    break;
                    case 5:
                    System.out.println(" ");
                    System.out.println("Fin calculo Desplazamientos.");
                    break;
                    default:
                    System.out.println("Error, a elejido una opcion invalida");
                    System.out.println("");
                    break;
                 }
                }while(opcion!=5);
            }
            if(sw==3){
                bandera.AlturaTiempo(Horizontal);
            }
            if(sw==4){
                bandera.TiempoVuelo(Horizontal);
            }
            if(sw==5){
                bandera.direccion(Horizontal);
            }
            if(sw==6){
                System.out.println("Fin del ejercicio.");
            }
        }
        while(sw!=6);        
    }
    public void Inclinado (MecanicaMetodos Invertido){
        Scanner leer=new Scanner(System.in);
        int sw=0,st=0;
        do{
            System.out.println("=====================");
            System.out.println("1. Velocidad en el lanzamiento.");
            System.out.println("2. Velocidad en funcion del tiempo.");
            System.out.println("3. Desplazamiento.");
            System.out.println("4. Tiempo.");
            System.out.println("5. Salir.");
            System.out.print("-");
            sw=leer.nextInt();
            if(sw==1){
                do{
                    System.out.println("=====================");
                    System.out.println("1. Componente Horizontal");
                    System.out.println("2. componente Vertical.");
                    System.out.println("3. Salir.");
                    st=leer.nextInt();
                    switch(st){
                        case 1:
                        bandera.coHori(Invertido);
                        break;
                        case 2:
                        bandera.coVert(Invertido);
                        break;
                        case 3:
                        System.out.println(" ");
                        System.out.println("Fin calculo velocidades.");
                        break;
                        default:
                        System.out.println("OPCIÓN INVALIDA");
                        System.out.println("");
                            break;
                    }
                   }while(st!=3);
               }
            if(sw==2){
                do{
                    System.out.println("=====================");
                    System.out.println("1. Horizontal");
                    System.out.println("2. Vertical.");
                    System.out.println("3. Magnitud de Velocidad.");
                    System.out.println("4. Direccion de la velocidad.");
                    System.out.println("5. Salir.");
                    System.out.print("- ");
                    st=leer.nextInt();
                    switch(st){
                        case 1:
                        bandera.HoriTiempo(Invertido);
                        break;
                        case 2:
                        bandera.VertTiempo(Invertido);
                        break;
                        case 3:
                        bandera.MagniV(Invertido);
                        break;
                        case 4:
                        bandera.DireVel(Invertido);
                        break;
                        case 5:
                        System.out.println("Fin velocidade en funcion de tiempo");
                        break;
                        default:
                            break;
                    }
                }while(st!=5);
            }   
            if(sw==3){
                do{
                    System.out.println("=====================");
                    System.out.println("1. Horizontal");
                    System.out.println("2. Vertical.");
                    System.out.println("3. Alcance Maximo.");
                    System.out.println("4. Altura Maxima.");
                    System.out.println("5. Salir.");
                    st=leer.nextInt();
                    switch(st){
                        case 1:
                        bandera.Desplazamientohorizontal(Invertido);
                        break;
                        case 2:
                        bandera.DesplazamientoVertical(Invertido);
                        break;
                        case 3:
                        bandera.AlcanceMaximo(Invertido);
                        break;
                        case 4:
                        bandera.AlturaMaximo(Invertido);
                        break;
                        case 5:
                        System.out.println("=====================");
                        System.out.println("Fin Desplazamientos.");
                        break;
                        default:
                        break;
                    }
                }while(st!=5);
            }
            if(sw==4){
                do{
                    System.out.println("=====================");
                    System.out.println("1. Tiempo Maximo");
                    System.out.println("2. Tiempo De Vuelo.");
                    System.out.println("3. Salir.");
                    st=leer.nextInt();
                    switch(st){
                        case 1:
                        bandera.tiempoMaximo(Invertido);
                        break;
                        case 2:
                        bandera.tiempoVuelo(Invertido);
                        break;
                        case 3:
                        System.out.println("Fin de la velocidad en funcion de tiempo");
                        break;
                        default:
                        System.out.println("Fin Calculo de tiempo.");
                        break;
                    }
                }while(st!=3);
            }
            if(sw==5){
                System.out.println("Fin de la simulacion de lanzamiento de dos proyectiles");
            }
        }
        while(sw!=5);        
    }
}




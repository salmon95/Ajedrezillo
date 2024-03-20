

package com.mycompany.ajedrezillo;
import java.util.Scanner;

public class Ajedrezillo {
    
    public static void peon(){
        int x2;
        int y2;

        System.out.println("Digite la fila de reposicionamiento");
        x2=lee.nextInt();
        System.out.println("Digite la columna de reposicionamiento");
        y2=lee.nextInt();
        if(y2==y){
            if (tablero[x2][y2]==0){
                if (x==6){
                    if(x2+1==x){
                        tablero[x2][y2]=1;
                        tablero[x][y]=0;
                    }
                    else{
                        if(x2+2==x){
                            if(tablero[x2+1][y2]==0){
                                tablero[x2][y2]=1;
                                tablero[x][y]=0; 
                            }
                            else
                                System.out.println("Camino bloqueado");
                        }
                        else{
                            System.out.println("Movimiento imposible");
                        }
                    }
                }
                else{
                    if(x<6){
                        if(x2+1==x){
                            tablero[x2][y2]=1;
                            tablero[x][y]=0;
                        } 
                        else{
                            System.out.println("Movimiento imposible");
                        }
                    }
                }
            }
            else
                System.out.println("Casilla ocupada");
        }
        else
            System.out.println("Movimiento imposible");
    }
    public static void torre(){
        int x2;
        int y2;

        System.out.println("Digite fila de reposicionamiento");
        x2=lee.nextInt();
        if (x2<=7 && x2>=0){
        System.out.println("Digite la columna de reposicionamiento");
        y2=lee.nextInt();
        if (y2<=7 && y2>=0){
            if (tablero[x2][y2]==0){
                if(x2<x && y2==y){
                    for(int r=x2;r<=x;r++){
                        if(tablero[r][y]!=0 && tablero[r][y]!=tablero[x][y]){
                            System.out.println("Obstaculo en el camino");
                            break;
                        }
                        else{
                            if(r==x){
                                tablero[x2][y2]=2;
                                tablero[x][y]=0; 
                            }
                        }
                    }
                }
                else{
                    if(x2>x && y2==y){
                        for(int r=x2;r>=x;r--){
                            if(tablero[r][y]!=0 && tablero[r][y]!=tablero[x][y]){
                                System.out.println("Obstáculo en el camino");
                                break;
                            }
                            else{
                                if(r==x){
                                    tablero[x2][y2]=2;
                                    tablero[x][y]=0;
                                }
                            }
                        }
                                        
                    }
                    else{
                        if(x2==x && y2>y){
                            for(int r=y2;r>=y;r--){
                                if(tablero[x][r]!=0 && tablero[x][r]!=tablero[x][y]){
                                    System.out.println("Obtaculo en el camino");
                                    break;
                                }  
                                else{
                                    if(r==y){
                                        tablero[x2][y2]=2;
                                        tablero[x][x]=0;
                                    }
                                }
                            }
                        }
                        else{
                            if(x2==x && y2<y){
                                for(int r=y2;r<=y;r++){
                                    if(tablero[x][r]!=0 && tablero[x][r]!=tablero[x][y]){
                                        System.out.println("obtaculo en el camino");
                                        break;
                                    }
                                    else{
                                        if(r==y){
                                            tablero[x2][y2]=2;
                                            tablero[x][y]=0;
                                        }
                                    }
                                }
                            }
                            else
                                System.out.println("Movimiento impropio de la torre");
                        }
                    }
                }
            }
            else 
                System.out.println("Casilla ocupada");
        }
        else
            System.out.println("Casilla fuera de los límites");
    }
    else
        System.out.println("Casilla fuera de los límites");

    }
    
    public static void caballo(){
        int x2;
        int y2;
        System.out.println("Digite la fila de reposicionamiento");
        x2=lee.nextInt();
        if (x2<=7 && x2>=0){
            System.out.println("Digite la columna de reposicionamiento");
            y2=lee.nextInt();
            if (y2<=7 && y2>=0){
                if (tablero[x2][y2]==0){
                    //EN VERTICAL
                    if(x2+2==x||x2-2==x){//movimiento sube/baja dos pasos
                        if(y2+1==y){//gira 1 a izquierda
                            tablero[x2][y2]=3;
                            tablero[x][y]=0;

                        }
                        else{
                            if(y2-1==y){//gira 1 a la derecha
                                tablero[x2][y2]=3;
                                tablero[x][y]=0;
                            }
                            else
                                System.out.println("Movimiento imposible");
                        }
                    }
                    else{
                        if(x2+1==x||x2-1==x){//sube/baja uno arriba
                            if(y2+2==y){//gira 2 a la izquierda
                                tablero[x2][y2]=3;
                                tablero[x][y]=0;
                            }
                            else{
                                if(y2-2==y){//dira 2 a la derecha
                                    tablero[x2][y2]=3;
                                    tablero[x][y]=0;
                                }
                                else
                                    System.out.println("Movimiento imposible");
                            }
                        }
                        else{
                            //EN HORIZONTAL
                            if(y2-2==y||y2+2==y){//va dos a la derecha/izquierda
                                if(x2-1==x){//bajo 1 casilla
                                    tablero[x2][y2]=3;
                                    tablero[x][y]=0;
                                }
                                else{
                                    if(x2+1==x){//subio 1 casilla
                                        tablero[x2][y2]=3;
                                        tablero[x][y]=0;
                                    }
                                    else
                                        System.out.println("Movimiento imposible");
                                }
                            }
                            else{
                                if(y2-1==y||y2+1==y){//va uno a la derecha/izquierda
                                    if(x2-2==x){//bajo dos casillas
                                        tablero[x2][y2]=3;
                                        tablero[x][y]=0;
                                    }
                                    else{
                                        if(x2+2==x){//subio dos casillas
                                            tablero[x2][y2]=3;
                                            tablero[x][y]=0;
                                        }
                                        else
                                            System.out.println("Movimiento imposible");
                                    }
                                }
                                else
                                    System.out.println("Movimiento imposible");
                            }
                        }
                    }
                }
                else
                    System.out.println("Casilla ocupada");
            }
            else
                System.out.println("Casilla fuera de los límites");
        }
        else
            System.out.println("Casilla fuera de los límites");
    } 
    
    public static void alfil(){
        int x2;
        int y2;
        System.out.println("Digite la fila de reposicionamiento");
        x2=lee.nextInt();
        if (x2<=7 && x2>=0){
            System.out.println("Digite la columna de reposicionamiento");
            y2=lee.nextInt();
            if (y2<=7 && y2>=0){
                if (tablero[x2][y2]==0){
                    
                }
                else
                    System.out.println("Casilla ocupada");
            }
            else
                System.out.println("Casilla fuera de los límites");
        }
        else
            System.out.println("Casilla fuera de los límites");
    
    }
    
    public static void rey(){
        int x2;
        int y2;
        System.out.println("Digite la fila de reposicionamiento");
        x2=lee.nextInt();
        if (x2<=7 && x2>=0){
            System.out.println("Digite la columna de reposicionamiento");
            y2=lee.nextInt();
            if (y2<=7 && y2>=0){
                if (tablero[x2][y2]==0){
                    if(x2-1==x||x2+1==x||x2==x){
                        if(y2-1==x||y2+1==x||y2==y){
                            tablero[x2][y2]=5;
                            tablero[x][y]=0;
                        }
                        else
                            System.out.println("Movimiento imposible");
                    }
                    else
                        System.out.println("Movimiento imposible");
                }
                else
                    System.out.println("Casilla ocupada");
            }
            else
                System.out.println("Casilla fuera de los límites");
        }
        else
            System.out.println("Casilla fuera de los límites");
    }
    
    public static void reina(){
    
    } 
    
    static Scanner lee=new Scanner(System.in);
    
    static int [][] tablero=new int [8][8];
    
    static void imprimir(){
        for(int f=0;f<8;f++){
            for (int c=0;c<8;c++){
                System.out.print(" | ");System.out.print (tablero[f][c]); System.out.print(" | ");
            }
            System.out.println();
        }
    }
    
    static int x;
    static int y;
    
    public static void main(String[] args) {
        tablero[7][0]=2;//torre
        tablero[7][7]=2;
        tablero[7][1]=3;//caballo
        tablero[7][6]=3;
        tablero[7][2]=4;//alfil
        tablero[7][5]=4;
        tablero[7][4]=5;//rey
        tablero[7][3]=6;//reina
        tablero[6][0]=1;//peon
        tablero[6][1]=1;
        tablero[6][2]=1;
        tablero[6][3]=1;
        tablero[6][4]=1;
        tablero[6][5]=1;
        tablero[6][6]=1;
        tablero[6][7]=1;
        imprimir();
        do{
            System.out.println("Seleccione la pieza o digite 9 en la fila para salir");
            System.out.println("Digite la fila");
            x=lee.nextInt();
            if (x==9){
                break;
            }
            System.out.println("Digite la columna");
            y=lee.nextInt();
            switch(tablero[x][y]){
                case 0:
                    System.out.println("No se halló ninguna pieza");
                    break;
                case 1:
                    System.out.println("Peón.");
                    peon();
                    imprimir();
                    break;
                case 2:
                    System.out.println("Torre");
                    torre();
                    imprimir();
                    break;
                case 3:
                    System.out.println("Caballo");
                    caballo();
                    imprimir();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Rey");
                    rey();
                    imprimir();
                    break;
                case 6:
                    break;                    
            }
        }while(true);
    }
}

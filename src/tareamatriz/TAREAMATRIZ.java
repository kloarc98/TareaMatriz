/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamatriz;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * Kevin Oswaldo Loarca Fuentes
 */
public class TAREAMATRIZ {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            
            //Declara el scanner
		Scanner entrada = new Scanner (System.in);
		//Declara las variables para departamento
		int Departamento[];
		Departamento = new int[5];
		//Declara el tamañano de la matriz
		String Matriz[][];
		Matriz=new String[10][7];
		
                //Declaramos todas las varibles necesarias
		String descuentos,bonificaciones,sueldoLiquido,departamento,sueldoBase,isrver;
		int opcion, des,boni,suelLiq=0,dep=0,sB,total;
		int isr1= (int) 0.03;
		int isr2= (int) 0.05;
		int isr3= (int) 0.10;
                float resp = 0;
                
                //ingresos hacia la matriz
		do {
			for(int i=0;i<10;i++) {
				//Ingreso de nombre
                                Matriz[i][0]=JOptionPane.showInputDialog(null,"Ingrese el nombre:"+(i+1));
				//Se utiliza ramdom para que salga el sueldo base
				sB=(int)(2500+(Math.random()*30000));
				sueldoBase=Integer.toString(sB);
				Matriz[i][1]=sueldoBase;
				//Se utiliza ramdom para que salga los descuentos
				des=(int)(1+(Math.random())*2500);
				descuentos=Integer.toString(des);
				Matriz[i][2]=descuentos;
				//Se utiliza ramdom para que salga las bonificaciones
				boni=(int) (1+(Math.random())*2500);
				bonificaciones=Integer.toString(boni);
				Matriz[i][3]=bonificaciones;
				//Se usa un if para saber que porcentaje de isr usara 
                                if(sB>2600 && sB<5000){
                                    resp = (float) isr1 * sB;
                                    isrver = Integer.toString((int) (float) resp);
                                    Matriz[i][4]=isrver;
                                }else if(sB>5001 && sB<10000){
                                    resp = (float) isr1 * sB;
                                    isrver = Integer.toString((int) (float) resp);
                                Matriz[i][4]=isrver;
                                }else if (sB>10001 && sB<100000){
                                    resp = (float) isr1 * sB;
                                    isrver = Integer.toString((int) (float) resp);
                                    Matriz[i][4]=isrver;
                                }
                                isrver = Integer.toString((int) resp);
                                Matriz[i][4]=isrver;
				//Se suma el sueldo y la bonificacion menos descuentos e isr
				suelLiq=(int) (sB-des+boni-resp);
				sueldoLiquido=Integer.toString(suelLiq);
				Matriz[i][5]=sueldoLiquido;
				//
				dep=(int)(1+(Math.random()*5));
				departamento=Integer.toString(dep);
				Matriz[i][6]=departamento;
				
			}
                        
                        
			
			System.out.println("Nombres\t  Sueldo Base\tDescuentos\tBonificacion\tISR\tSueldo Liquido\tNo Departamento");
			for(int j=0;j<10;j++) {
				System.out.println(""+Matriz[j][0]+"\t\t"+Matriz[j][1]+"\t"+Matriz[j][2]+"\t\t"+Matriz[j][3]+"\t\t"+Matriz[j][4]+"\t\t"+Matriz[j][5]+"\t\t"+Matriz[j][6]+"");
			
			}
			
			   
			     
			     
			      for(int i = 0; i<10;i++)
			      { 
			    	  total = Integer.parseInt(Matriz[i][5]);
			      if(Matriz[i][6].equals("1"))
			      {
			    	  Departamento[0] = Departamento[0] + total;
			      }
			      if(Matriz[i][6].equals("2"))
			      {
			    	  Departamento[1] = Departamento[1] + total;
			      }
			       if(Matriz[i][6].equals("3"))
			      {
			    	   Departamento[2] = Departamento[2] + total;
			      }
			      if(Matriz[i][6].equals("4"))
			      {
			    	  Departamento[3] = Departamento[3] + total;
			      }
			      if(Matriz[i][6].equals("5"))
			      {
			    	  Departamento[4] = Departamento[4] + total;
			      }
			     
			      }
                              
                              System.out.println("");
			       for(int i = 0;i<=4;i++)
			       {
			           System.out.println("Departamento "+(i+1)+": "+Departamento[i]);
			       }
			 System.out.println("");
			System.out.print("Desea Ingresar todo de nuevo?\n 1.si\n 2.Salir\n");
			opcion=entrada.nextInt();
		}while(opcion!=2);
		
		
		
		
	}
    }
    



public class Calculator {
	
	   private int result=0;
	   private int nombre_clicke=0;
	   private int operation=0;
	   
       public Calculator(){
    	   this.operation=0;
       }
       
       public int getResultat(){
    	   return this.result;
       }
       public void click(int nombre_en_parametre){
    	   this.nombre_clicke=this.nombre_clicke*10+nombre_en_parametre;
    	   
    	   if(this.operation==0)
    		   this.result=this.nombre_clicke+this.result;
    	   if(this.operation==1)
    		   this.result=this.result-this.nombre_clicke;
       }
       public void clickPlus(){
    	   this.operation=0;
    	   //this.result=this.nombre_clicke;
    	   this.nombre_clicke=0;
       }
       public void clickMoins(){
    	   this.operation=1;
    	   //this.result=this.nombre_clicke;
    	   this.nombre_clicke=0;
       }
}

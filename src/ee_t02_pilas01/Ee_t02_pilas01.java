
package ee_t02_pilas01;

/**
 *
 * @author Zuleyka Guzman
 */
public class Ee_t02_pilas01
{
    char pila[];
    Integer tope, tam;
    char res1,res2;
    boolean ban;
    
    public Ee_t02_pilas01(){
        tope=-1;
    }
    
    public void push(char c){//c=caracter
        if(tope<tam-1){
            tope++;
            pila[tope]=c;
        }
    }
    
    public char pop(){
        if(tope>-1){
            res1=pila[tope];
            pila[tope]=' ';
            tope--;
        }
        return res1; 
    }
    
    public char peek(){
        if(tope>-1){
            res2=pila[tope];
        }
        return res2; 
    }
    
    public void verificar(String cadena){
      
        if((cadena.length()%2)==0){
            tam=(cadena.length()/2);
            pila = new char[tam];
            
            char arreglo[] = cadena.toCharArray();
            
            for(int i=0; i<arreglo.length; i++){
                if((arreglo[i]=='(') || (arreglo[i]=='[') || (arreglo[i]=='{')){
                    char car=arreglo[i];
                    push(car);
                }
                else{
                    
                    if(peek()=='('){
                        if(arreglo[i]==')'){
                            ban=true;
                            pop();
                        }
                        else{
                            ban=false;    
                        }
                    }
                    else{
                        if(peek()=='['){
                            if(arreglo[i]==']'){
                                ban=true;
                                pop();  
                            }
                            else{
                                ban=false;
                            }
                        }
                        else{
                            if(peek()=='{'){
                                if(arreglo[i]=='}'){
                                    ban=true;
                                    pop();  
                                }
                                else{
                                    ban=false;  
                                }
                            }
                        }
                    }    
                        
                }
            }

        }
        else{
            System.out.println("NO");
        }
      
        if(ban==false){
            System.out.println("NO");
        }
        else{
            System.out.println("SI");
        }
        
    }
}

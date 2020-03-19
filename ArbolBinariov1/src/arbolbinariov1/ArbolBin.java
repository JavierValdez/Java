package arbolbinariov1;
public class ArbolBin {
    Nodo raiz;
    public ArbolBin(){
        this.raiz=null;
    }
    public void Ingreso(int dat,String n){
        
        Nodo a = new Nodo(dat,n);
        if(this.raiz==null){
        this.raiz=a;
        }else{
            Nodo t=raiz;
            Nodo t1;
            boolean flag=true;
            while(flag){
                if(a.dato>raiz.dato){
                    if(raiz.HijoDerecho==null){
                        raiz.HijoDerecho=a;
                        flag=false;
                    }else{
                        raiz=raiz.HijoDerecho;    
                    }
                }else{
                    if(raiz.HijoIzquierdo==null){
                        raiz.HijoIzquierdo=a;
                        flag=false;
                    }else{
                        raiz=raiz.HijoIzquierdo;
                        
                    }
                }
            }
            raiz=t;
            
        }
    }
    
}

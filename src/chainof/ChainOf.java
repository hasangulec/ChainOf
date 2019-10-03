
package chainof;

public class ChainOf {

    public static void main(String[] args) {
        handler h = new hasan();
        handler y =new yasar();
        handler o=new oguz();
        
       /*
       
         y.setSonraki(h);
        h.setSonraki(o);
        */
       //Zincir oluşturma
        h.sonraki=y;
        y.sonraki=o;
        
        //Zincirde geri gitme yok.
        //her zaman ilk halkaya göndermek mantıklıdır.
        h.play("hasan");
        h.play("yasar");
        h.play("oguz");
        h.play("acilamaz");
        h.play("hasan");
        y.play("hasan");
        o.play("yasar");
       
    }
    
}
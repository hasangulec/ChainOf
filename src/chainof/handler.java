package chainof;
public abstract class handler {
handler sonraki;
public  void setSonraki(handler sonraki){
this.sonraki=sonraki;
}
public abstract void play(String yol);
}
class hasan extends handler{
public  void play(String yol){
if(yol=="hasan")
 System.out.println("Hasan");
else {
    if(sonraki!=null)
        sonraki.play(yol);
}
}
}
class yasar extends handler{
public  void play(String yol){
if(yol=="yasar")
 System.out.println("Yasar");
else {
    if(sonraki!=null)
        sonraki.play(yol);
}
}
}
class oguz extends handler{
public  void play(String yol){
if(yol=="oguz")
 System.out.println("Oguz");
else {
    if(sonraki!=null)
        sonraki.play(yol);
    else 
        System.out.println("Açılamadı");
}
}
}
public class Draw {
    public void singleLine(){
        System.out.println("-------------------------------------------------");
    }
    public void doubleLine(){
        System.out.println("=================================================");
    }
    public void doubleLine(String msg){
        doubleLine();
        System.out.println(msg);
        doubleLine();
    }
}

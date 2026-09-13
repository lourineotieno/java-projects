public class Shape2D implements Drawable,Resizable{
    @Override
    public void draw(){
        System.out.println("a rectangle is drawn");
    }
    @Override
    public void resize(int percent){
        System.out.println("It covers" + percent  + "% of the area");

    }
    
}

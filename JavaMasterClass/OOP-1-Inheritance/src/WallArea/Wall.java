package WallArea;

public class Wall {
    double width, height;

    public Wall(){

    }

    public Wall(double width, double height){
        if(width <= 0 ) {
            this.width = 0;
        }else{
            this.width = width;
        }

        if(height <= 0 ) {
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        double area = this.height * this.width;
        return area;
    }

}

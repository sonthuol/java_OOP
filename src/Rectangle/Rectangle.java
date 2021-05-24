package Rectangle;

public class Rectangle {
    private float lenght;
    private float width;

    public Rectangle(){
    }

    public Rectangle(float lenght, float width){
        this.lenght = lenght;
        this.width = width;
    }

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                '}';
    }

    public float area(){
        float area = 0;
        area = lenght*width;
        return area;
    }

    public float circumference(){
        float circumference = 0;
        circumference = (width+lenght)*2;
        return  circumference;
    }
}

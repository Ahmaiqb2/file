package fileOpgaver;

public class Lommeregner {

    //metode acceoterer kun positive heltal
    public int add(int num1, int num2){
        if (num1 <= 0 || num2 <= 0){
            throw new IllegalArgumentException("Kun positive heltal");
        }
        return num1 + num2;
    }
}

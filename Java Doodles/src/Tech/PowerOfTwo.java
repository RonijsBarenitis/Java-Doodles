package Tech;

//Given an integer, write a function to determine if it is a power of two.
public class PowerOfTwo {

    public void powerOfTwo(){

        int num = 16;
        boolean isPower = false;

        int i = 1;
        while(i < num) {
            //i = i*2;
            i <<= 1; //Shift i by 1 bit to the left, equivalent to multiplying by two
        }

        if(i == num) {
            isPower = true;
            System.out.println("Is " + num + " is a power of 2? " + isPower);
        }else{
            System.out.println(num +" is not a power of 2. isPower = " +isPower);
        }
    }
}

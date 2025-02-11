
public class All {
    public static void main(String[] args) {
        // Decimal Literal :
        int x = 20;
        int y = 123;
        int z = 234;

        // Octal Literal :
        // int a = 018; //Invalid becuase it contains digit 8 which is out of range
        int b = 0777; // Valid
        int c = 0123; // Valid

        // Hexadecimal Literal :
        int x1 = 0X12; // Valid
        int y1 = 0xadd; // Valid
        int z1 = 0Xface; // valid
        // int a = 0Xage; //Inavlid because character 'g' out of range

        // Binary Literal :
        int x2 = 0B101; // valid
        int y2 = 0b111; // Valid
        // int z2 = 0B112; //Invalid [2 is out of range]

        System.out.println(x+","+y+","+z+","+b+","+c+","+x1+","+y1+","+z1+","+x2+","+y2);
        
    }
}

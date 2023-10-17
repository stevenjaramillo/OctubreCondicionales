public class CondicionalSwitch {
    public static void main(String[] args) {
        char estadoCivil = 'c';
        switch (estadoCivil){
            case 'C' , 'c':
                System.out.println("Casado");
                break;
            case 'S':
                System.out.println("Soltero");
                break;
            case 'D':
                System.out.println("Divorciado");
                break;
            case 'V':
                System.out.println("Viudo");
                break;
            default:
                System.out.println("El valor es invalido");
        }
    }
}

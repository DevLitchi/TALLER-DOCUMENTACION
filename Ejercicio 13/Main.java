import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String op;
        int num, qty;
        int opc;

        Tree nums = new Tree();
        do {
            MN();
            op = read.nextLine();
            opc = Integer.parseInt(op);
            switch (opc) {
                case 1:
                    nums.CD();
                    System.out.println("Insertar");
                    num = Integer.parseInt(read.nextLine());
                    nums.I(num);
                    break;
                case 2:
                    nums.CD();
                    if (nums.ILE()) {
                        System.out.println("El arbol esta vacio");
                        Tree.Pausa();
                        nums.CD();
                        break;
                    } else {
                        System.out.println("\nMostrar preorden");
                        nums.MT(nums.Root);
                        System.out.println("\nMostrar preorden invertido");
                        nums.preordeninvertido(nums.Root);
                        System.out.println("\n");
                        Tree.Pausa();
                        nums.CD();

                    }
                    break;
                case 3:
                    nums.CD();
                    if (nums.ILE()) {
                        nums.CD();
                        System.out.println("El arbol esta vacio");
                        Tree.Pausa();
                        nums.CD();
                        break;
                    } else {
                        nums.CD();
                        System.out.println("\nMostrar inorden");
                        nums.Stio(nums.Root);
                        System.out.println("Mostrar inorden invertido\n");
                        nums.inordeninvertido(nums.Root);
                        Tree.Pausa();
                        nums.CD();
                    }
                    break;
                case 4:
                    nums.CD();
                    if (nums.ILE()) {
                        nums.CD();
                        System.out.println("El arbol esta vacio");
                        Tree.Pausa();
                        nums.CD();
                        break;
                    } else {
                        nums.CD();
                        System.out.println("\nMostrar postorden");
                        nums.Stpo(nums.Root);
                        System.out.println("Mostrar postorden invertido\n");
                        nums.postordeninvertido(nums.Root);
                        Tree.Pausa();
                        nums.CD();
                    }
                    break;
                case 5:
                    nums.CD();
                    System.out.println("Borrar Elemento");
                    if (nums.ILE()) {
                        System.out.println("El arbol esta vacio");
                        Tree.Pausa();
                        nums.CD();
                        break;
                    } else {
                        num = Integer.parseInt(read.nextLine());
                        nums.DE(num);
                        Tree.Pausa();
                        nums.CD();
                    }
                    break;
                case 6:
                    System.out.println("Eliminar Arbol");
                    nums.DT();
                    break;
                case 7:
                    nums.CD();
                    if (nums.ILE()) {
                        nums.CD();
                        System.out.println("El arbol esta vacio");
                        Tree.Pausa();
                        nums.CD();
                        break;
                    } else {
                        nums.CD();
                        System.out.println("Inserta el elemento a buscar");
                        num = Integer.parseInt(read.nextLine());
                        nums.BE(num);
                        Tree.Pausa();
                        nums.CD();
                    }
                    break;
                case 8:
                    nums.CD();
                    System.out.println("Contar niveles");
                    if (nums.ILE()) {
                        System.out.println("El arbol esta vacio");
                        Tree.Pausa();
                        nums.CD();
                        break;
                    } else {
                        System.out.println("Niveles: " + nums.CN(nums.Root));
                        Tree.Pausa();
                        nums.CD();
                    }
                    break;
                case 9:
                    nums.DT();
                    nums.CD();
                    System.out.println("Insertar Elementos aleatorios");
                    System.out.println("Cuantos elementos desea insertar?");
                    qty = Integer.parseInt(read.nextLine());
                    nums.EA(qty);
                    nums.CD();
                    break;
                case 10:
                    nums.CD();
                    System.out.println("Limpiar todos los nodos duplicados");
                    Tree.Pausa();
                    nums.CD();

                    break;
                case 0:
                    nums.CD();
                    // Centrar el texto
                    System.out.println("----- Gracias por usar el programa ------");

                    // nums.creditos();

                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opc != 0);
    }

    public static void MN() {
        System.out.println("\n");
        System.out.println("---ARBOLES BINARIOS---");
        System.out.println("1 - Insertar");
        System.out.println("2 - Mostrar en preorden y preorden invertido");
        System.out.println("3 - Mostrar en inorden y inorden invertido");
        System.out.println("4 - Mostrar en postorden y postorden invertido");
        System.out.println("5 - Eliminar elemento");
        System.out.println("6 - Reiniciar arbol");
        System.out.println("7 - Buscar elemento");
        System.out.println("8 - Contar niveles");
        System.out.println("9 - Elementos aleatorios");
        System.out.println("10 - Limpiar nodos duplicados");
        System.out.println("0 - Salir");
    }
}
// Contar niveles y encontrar elementos

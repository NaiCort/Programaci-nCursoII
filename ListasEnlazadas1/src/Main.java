//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args){
        Lista lista = new Lista();

        lista.insertarAlInicio(1);
        lista.insertarAlInicio(2);
        lista.insertarAlInicio(4);//1


        System.out.println();
        lista.mostrarNodos();//2

        System.out.println();
        lista.insertarAlFinal(0);//3

        System.out.println();
        lista.contar();//4

        lista.insertarEnPosicion(1,3);//5
        lista.mostrarNodos();

        System.out.println("\n"+lista.obtenerNodo(1));//6

        System.out.println();
        lista.eliminarAlInicio();//7

        System.out.println();
        lista.contar();

        System.out.println();
        lista.eliminarAlFinal();
        lista.eliminarNodo(1);

        lista.mostrarNodos();
        lista.contar();
    }
}
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String nombre= "Edwin";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Edwin\") = " + nombre.equals("Edwin"));
        System.out.println("nombre.equals(\"edwin\") = " + nombre.equals("edwin"));
        System.out.println("nombre.equalsIgnoreCase(\"edwin\") = " + nombre.equalsIgnoreCase("edwin"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));

        String materia = "Filosofia";
        System.out.println("materia.replace(\"a\", \"<3\") = " + materia.replace("a", "<3"));
        System.out.println("materia.endsWith(\"a\") = " + materia.endsWith("a"));
        System.out.println("materia.indexOf(\"Filo\") = " + materia.indexOf("Filo"));


    }
    }

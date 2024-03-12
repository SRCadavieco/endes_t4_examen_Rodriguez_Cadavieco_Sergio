package org.example;

class Report {

    void printReport() {
        // imprimir título
        ImprimirTitulo();

        // contenido del reporte
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
        // más contenido...

        // imprimir conclusión
        Conclusion();

    }

    private static void Conclusion() {
        System.out.println("Conclusión del Reporte");
    }

    private static void ImprimirTitulo() {
        System.out.println("Título del Reporte");
    }
}

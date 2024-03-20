package POO;

public class Sabia {
    public static void main(String[] args) {
        Ave sabia = new Ave();
        String resp = sabia.canto(" cantando..." + sabia.voar(" para a fêmea"));
        System.out.println(resp);
    }
}

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso do sistema
        Voo voo1 = new Voo("V123", "São Paulo", "Rio de Janeiro", "2023-12-01 10:00", 50);

        Passageiro passageiro1 = new Passageiro("João Silva", "123456789", "9876543210");

        // Cadastro de voos
        System.out.println("Cadastro de voos:");
        System.out.println("Número do voo: " + voo1.getNumeroVoo());
        System.out.println("Origem: " + voo1.getOrigem());
        System.out.println("Destino: " + voo1.getDestino());
        System.out.println("Data e hora de partida: " + voo1.getDataHoraPartida());
        System.out.println("Número total de assentos: " + voo1.getNumTotalAssentos());
        System.out.println("Número de assentos disponíveis: " + voo1.getNumAssentosDisponiveis());

        // Reserva de assentos
        System.out.println("\nReserva de assentos:");
        voo1.reservarAssento("1");
        voo1.reservarAssento("10");
        voo1.reservarAssento("25");

        // Consulta de informações
        System.out.println("\nConsulta de informações:");
        System.out.println("Número do voo: " + voo1.getNumeroVoo());
        System.out.println("Origem: " + voo1.getOrigem());
        System.out.println("Destino: " + voo1.getDestino());
        System.out.println("Data e hora de partida: " + voo1.getDataHoraPartida());
        System.out.println("Número total de assentos: " + voo1.getNumTotalAssentos());
        System.out.println("Número de assentos disponíveis: " + voo1.getNumAssentosDisponiveis());
    }
}
package view;

import model.TransporteProduto;
import model.ItemProduto;
import model.Produto;
import java.text.SimpleDateFormat;

public class Terminal {

    // Formatador para datas (opcional, para ficar bonito)
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public void iniciar() {
        System.out.println("=== SISTEMA DE LOGÍSTICA INICIADO ===");
        System.out.println("Aguardando dados para exibição...\n");
    }

    public void mostrarTransporte(TransporteProduto t) {
        if (t == null) return;

        System.out.println("=========================================");
        System.out.println("DETALHES DO TRANSPORTE #" + t.getId()); // Assumindo getId()
        System.out.println("=========================================");
        System.out.println("Agente Responsável: " + t.getAgente().getNome() + " (" + t.getAgente().getEmpresa().getRazaoSocial() + ")");
        
        System.out.println("Origem: Armazém " + t.getArmazemOrigem().getId() + " - " + t.getArmazemOrigem().getCidade().getNome());
        System.out.println("Destino: Armazém " + t.getArmazemDestino().getId() + " - " + t.getArmazemDestino().getCidade().getNome());
        System.out.println("Produto: " + t.getProduto().getId() + " - " + t.getProduto().getNome());
    }

    public void mostrarProduto(Produto p) {
        if (p == null) return;

        System.out.println(">>> PRODUTO: " + p.getNome());
        System.out.println("    Preço Base: R$ " + String.format("%.2f", p.getPreco()));
    }
}
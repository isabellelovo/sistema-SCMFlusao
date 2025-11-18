package controller;

import java.util.Date;

import model.Agente;
import model.Armazem;
import model.Cidade;
import model.EmpresaParceira;
import model.ItemProduto;
import model.Pais;
import model.Produto;
import model.TransporteProduto;
import view.Terminal;

public class CtrlPrograma {
    public static void main(String[] args) {
        
        Pais pais1 = new Pais(55, "Brasil", "América do Sul");
        Pais pais2 = new Pais(1, "Canadá", "América do Norte");

        Cidade cidade1 = new Cidade(21, "Niterói", "Rio de Janeiro", pais1);
        Cidade cidade2 = new Cidade(416, "Toronto", "Ontário", pais2);

        Armazem armazem1 = new Armazem(10, "24240030", "Rua Gastão Gonçalves", 79, cidade1, "2422258352");
        Armazem armazem2 = new Armazem(11, "M4P1A6", "Eglinton Avenue",   2257, cidade2, "4163154798");

        ItemProduto item1 = new ItemProduto(20, "Placa-mãe", 420.00);
        ItemProduto item2 = new ItemProduto(21, "Processador", 780.00);
        ItemProduto item3 = new ItemProduto(22, "Memória RAM", 210.00);
        ItemProduto item4 = new ItemProduto(23, "SSD", 260.00);
        ItemProduto item5 = new ItemProduto(24, "Fonte de alimentação", 190.00);

        ItemProduto[] itensEscolhidos1 = new ItemProduto[5];
        for (int i=0; i < itensEscolhidos1.length; i++){
            itensEscolhidos1[i] = ItemProduto.selecionarItem(i+1);
        }
        
        ItemProduto[] itensEscolhidos2 = new ItemProduto[3];
        for (int i=0; i < itensEscolhidos2.length; i++){
            itensEscolhidos2[i] = ItemProduto.selecionarItem(i+1);
        }

        Produto produto1 = new Produto(31, "Computador Desktop", 1899.99, itensEscolhidos1);
        Produto produto2 = new Produto(32, "Terminal de Consulta", 1299.99, itensEscolhidos2);
        
        EmpresaParceira emp1 = new EmpresaParceira("100", "LogiTrans");
        EmpresaParceira emp2 = new EmpresaParceira("101", "CargaExpress");
        EmpresaParceira emp3 = new EmpresaParceira("102", "NorthCargo");
        
        Agente agente1 = new Agente(100, "Carlos Andrade", emp1);
        Agente agente2 = new Agente(101, "João Pereira", emp1);
        Agente agente3 = new Agente(102, "Maria Silva", emp2);
        Agente agente4 = new Agente(103, "Emily Thompson", emp3);

        TransporteProduto transporte1 = new TransporteProduto(41, new Date(), new Date(), 150.00, agente1, armazem1, armazem2, produto1);
        TransporteProduto transporte2 = new TransporteProduto(42, new Date(), new Date(), 200.00, agente2, armazem2, armazem1, produto2);
        
        Terminal viewer = new Terminal();
        viewer.iniciar();
        viewer.mostrarProduto(produto1);
        viewer.mostrarProduto(produto2);
        viewer.mostrarTransporte(transporte1);
        viewer.mostrarTransporte(transporte2);
    }
}

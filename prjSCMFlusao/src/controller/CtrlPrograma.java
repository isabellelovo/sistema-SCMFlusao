package controller;

import model.Pais;
import model.Cidade;
import model.Armazem;
import model.ItemProduto;
import model.Produto;

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

        ItemProduto[] itensEscolhidos = new ItemProduto[5];
        for (int i=0; i < itensEscolhidos.length; i++){
            itensEscolhidos[i] = ItemProduto.selecionarItem(i+1);
        }

        Produto produto1 = new Produto(31, "Computador Desktop", 1899.99, itensEscolhidos);

    }
}

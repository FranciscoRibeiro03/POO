package aula10.exer02;

public class Exer2 {
	public static void main(String[] args) {
		Termos t = new Termos();

		t.add("cachorro", "É um animal de estimação", "Cão");
		t.add("branco", "Cor da neve", "Cor de leite");
		t.add("azul", "Cor do céu", "Cor da água");
		t.add("leao", "Felino", "Animal selvagem");
		t.add("computador", "Eletrônico", "Usa eletricidade");
		t.replace("leao", "Felino 2", "Animal selvagem 2");
		t.remove("computador");
		t.add("telhado", "Parte da casa", "Telhas", "Protege da chuva");

		t.removeSignificado("telhado", "Protege da chuva");
		t.addSignificado("telhado", "Protege da chuva 2");

		System.out.println(t);

		System.out.println(t.randomSignificado("leao"));
	}
}

package aula10.exer01;

public class Exer1 {
	public static void main(String[] args) {
		Termos t = new Termos();

		t.add("cachorro", "É um animal de estimação");
		t.add("branco", "Cor da neve");
		t.add("azul", "Cor do céu");
		t.add("leao", "Felino");
		t.add("computador", "Eletrónico");
		t.replace("leao", "Felino 2");
		t.remove("computador");
		t.add("telhado", "Parte da casa");

		System.out.println(t);
	}
}

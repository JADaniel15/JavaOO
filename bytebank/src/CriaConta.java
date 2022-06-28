
public class CriaConta { 

    public static void main(String[] args) {
        conta primeiraConta = new conta();
        primeiraConta.saldo = 200; 
        System.out.println(primeiraConta.saldo); 

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        conta segundaConta = new conta();
        segundaConta.saldo = 300;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);
        
        primeiraConta.agencia = 146;
        System.out.println("agora segunda conta esta" + "na agencia "  + primeiraConta.agencia);
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        
        //System.out.println(segundaConta.agencia);
        
        segundaConta.agencia = 146;
        System.out.println("agora segunda conta esta" + "na agencia "  + segundaConta.agencia);
        
        if(primeiraConta == segundaConta) {
			System.out.println("sao a mesma conta");
		} else {
			System.out.println("sao contas diferentes");
		}
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}

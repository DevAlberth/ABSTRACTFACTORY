package CARROS;

import java.util.Scanner;

public class CarrosDeLuxo implements Carros {
    @Override
    public void contratoCarro() {

        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        boolean continuar1 = true;
        String option = "";
        boolean continu = true;
        String choose = "";


//        System.out.println("CONTRATO CARRO LUXO.");
//        System.out.println("ESCOLHA UMA MARCA DA LISTA DE CARROS: ");
//        System.out.println("Rolls Royce");
//        System.out.println("Mercedes");
//        System.out.println("Ferrari");

   //     option = scan.nextLine();
//        while (continuar1) {

//            System.out.println("CONTRATO CARRO LUXO.");
//            System.out.println("ESCOLHA UMA MARCA DA LISTA DE CARROS: ");
//            System.out.println("Rolls Royce");
//            System.out.println("Mercedes");
//            System.out.println("Ferrari");
//
//            option = scan.nextLine();

            while (continuar) {
                System.out.println("CONTRATO CARRO LUXO.");
                System.out.println("ESCOLHA UMA MARCA DA LISTA DE CARROS: ");
                System.out.println("Rolls Royce");
                System.out.println("Mercedes");
                System.out.println("Ferrari");

                option = scan.nextLine();

                switch (option) {
                    case "Rolls Royce":


                        while (continu) {
                            System.out.println("MARCA ESCOLHIDA Rolls Royce");
                            System.out.println("Kwid Disponivel.");
                            System.out.println("Deseja comprar o Rolls Royce?");
                            System.out.println("Digite (S/N) para confirmar pedido");

                            choose = scan.nextLine();
                            if (choose.equalsIgnoreCase("S")) {
                                System.out.println("Rolls Royce ADICIONADO COMPRADO COM SUCESSO.");
                                continuar = false;
                                continuar1 = false;
                                continu = false;
                                break;
                            } else if (choose.equalsIgnoreCase("N")) {
                                System.out.println("VOLTANDO AO MENU DE CARROS...");
                                continuar = true;
                                continu = false;
                                break;
                            } else {
                                System.out.println("Digite S/N para prosseguir.");
                                break;
                            }

                        }
                    case "Mercedes":

                        while (continu) {
                            System.out.println("MARCA ESCOLHIDA Mercedes");
                            System.out.println("Mercedes Disponivel.");
                            System.out.println("Deseja comprar o Mercedes?");
                            System.out.println("Digite (S/N) para confirmar pedido");
                            choose = scan.nextLine();
                            if (choose.equalsIgnoreCase("S")) {
                                System.out.println("Mercedes ADICIONADO COMPRADO COM SUCESSO.");
                                continuar = false;
                                continuar1 = false;
                                continu = false;
                                break;
                            } else if (choose.equalsIgnoreCase("N")) {
                                System.out.println("VOLTANDO AO MENU DE CARROS...");
                                continuar = true;
                                continu = false;
                                break;
                            } else {
                                System.out.println("Digite S/N para prosseguir.");
                                break;
                            }

                        }
                    case "Ferrari":

                        while (continu) {
                            System.out.println("MARCA ESCOLHIDA Ferrari");
                            System.out.println("Ferrari Disponivel.");
                            System.out.println("Deseja comprar o Ferrari?");
                            System.out.println("Digite (S/N) para confirmar pedido");

                            choose = scan.nextLine();
                            if (choose.equalsIgnoreCase("S")) {
                                System.out.println("Ferrari ADICIONADO COMPRADO COM SUCESSO.");
                                continuar = false;
                                continuar1 = false;
                                continu = false;
                                break;
                            } else if (choose.equalsIgnoreCase("N")) {
                                System.out.println("VOLTANDO AO MENU DE CARROS...");
                                continuar = true;
                                continu = false;
                                break;
                            } else {
                                System.out.println("Digite S/N para prosseguir.");
                                break;
                            }

                        }


                }
            }


        }
    }
//}

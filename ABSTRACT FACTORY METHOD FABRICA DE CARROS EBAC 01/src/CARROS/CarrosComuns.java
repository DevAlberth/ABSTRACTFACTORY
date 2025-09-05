package CARROS;

import java.util.Scanner;

public class CarrosComuns implements Carros {


    @Override
    public void contratoCarro() {
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
//        boolean continuar1 = true;
        String option = "";
        boolean continu = true;
        String choose = "";


            while (continuar) {
                System.out.println("CONTRATO CARRO COMUM.");
                System.out.println("ESCOLHA UMA MARCA DA LISTA DE CARROS: ");
                System.out.println("Renault");
                System.out.println("Pegout");
                System.out.println("Fiat");

                option = scan.nextLine();
                switch (option) {
                    case "Renault":


                        while (continu) {
                            System.out.println("MARCA ESCOLHIDA RENAULT");
                            System.out.println("Kwid Disponivel.");
                            System.out.println("Deseja comprar o Kwid?");
                            System.out.println("Digite (S/N) para confirmar pedido");

                            choose = scan.nextLine();
                            if (choose.equalsIgnoreCase("S")) {
                                System.out.println("KWID ADICIONADO COMPRADO COM SUCESSO.");
                                continuar = false;
//                                continuar1 = false;
                                continu = false;
                                break;
                            } else if (choose.equalsIgnoreCase("N")) {
                                System.out.println("VOLTANDO AO MENU DE CARROS...");
                                continuar = true;
                                continu = false;
                                option = "";
                                break;
                            } else {
                                System.out.println("Digite S/N para prosseguir.");
                                break;
                            }

                        }
                    case "Pegout":

                        while (continu) {
                            System.out.println("MARCA ESCOLHIDA PEGOUT");
                            System.out.println("PEGOUT Disponivel.");
                            System.out.println("Deseja comprar o PEGOUT?");
                            System.out.println("Digite (S/N) para confirmar pedido");
                            choose = scan.nextLine();
                            if (choose.equalsIgnoreCase("S")) {
                                System.out.println("KWID ADICIONADO COMPRADO COM SUCESSO.");
                                continuar = false;
//                                continuar1 = false;
                                continu = false;
                                break;
                            } else if (choose.equalsIgnoreCase("N")) {
                                System.out.println("VOLTANDO AO MENU DE CARROS...");
                                continuar = true;
                                continu = false;
                                option = "";
                                break;
                            } else {
                                System.out.println("Digite S/N para prosseguir.");
                                break;
                            }

                        }
                    case "Fiat":

                        while (continu) {
                            System.out.println("MARCA ESCOLHIDA FIAT");
                            System.out.println("FIAT Disponivel.");
                            System.out.println("Deseja comprar o FIAT?");
                            System.out.println("Digite (S/N) para confirmar pedido");
                            choose = scan.nextLine();
                            if (choose.equalsIgnoreCase("S")) {
                                System.out.println("KWID ADICIONADO COMPRADO COM SUCESSO.");
                                continuar = false;
//                                continuar1 = false;
                                continu = false;
                                break;
                            } else if (choose.equalsIgnoreCase("N")) {
                                System.out.println("VOLTANDO AO MENU DE CARROS...");
                                continuar = true;
                                option = "";
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

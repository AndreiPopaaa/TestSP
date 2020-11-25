package com.company;

public class Main {

    public static void main(String[] args) {
        com.company.Comanda comanda=new com.company.Comanda();
        feluri feluri1=new feluri(2,"Pui",100);
        feluri feluri2=new felur2(1 ," Friptura de porc la tava ", 13);
        feluri feluri3=new felur3(1,"Snitel vienez ",100);
        feluri feluri4=new felur4(2 ,"Cartofi Wedges ",  6 );
        comanda.AddElement(feluri1);
        comanda.AddElement(feluri2);
        comanda.AddElement(feluri3);
        comanda.AddElement(feluri4);
        comanda.print();

    }
}

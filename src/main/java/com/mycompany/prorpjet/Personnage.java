/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prorpjet;

/**
 *
 * @author erwan
 */
public class Personnage {
    private String nomPersonnage;
    private String classePersonnage;
    private int pvActuel;
    private int pvMax;
    private int attaque;
    private int defense;
    private int coupCritique;
    private int kama;
    private int nbrpotion;
    private String pouvoirbonus1="electra";
    private String pouvoirbonus2="joker";
    private String pouvoirbonus3="sicario";
    private String pouvoirbonus4="elchapoo";  
    private String niveau1="Niveau 1";
    private String niveau2="Niveau 2";
    private String niveau3="Niveau 3";
    private String niveau4="Niveau 4";
    private String niveau5="Niveau 5";
    private String niveau6="Niveau 6";
    private String niveau7="Niveau 7";
    private String niveau8="Niveau 8";
    private String niveau9="Niveau 9";
    private String niveau10="Niveau 10";
    
    public Personnage(String nomPersonnage,
            String classePersonnage,
            int pvActuel,
            int pvMax,
            int attaque,
            int defense,
            int coupCritique,
    String pouvoirbonus1,
            String pouvoirbonus2,
            int nbrpotion,
            String niveau1,
            String niveau2,
            String niveau3,
            String niveau4,
            String niveau5,
            String niveau6,
            String niveau7,
            String niveau8,
            String niveau9,
            String niveau10)
    {
        this.nomPersonnage = nomPersonnage;
        this.classePersonnage = classePersonnage;
        
        this.pvActuel= pvActuel;
        this.pvMax = pvMax;
        this.attaque = attaque;
        this.defense = defense;
        this.coupCritique = coupCritique;
        this.kama = 150;
        this.nbrpotion=nbrpotion;
        this.pouvoirbonus1="electra";
        this.pouvoirbonus2="joker";
        this.niveau1=niveau1;
        this.niveau2=niveau2;
        this.niveau3=niveau3;
        this.niveau4=niveau4;
        this.niveau5=niveau5;
        this.niveau6=niveau6;
        this.niveau7=niveau7;
        this.niveau8=niveau8;
        this.niveau9=niveau9;
        this.niveau10=niveau10;
        switch(this.classePersonnage)
        {
            case "Féca":
                this.defense += 1;
                this.attaque -= 2;
                break;
            case "Iop":
                this.attaque += 2;
                this.coupCritique -= 10;
                break;
            case "Cra":
                this.coupCritique += 10;
                this.defense -= 1;
                break;
            case "Sadida":
                this.attaque += 2;
                this.pvMax -= 10;
                break;
            case "Osamodas":
                this.pvMax += 10;
                this.attaque -= 2;
                break;
            case "Sacrieur":
                this.pvMax += 10;
                this.defense -= 1;
                break;
            case "Pandawa":
                this.pvMax += 10;
                this.coupCritique -= 10;
                break;
            case "Eniripsa":
                this.defense += 1;
                this.coupCritique -= 10;
                break;
            case "Sram":
                this.attaque += 2;
                this.defense -= 1;
                break;
            case "Xélor":
                this.defense += 1;
                this.pvMax -= 10;
                break;
            case "Enutrof":
                this.coupCritique += 10;
                this.attaque -= 2;
                break;
            case "Ecaflip":
                this.coupCritique += 10;
                this.pvMax -= 10;
                break;
            
                
        }
        this.pvActuel = this.pvMax;
    }

    
    public int getNbrpotion() {
        return this.nbrpotion;
    }

    public String getNomPersonnage() {
        return nomPersonnage;
    }

    public void setNomPersonnage(String nomPersonnage) {
        this.nomPersonnage = nomPersonnage;
    }

    public String getClassePersonnage() {
        return classePersonnage;
    }

    public void setClassePersonnage(String classePersonnage) {
        this.classePersonnage = classePersonnage;
    }

    public int getPvActuel() {
        return pvActuel;
    }

    public void setPvActuel(int pvActuel) {
        this.pvActuel = pvActuel;
    }

    public int getPvMax() {
        return pvMax;
    }

    public void setPvMax(int pvMax) {
        this.pvMax = pvMax;
    }

    public int getAttaque() {
        return attaque;
    }
    

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public double getCoupCritique() {
        return coupCritique;
    }

    public void setCoupCritique(int coupCritique) {
        this.coupCritique = coupCritique;
    }

    public int getKama() {
        return kama;
    }

    public void setKama(int kama) {
        this.kama = kama;
    }
    
    public void affStats() {
       
        System.out.println("Vous êtes un : " + this.classePersonnage );
        System.out.println("Vous êtes un : " + this.nomPersonnage );
        System.out.println("Vous avez : " + this.kama + "  kama" );
        System.out.println("Vos statistiques sont les suivantes : " );
        System.out.println("Vous êtes un : " + this.nomPersonnage );
        System.out.println("Vous avez : " + this.pvActuel/this.pvMax + " pv ");

        System.out.println("Vous avez : " + this.attaque + "d'attaque");
        System.out.println("Vous avez : " + this.defense + "de défense " );
        System.out.println("Vous avez : " + this.coupCritique + " de coup critique" );
        System.out.println("Vous avez : " + this.pouvoirbonus1 + " comme premier pouvoir bonus donnant + 3 dégat sur un ennemie de façon aléatoire" );
        System.out.println("Vous avez : " + this.pouvoirbonus2 + " comme second pouvoir bonus permet de gagner automatiquement le combat !");
        System.out.println("Ces fonctionnalités (les deux nouveaux pouvoir) sont en cours de travaux veuillez patienter !");
        /*
        
        Cette fonction affiche la classe du joueur, son nom ainsi que son nombre de kamas.
        Cette fonction affichera également les stats du joueur. (Nom, PV, Att, Def, Crit).
        Elle affichera aussi si le joueur a une potion ou non.
        */
    }
    

     public void affStatsniveau1() {
       
        System.out.println("Vous êtes un : " + this.classePersonnage );
        System.out.println("Vous êtes un : " + this.nomPersonnage );
        System.out.println("Vous avez : " + this.kama + "  kama" );
        System.out.println("Vos statistiques sont les suivantes : " );
        System.out.println("Vous êtes un : " + this.nomPersonnage );
        System.out.println("Vous avez : " + this.pvActuel/this.pvMax + " pv ");

        System.out.println("Vous avez : " + this.attaque + "d'attaque");
        System.out.println("Vous avez : " + this.defense + "de défense " );
        System.out.println("Vous avez : " + this.coupCritique + " de coup critique" );
        System.out.println("Vous êtes : " + this.niveau1 + ", le peuple vous félicite ! Bravo ! Mais beaucoup vous reste...");
        /*
        Cette fonction affiche la classe du joueur, son nom ainsi que son nombre de kamas.
        Cette fonction affichera également les stats du joueur. (Nom, PV, Att, Def, Crit).
        Elle affichera aussi si le joueur a une potion ou non.
        */
    }
     public void affStats2() {
       
        System.out.println("Vous êtes un : " + this.classePersonnage );
        System.out.println("Vous êtes un : " + this.nomPersonnage );
        System.out.println("Vous avez : " + this.kama + "  kama" );
        System.out.println("Vos statistiques sont les suivantes : " );
        System.out.println("Vous êtes un : " + this.nomPersonnage );
        System.out.println("Vous avez : " + this.pvActuel/this.pvMax + " pv ");

        System.out.println("Vous avez : " + this.attaque + "d'attaque");
        System.out.println("Vous avez : " + this.defense + "de défense " );
        System.out.println("Vous avez : " + this.coupCritique + " de coup critique" );
        System.out.println("Vous avez : " + this.nbrpotion + " potion(s)" );
        /*
        Cette fonction affiche la classe du joueur, son nom ainsi que son nombre de kamas.
        Cette fonction affichera également les stats du joueur. (Nom, PV, Att, Def, Crit).
        Elle affichera aussi si le joueur a une potion ou non.
        */
    }
    
    public void affStatsCombat() {
        
        System.out.println("Vous êtes un : " + this.nomPersonnage );
        System.out.println("Vos statistiques sont les suivantes : " );
        System.out.println("Vous avez : " + this.pvActuel/this.pvMax + " pv ");
        System.out.println("Vous avez : " + this.attaque + "d'attaque");
        System.out.println("Vous avez : " + this.defense + "de défense " );
        System.out.println("Vous avez : " + this.coupCritique + " de coup critique" );
        /*
        Cette fonction affiche les stats du joueur. (Nom, PV, Att, Def, Crit)
        Elle affichera aussi si le joueur a une potion ou non.
        */
    }
    public void gagneKama(int gainKama)
    {
        int kamafinal= this.kama + gainKama;
        System.out.println("Vous avez : " + kamafinal + " kama" );
        /*
        Cette fonction augmente les kamas du joueur (kama de base + gainKama)
        */
    }
    public void perdreKama(int perdreKama)
    {

        int kamafinal1= this.kama - perdreKama;
        if (kamafinal1 <0) {
        System.out.println("Vous ne pouvez pas avoir de kama négatif "  );    
        }
        else {
        System.out.println("Vous avez : " + kamafinal1 + " kama" );
    }

        
        /*
        Cette fonction diminue les kamas du joueur (kama de base - perdreKama)
        /!\ On ne peut pas avoir un nombre de kamas négatif /!\
        */
    }
    public void pertePv(int degat)
    {
        int pvfinal= this.pvActuel - degat;
        if (pvfinal <0) {
        pvfinal=0;
        System.out.println("Vous avez : " + pvfinal + " pv" );
        }
        else {
        System.out.println("Vous avez : " + pvfinal + " pv" );
    }

        /*
        Cette fonction diminue les pvActuel du joueur (pvActuel - degat)
        /!\ On ne peut pas avoir un nombre de pv négatif /!\
        */
    }
    public void utilisationPotion()
    {
        this.pvActuel=this.pvMax;
        System.out.println("Vous avez :" + this.pvActuel + "pv" );
        /* 
        Cette fonction met les pvActuel du joueur au max.
        */
    }
    public void reposTaverne()
    {
        int pvfinal=  this.pvActuel + 5;
        if (pvfinal>this.pvMax) {
      
            System.out.println("Vos pv actuel ne doivent pas être supérieur à vos pvMax");
        }
        else {
            System.out.println("Vos nouveaux pv sont  : " + pvfinal + "pv" );
        }
        
        
        /* 
        Cette fonction augmente les pvActuel du joueur de 5.
        /!\ Le joueur ne pourra pas avoir plus de pvActuel que de pvMax. /!\
        */ 
    }
    public void affKama()
    {
        System.out.println("Vous avez  : " + this.kama + "kama" );
        /*
        Cette fonction affiche le nombre de kamas en la possession du joueur.
        */
    }
    public void affVie()
    {
        System.out.println("Vous avez : " + this.pvActuel / this.pvMax + "pv" );
        /*
        Cette fonction affiche le nombre de pv sous la forme "pvActuel" / "pvMax"
        Exemple affichage -> " Vous avez 45/60 pv. "
        */
    }
    public void augPV(int augmentation)
    {
        int haussepvA= this.pvActuel + augmentation;
        int haussepvM = this.pvMax + augmentation;
        System.out.println("Vos pv Actuel ont augmenté et s'élève à :" + haussepvA );
        System.out.println("Vos pv Max ont augmenté et s'élève à :" + haussepvM );
        /*
        Augmente les pvActuel et pvMax à l'aide de l'argument augmentation.
        */
    }
    public void augCrit(int augmentation)
    {
        int hausseCritique= this.coupCritique + augmentation;
        System.out.println("Vos Coupcritique ont augmenté et s'élève à :" + hausseCritique );
        /*
        Augmente l'attribut critique à l'aide de l'argument augmentation.
        */
    }
    public void augAttaque(int augmentation)
    {
        int hausseattaque= this.attaque + augmentation;
        System.out.println("Vos attaques ont augmenté et s'élève à :" + hausseattaque );
        /*
        Augmente l'attribut attaque à l'aide de l'argument augmentation.
        */
    }
    public void augDefense(int augmentation)
    {
        int haussedefense= this.defense + augmentation;
        System.out.println("Votre défense a augmenté et s'élève à :" + haussedefense);
        /*
        Augmente l'attribut defense à l'aide de l'argument augmentation.
        */
    }
    public void affAttaque()
    {
        System.out.println("Votre attaque est :" + this.attaque);
        /*
        Affiche l'attaque du joueur.
        */
    }
    public void affDefense()
    {
        
        System.out.println("Votre défense est :" + this.defense);
        /*
        Affiche la défense du joueur.
        */
    }
    public void affCritique()
    {
        
        double nouvellecritique= this.coupCritique*100;
        int nouvellecritiques= (int)nouvellecritique;
        System.out.println("Vous avez : " + nouvellecritiques+"%" + "de critique" ); 
        /*
        Affiche le pourcentage de critique du joueur sous la forme critique%.
         -> Par exemple : "Vous avez 25% de critique"
        */
    }
    public void subirDegat(int attaqueAdversaire, boolean critiqueAdversaire)
    {
        if (critiqueAdversaire== true) {
        this.pvActuel= (attaqueAdversaire*2) - this.defense;
        
                if(this.pvActuel<0){
                    this.pvActuel=0;
                }
                        else {
                      //      System.out.println("Vos nouveaux pv s'élève à :" +  this.pvActuel);
                    }
        }
        else {
        this.pvActuel= attaqueAdversaire - this.defense;
                if(this.pvActuel<0){
                        this.pvActuel=0;
                }
        
     //   System.out.println("Vos nouveaux  pv s'élèvent à :" + this.pvActuel);
        }
        
        
                

        /*
        Cette fonction va servir à faire baisser les points de vie du personnage.
        Vous devrez modifier l'attribut "pvActuel" du joueur.
        Deux arguments :
         -> attaqueAdversaire qui correspond à l'attaque du Adversaire.
         -> critiqueAdversaire qui dit si un Adversaire à réaliser un coup critique ou non.
        Calcul des dégâts : attaqueAdversaire + (attaqueAdversaire si critiqueAdversaire == true) - defense du joueur.
        
        /!\ Attention au calcul des dégâts donnant un résultat négatif /!\
        */
    }
 public void setnbrPotion() {
        
 
          
        if (this.nbrpotion==3) {
              this.nbrpotion-=1;
              System.out.println("Fais attention, il te reste seulement : " + this.nbrpotion + "  potions. ");
              this.nbrpotion=2;
        }
        
        else if (this.nbrpotion==2){

            this.nbrpotion-=1;
            System.out.println("Fais attention, il te reste seulement : " + this.nbrpotion + "  potions. ");
            this.nbrpotion=1; 
        }
        
        else if (this.nbrpotion==1){

            this.nbrpotion-=1;
            System.out.println("Fais attention, il te reste seulement : " + this.nbrpotion + "  potions. ");
            this.nbrpotion=0; 
        }
        
  
    }
             
    public String getaffpouvoirbonus() {
        
       
        return this.pouvoirbonus1;
    }
      
 
}

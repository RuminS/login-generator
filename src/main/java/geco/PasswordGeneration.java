package geco;

import java.util.Random;

/**
 * Classe permettant de générer des mots de passe
 */
public class PasswordGeneration {


    public String getRandomPassword(){
        String mdp = new String();
        Random rand = new Random();
        for (int i = 0; i<8; i++){
            mdp += (rand.nextInt(26) + 97);
        }
        return mdp;
    }

}

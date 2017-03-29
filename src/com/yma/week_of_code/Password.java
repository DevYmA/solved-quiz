package com.yma.week_of_code;

import java.util.*;

/**
 * Created by Yoshan Amarathunga on 3/15/2017.
 */
public class Password {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Character> characters = new ArrayList<Character>();
        List<Character> vowel = new ArrayList<Character>();

        Set<String> passwordSet = new HashSet<String>();

        for (char c = 'a'; c <= 'z'; c++) {
            if(c != 'y' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' ){
                characters.add(c);
            }else if(c != 'y'){
                vowel.add(c);
            }
        }

        if(n == 1){
            for (Character character : characters) {
                passwordSet.add(character+"");
            }
            for (Character character : vowel) {
                passwordSet.add(character+"");
            }
        }else if (n == 2){
            for (int i = 0; i < vowel.size(); i++) {
                for (int j = 0; j < characters.size(); j++) {
                    String pass = vowel.get(i)+""+characters.get(i);
                    String revPass = new StringBuilder(pass).reverse().toString();
                    passwordSet.add(pass);
                }
            }
        }else if (n == 3){
            for (int i = 0; i < vowel.size(); i++) {
                for (int j = 0; j < characters.size(); j++) {
                    for (int k = 0; k < vowel.size(); k++) {
                        String pass = vowel.get(i)+""+characters.get(j)+vowel.get(k);
                        String revPass = new StringBuilder(pass).reverse().toString();
                        passwordSet.add(pass);
                    }
                }
            }
            for (int i = 0; i < characters.size(); i++) {
                for (int j = 0; j < vowel.size(); j++) {
                    for (int k = 0; k < characters.size(); k++) {
                        String pass = characters.get(i)+""+vowel.get(j)+characters.get(k);
                        String revPass = new StringBuilder(pass).reverse().toString();
                        passwordSet.add(pass);
                    }
                }
            }
        }else if (n == 4){
            for (int i = 0; i < vowel.size(); i++) {
                for (int j = 0; j < characters.size(); j++) {
                    for (int k = 0; k < vowel.size(); k++) {
                        for (int l = 0; l < characters.size(); l++) {
                            String pass = vowel.get(i)+""+characters.get(j)+""+vowel.get(k)+""+characters.get(l);
                            String revPass = new StringBuilder(pass).reverse().toString();
                            passwordSet.add(pass);
                        }
                    }
                }
            }
            for (int i = 0; i < characters.size(); i++) {
                for (int j = 0; j < vowel.size(); j++) {
                    for (int k = 0; k < characters.size(); k++) {
                        for (int l = 0; l < vowel.size(); l++) {
                            String pass = characters.get(i)+""+vowel.get(j)+""+characters.get(k)+""+vowel.get(l);
                            String rev = new StringBuilder(pass).reverse().toString();
                            passwordSet.add(pass);
                        }
                    }
                }
            }
        }else if (n == 5){
            for (int i = 0; i < vowel.size(); i++) {
                for (int j = 0; j < characters.size(); j++) {
                    for (int k = 0; k < vowel.size(); k++) {
                        for (int l = 0; l < characters.size(); l++) {
                            for (int m = 0; m < vowel.size(); m++) {
                                String pass = vowel.get(i)+""+characters.get(j)+""+vowel.get(k)+""+characters.get(l)
                                        +""+vowel.get(m);
                                String revPass = new StringBuilder(pass).reverse().toString();
                                passwordSet.add(pass);
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < characters.size(); i++) {
                for (int j = 0; j < vowel.size(); j++) {
                    for (int k = 0; k < characters.size(); k++) {
                        for (int l = 0; l < vowel.size(); l++) {
                            for (int m = 0; m < characters.size(); m++) {
                                String pass = characters.get(i)+""+vowel.get(j)+""+characters.get(k)+""+vowel.get(l)
                                        +""+characters.get(m);
                                String revPass = new StringBuilder(pass).reverse().toString();
                                passwordSet.add(pass);
                            }
                        }
                    }
                }
            }
        }else if (n == 6){
            int count = 0;
            for (int i = 0; i < vowel.size(); i++) {
                for (int j = 0; j < characters.size(); j++) {
                    for (int k = 0; k < vowel.size(); k++) {
                        for (int l = 0; l < characters.size(); l++) {
                            for (int m = 0; m < vowel.size(); m++) {
                                for (int o = 0; o < characters.size(); o++) {
                                    String pass = vowel.get(i)+""+characters.get(j)+""+vowel.get(k)+""+characters.get(l)
                                            +""+vowel.get(m)+""+characters.get(o);
                                    passwordSet.add(pass);
                                }
                            }
                        }
                    }
                }
            }

            for (int i = 0; i < characters.size(); i++) {
                for (int j = 0; j < vowel.size(); j++) {
                    for (int k = 0; k < characters.size(); k++) {
                        for (int l = 0; l < vowel.size(); l++) {
                            for (int m = 0; m < characters.size(); m++) {
                                for (int o = 0; o < vowel.size(); o++) {
                                    String pass = characters.get(i)+""+vowel.get(j)+""+characters.get(k)+""+vowel.get(l)
                                            +""+characters.get(m)+""+vowel.get(o);
                                    passwordSet.add(pass);
                                }
                            }
                        }
                    }
                }
            }

        }
        int count = 0;
        for (String s : passwordSet) {
            System.out.print(s+" ");
            if(count % 200 == 0){
                System.out.println("");
            }
            count++;
        }
    }

}

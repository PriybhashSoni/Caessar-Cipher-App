package com.pys.caesarcipher;

public class utility {
    private static String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static int index;
    private static int update_index;
    private static int final_index;
    private static int index_p_t_l;
    private static int index_s_t_l;
    private static String plaintxt;
    private static String cipherText;
    private static String finalText;

    public static String encrypt1(String plaintext,int encryptionKey)
    {
        reset();
        plaintext=plaintext.toUpperCase();
        for (index=0;index<plaintext.length();index++)
        {
            if(plaintext.charAt(index)!=' ')
            {
                index_p_t_l=alphabet.indexOf(plaintext.charAt(index));
                update_index=encryptionKey+alphabet.indexOf(plaintext.charAt(index));

                if(update_index>=alphabet.length())
                {
                    final_index=update_index-alphabet.length();
                }
                else
                {
                    final_index=update_index;
                }
                cipherText=alphabet.substring(final_index,final_index+1);
                finalText=finalText+cipherText;
            }
        }
        return finalText;
    }
    public static String decrypt1(String ciphertxt,int decryptionKey)
    {
        reset();
        ciphertxt=ciphertxt.toUpperCase();
        for(index=0;index<ciphertxt.length();index++)
        {
            if(ciphertxt.charAt(index)!=' ')
            {
                index_p_t_l=alphabet.indexOf(ciphertxt.charAt(index));
                index_s_t_l=index_p_t_l;
                update_index=alphabet.indexOf((ciphertxt.charAt(index)))-decryptionKey;
                if (update_index<0) {
                    final_index = update_index + alphabet.length();
                }
                    else
                    {
                        final_index=update_index;
                    }
                    plaintxt=alphabet.substring(final_index,final_index+1);
                    finalText+=plaintxt;

            }
        }
        return finalText;
    }

    private static void reset() {
        finalText="";
    }

}

package ANDROID;
import java.util.Arrays;
//You are given two positive integer arrays spells and potions, of length n and m respectively, where spells[i] represents the strength of the ith spell and potions[j] represents the strength of the jth potion.
//
//You are also given an integer success. A spell and potion pair is considered successful if the product of their strengths is at least success.
//
//Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair with the ith spell.
public class SpellsAndPotions{
public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];
        for(int i = 0; i<ans.length; i++){
        ans[i]=potions.length- pos(potions, spells[i], success);
        }
        return ans;
        }
public int pos(int[] potions, int spell, long success){
        long potionsNeeded = (success+spell-1)/spell;
        int l = 0;
        int r = potions.length;
        while(l<r){
        int m = l+(r-l)/2;
        if(potionsNeeded<=potions[m]){
        r=m;
        }
        else{
        l = m+1;
        }
        }
        return l;
        }

    public static void main(String[] args) {
        int[] spells = {5,1,3};
        int[] potions = {3,2,4,5,1};
        SpellsAndPotions sp = new SpellsAndPotions();
        int[] ans = sp.successfulPairs(spells,potions,7);
        System.out.print("[");
        for (int an : ans) {
            System.out.print(an + "");
        }
        System.out.println("]");
    }
}

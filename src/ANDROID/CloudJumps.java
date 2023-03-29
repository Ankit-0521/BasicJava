package ANDROID;
//A child is playing a cloud hopping game. In this game, there are sequentially numbered clouds that can be thunderheads or cumulus clouds. The character must jump from cloud to cloud until it reaches the start again.
//
//There is an array of clouds,  and an energy level . The character starts from  and uses  unit of energy to make a jump of size  to cloud . If it lands on a thundercloud, , its energy () decreases by  additional units. The game ends when the character lands back on cloud .
//
//Given the values of , , and the configuration of the clouds as an array , determine the final value of  after the game ends.
//
//Example.
//
//The indices of the path are . The energy level reduces by  for each jump to . The character landed on one thunderhead at an additional cost of  energy units. The final energy level is .
//
//Note: Recall that  refers to the modulo operation. In this case, it serves to make the route circular. If the character is at  and jumps , it will arrive at .
public class CloudJumps {
    public int jumpingOnClouds(int[] c, int k) {
        int n = c.length;
        int cloud = 0;
        int e = 100;
        for(int i = 0; i<n; i++){
            cloud = (cloud+k)%n;
            e--;
            if(c[cloud]==1){
                e -= 2;
            }
            if(cloud==0) break;
        }
        return e;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,0,0,1};
        CloudJumps cj = new CloudJumps();
        System.out.println(cj.jumpingOnClouds(arr,2));
    }
}

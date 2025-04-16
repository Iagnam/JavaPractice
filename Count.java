import java.util.*;

 class Count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        Map<Character,Integer> c=new HashMap<>();
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
       for(char ch1:s.toCharArray()){
        //   c.put(ch1,c.getOrDefault(c, null));
        if(ch1==ch){
            cnt++;
        }
       }
       System.out.println(cnt);      
      

}
}
public class SearchArray{
    public static void linearSearch(String arr[],String target){
        String result = "not found";
        
        for(String c : arr){
            if((c!= null) && (c.equals(target))){
                result = "found";
            }
        }
        System.out.println(result);
    }
}
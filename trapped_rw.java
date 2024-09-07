//import java.util.*;;
public class trapped_rw {
    public int rain_water(int heights[]){
        int left_max = 0;
        int [] left_aux = new int[heights.length];
        int right_max = 0;
        int [] right_aux = new int[heights.length];
        for(int i=0; i<heights.length ;i++){
            if(heights[i]> left_max){
                left_max = heights[i];
            }
            left_aux[i] = left_max;

        }
        for(int i=heights.length-1; i>=0 ;i--){
            if(heights[i]> right_max){
                right_max = heights[i];
            }
            right_aux[i] = right_max;

        }

        int water_level = 0;
        int [] trapped_water = new int[heights.length];
        int vol_trapped_water =0 ;
        for(int i=0; i<heights.length ;i++){
            water_level = Math.min(left_aux[i],right_aux[i]);
            trapped_water[i] = water_level - heights[i];
            vol_trapped_water += trapped_water[i];
        }

        return vol_trapped_water;
        



    }

    public static void main(String[] args) {
        int [] heights = {4,2,0,6,3,2,5};

        trapped_rw obj = new trapped_rw();
        System.out.println(obj.rain_water(heights));
    }




}

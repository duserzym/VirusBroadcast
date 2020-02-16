/**
 * 
 *
 * @ClassName: Constants
 * @Description: constants for simulation
 * @author: Bruce Young
 * @date: 2/02/2020 21:40
 */
public class Constants {

    public static int ORIGINAL_COUNT = 50;//initial infected population
    public static float BROAD_RATE = 2.2f;//transmission rate
    public static float SHADOW_TIME = 140;//incubation time
    public static int HOSPITAL_RECEIVE_TIME = 10;//Hospital response time
    public static int BED_COUNT = 2000;//Hospital total available beds
    /**
     * likelihood of migration[-0.99,0.99]
     * <p>
     * -0.99 minimum
     * 0.99 maximum
     */
    public static float u = 0.99f;
    public static int CITY_PERSON_SIZE = 5000;//total city population
    public static float FATALITY_RATE = 0.50f;//fatality_rate
    public static int DIE_TIME = 100;//
    public static double DIE_VARIANCE = 1;//standard deviation 
    /**
     * city boundary
     */
    public static final int CITY_WIDTH = 700;
    public static final int CITY_HEIGHT = 800;

}

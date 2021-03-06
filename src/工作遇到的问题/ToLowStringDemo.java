package 工作遇到的问题;

public class ToLowStringDemo {
    private static String[] roadBorderTagsArr = {"Road_BORDER_MATERIAL", "SOURCE", "RELATIVE_POSITION", "CONFIDENCE"};
    private static String[] roadCenterTagsArr = {"TRAFFIC_DIRECTION", "ROAD_NAME_CN", "ROAD_FORM"};
    private static String[] laneBorderTagsArr = {"LANE_BORDER_TYPE", "LANE_BORDER_COLOR", "DIRECTION", "SOURCE", "CONFIDENCE"};
    private static String[] laneCenterTagsArr = {"LANE_BORDER_TYPE", "LANE_BORDER_COLOR", "DIRECTION", "SOURCE", "CONFIDENCE"};
    private static String[] splitLineTagsArr = {"SplitLocation"};
    private static String[] crosswalkTagsArr = {"SEMANTIC", "CONFIDENCE"};
    private static String[] stopLineTagsAr = {"SEMANTIC", "CONFIDENCE"};
    private static String[] guideArrowTagsArr = {"SEMANTIC", "CONFIDENCE"};
    private static String[] poleTagsArr = {"KEY_POINTS", "CONFIDENCE", "ELEVATION"};
    private static String[] trafficSignTagsArr = {"KEY_POINTS", "CONFIDENCE", "SEMANTIC", "ELEVATION"};
    private static String[] trafficLightTagsArr = {"KEY_POINTS", "CONFIDENCE", "SEMANTIC", "ELEVATION"};
    private static String[] featureRelationArr = {"TrafficLightImpact"};

    public static void main(String[] args) {
        roadBorderTagsArr = transfer(roadBorderTagsArr);

    }

    private static String[] transfer(String[] arr) {
        String[] res = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i].toLowerCase();
        }
        return res;
    }
}

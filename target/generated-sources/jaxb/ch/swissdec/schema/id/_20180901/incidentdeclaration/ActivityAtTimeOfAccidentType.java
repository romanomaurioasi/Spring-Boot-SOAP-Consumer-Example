
package ch.swissdec.schema.id._20180901.incidentdeclaration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ActivityAtTimeOfAccidentType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivityAtTimeOfAccidentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="skiing"/&gt;
 *     &lt;enumeration value="footballOrsoccer"/&gt;
 *     &lt;enumeration value="paragliding"/&gt;
 *     &lt;enumeration value="snowboarding"/&gt;
 *     &lt;enumeration value="in-lineSkating"/&gt;
 *     &lt;enumeration value="iceHockey"/&gt;
 *     &lt;enumeration value="otherBallGames"/&gt;
 *     &lt;enumeration value="otherSport"/&gt;
 *     &lt;enumeration value="carDriving"/&gt;
 *     &lt;enumeration value="motorbiking"/&gt;
 *     &lt;enumeration value="scooterOrSmallMoped"/&gt;
 *     &lt;enumeration value="bicycleOrMBT"/&gt;
 *     &lt;enumeration value="runedOverAsPedestrian"/&gt;
 *     &lt;enumeration value="otherRoadTraffic"/&gt;
 *     &lt;enumeration value="housekeepingWork"/&gt;
 *     &lt;enumeration value="doItYourselfOrMaintenanceWork"/&gt;
 *     &lt;enumeration value="gardeningOrForestAndAgricultureWork"/&gt;
 *     &lt;enumeration value="otherActivitiesAtHomeAndInTheYard"/&gt;
 *     &lt;enumeration value="hikingOrWalking"/&gt;
 *     &lt;enumeration value="otherActivities"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActivityAtTimeOfAccidentType")
@XmlEnum
public enum ActivityAtTimeOfAccidentType {

    @XmlEnumValue("skiing")
    SKIING("skiing"),
    @XmlEnumValue("footballOrsoccer")
    FOOTBALL_ORSOCCER("footballOrsoccer"),
    @XmlEnumValue("paragliding")
    PARAGLIDING("paragliding"),
    @XmlEnumValue("snowboarding")
    SNOWBOARDING("snowboarding"),
    @XmlEnumValue("in-lineSkating")
    IN_LINE_SKATING("in-lineSkating"),
    @XmlEnumValue("iceHockey")
    ICE_HOCKEY("iceHockey"),
    @XmlEnumValue("otherBallGames")
    OTHER_BALL_GAMES("otherBallGames"),
    @XmlEnumValue("otherSport")
    OTHER_SPORT("otherSport"),
    @XmlEnumValue("carDriving")
    CAR_DRIVING("carDriving"),
    @XmlEnumValue("motorbiking")
    MOTORBIKING("motorbiking"),
    @XmlEnumValue("scooterOrSmallMoped")
    SCOOTER_OR_SMALL_MOPED("scooterOrSmallMoped"),
    @XmlEnumValue("bicycleOrMBT")
    BICYCLE_OR_MBT("bicycleOrMBT"),
    @XmlEnumValue("runedOverAsPedestrian")
    RUNED_OVER_AS_PEDESTRIAN("runedOverAsPedestrian"),
    @XmlEnumValue("otherRoadTraffic")
    OTHER_ROAD_TRAFFIC("otherRoadTraffic"),
    @XmlEnumValue("housekeepingWork")
    HOUSEKEEPING_WORK("housekeepingWork"),
    @XmlEnumValue("doItYourselfOrMaintenanceWork")
    DO_IT_YOURSELF_OR_MAINTENANCE_WORK("doItYourselfOrMaintenanceWork"),
    @XmlEnumValue("gardeningOrForestAndAgricultureWork")
    GARDENING_OR_FOREST_AND_AGRICULTURE_WORK("gardeningOrForestAndAgricultureWork"),
    @XmlEnumValue("otherActivitiesAtHomeAndInTheYard")
    OTHER_ACTIVITIES_AT_HOME_AND_IN_THE_YARD("otherActivitiesAtHomeAndInTheYard"),
    @XmlEnumValue("hikingOrWalking")
    HIKING_OR_WALKING("hikingOrWalking"),
    @XmlEnumValue("otherActivities")
    OTHER_ACTIVITIES("otherActivities");
    private final String value;

    ActivityAtTimeOfAccidentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivityAtTimeOfAccidentType fromValue(String v) {
        for (ActivityAtTimeOfAccidentType c: ActivityAtTimeOfAccidentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

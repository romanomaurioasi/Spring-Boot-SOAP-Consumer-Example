
package ch.swissdec.schema.common._20180901.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per WorkType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="WorkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WorkingTime"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="Steady"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;choice&gt;
 *                               &lt;element name="WeeklyHours" type="{http://www.swissdec.ch/schema/common/20180901/Common}WeeklyHoursType"/&gt;
 *                               &lt;element name="WeeklyLessons" type="{http://www.swissdec.ch/schema/common/20180901/Common}WeeklyLessonsType"/&gt;
 *                             &lt;/choice&gt;
 *                             &lt;element name="ActivityRate" type="{http://www.swissdec.ch/schema/common/20180901/Common}PercentType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Unsteady" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EntryDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="WithdrawalDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkType", propOrder = {
    "workingTime",
    "entryDate",
    "withdrawalDate"
})
public class WorkType {

    @XmlElement(name = "WorkingTime", required = true)
    protected WorkType.WorkingTime workingTime;
    @XmlElement(name = "EntryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(name = "WithdrawalDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar withdrawalDate;

    /**
     * Recupera il valore della proprietà workingTime.
     * 
     * @return
     *     possible object is
     *     {@link WorkType.WorkingTime }
     *     
     */
    public WorkType.WorkingTime getWorkingTime() {
        return workingTime;
    }

    /**
     * Imposta il valore della proprietà workingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkType.WorkingTime }
     *     
     */
    public void setWorkingTime(WorkType.WorkingTime value) {
        this.workingTime = value;
    }

    /**
     * Recupera il valore della proprietà entryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Imposta il valore della proprietà entryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * Recupera il valore della proprietà withdrawalDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWithdrawalDate() {
        return withdrawalDate;
    }

    /**
     * Imposta il valore della proprietà withdrawalDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWithdrawalDate(XMLGregorianCalendar value) {
        this.withdrawalDate = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="Steady"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;choice&gt;
     *                     &lt;element name="WeeklyHours" type="{http://www.swissdec.ch/schema/common/20180901/Common}WeeklyHoursType"/&gt;
     *                     &lt;element name="WeeklyLessons" type="{http://www.swissdec.ch/schema/common/20180901/Common}WeeklyLessonsType"/&gt;
     *                   &lt;/choice&gt;
     *                   &lt;element name="ActivityRate" type="{http://www.swissdec.ch/schema/common/20180901/Common}PercentType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Unsteady" type="{http://www.swissdec.ch/schema/common/20180901/Common}EmptyType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "steady",
        "unsteady"
    })
    public static class WorkingTime {

        @XmlElement(name = "Steady")
        protected WorkType.WorkingTime.Steady steady;
        @XmlElement(name = "Unsteady")
        protected EmptyType unsteady;

        /**
         * Recupera il valore della proprietà steady.
         * 
         * @return
         *     possible object is
         *     {@link WorkType.WorkingTime.Steady }
         *     
         */
        public WorkType.WorkingTime.Steady getSteady() {
            return steady;
        }

        /**
         * Imposta il valore della proprietà steady.
         * 
         * @param value
         *     allowed object is
         *     {@link WorkType.WorkingTime.Steady }
         *     
         */
        public void setSteady(WorkType.WorkingTime.Steady value) {
            this.steady = value;
        }

        /**
         * Recupera il valore della proprietà unsteady.
         * 
         * @return
         *     possible object is
         *     {@link EmptyType }
         *     
         */
        public EmptyType getUnsteady() {
            return unsteady;
        }

        /**
         * Imposta il valore della proprietà unsteady.
         * 
         * @param value
         *     allowed object is
         *     {@link EmptyType }
         *     
         */
        public void setUnsteady(EmptyType value) {
            this.unsteady = value;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;choice&gt;
         *           &lt;element name="WeeklyHours" type="{http://www.swissdec.ch/schema/common/20180901/Common}WeeklyHoursType"/&gt;
         *           &lt;element name="WeeklyLessons" type="{http://www.swissdec.ch/schema/common/20180901/Common}WeeklyLessonsType"/&gt;
         *         &lt;/choice&gt;
         *         &lt;element name="ActivityRate" type="{http://www.swissdec.ch/schema/common/20180901/Common}PercentType"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "weeklyHours",
            "weeklyLessons",
            "activityRate"
        })
        public static class Steady {

            @XmlElement(name = "WeeklyHours")
            protected BigDecimal weeklyHours;
            @XmlElement(name = "WeeklyLessons")
            @XmlSchemaType(name = "integer")
            protected Integer weeklyLessons;
            @XmlElement(name = "ActivityRate", required = true)
            protected BigDecimal activityRate;

            /**
             * Recupera il valore della proprietà weeklyHours.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getWeeklyHours() {
                return weeklyHours;
            }

            /**
             * Imposta il valore della proprietà weeklyHours.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setWeeklyHours(BigDecimal value) {
                this.weeklyHours = value;
            }

            /**
             * Recupera il valore della proprietà weeklyLessons.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getWeeklyLessons() {
                return weeklyLessons;
            }

            /**
             * Imposta il valore della proprietà weeklyLessons.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setWeeklyLessons(Integer value) {
                this.weeklyLessons = value;
            }

            /**
             * Recupera il valore della proprietà activityRate.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getActivityRate() {
                return activityRate;
            }

            /**
             * Imposta il valore della proprietà activityRate.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setActivityRate(BigDecimal value) {
                this.activityRate = value;
            }

        }

    }

}

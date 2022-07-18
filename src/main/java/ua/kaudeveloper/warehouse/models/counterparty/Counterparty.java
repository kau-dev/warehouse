package ua.kaudeveloper.warehouse.models.counterparty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import ua.kaudeveloper.warehouse.models.employee.Employee;
import ua.kaudeveloper.warehouse.models.employee.EmployeeDao;

import javax.persistence.*;
import java.util.Date;
import java.util.Optional;

@Entity
public class Counterparty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private String label_name;

    private String country;

    private String companyNumber;

    private String externalCode;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Employee asg_employee;

    private String itin;

    private boolean buyer;

    private boolean contractor;

    private boolean other;

    private long mainCounterparty;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    private Date creation_date;

    private ConterpartyType type;

    enum ConterpartyType {
        counterpartyLTD,
        counterpartySelfEmpl,
        counterpartyPersonal
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel_name() {
        return label_name;
    }

    public void setLabel_name(String label_name) {
        this.label_name = label_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    public Employee getAsg_employee() {
        return asg_employee;
    }

    public void setAsg_employee(Employee asg_employee) {
        this.asg_employee = asg_employee;
    }

    public String getItin() {
        return itin;
    }

    public void setItin(String itin) {
        this.itin = itin;
    }

    public boolean isBuyer() {
        return buyer;
    }

    public void setBuyer(boolean buyer) {
        this.buyer = buyer;
    }

    public boolean isContractor() {
        return contractor;
    }

    public void setContractor(boolean contractor) {
        this.contractor = contractor;
    }

    public boolean isOther() {
        return other;
    }

    public void setOther(boolean other) {
        this.other = other;
    }

    public long getMainCounterparty() {
        return mainCounterparty;
    }

    public void setMainCounterparty(long mainCounterparty) {
        this.mainCounterparty = mainCounterparty;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public ConterpartyType getType() {
        return type;
    }

    public void setType(ConterpartyType type) {
        this.type = type;
    }

    @JsonProperty("asg_employee")
    public Long getAsg_employee_id() {
        return asg_employee.getId();
    }

    @JsonProperty("asg_employee")
    public void setAsg_employee_id(Long id) {
        EmployeeDao employeeDao_ = new EmployeeDao();
        Optional<Employee> employee_ = employeeDao_.findById(id.intValue());
        if (employee_.isPresent()) {
            setAsg_employee(employee_.get());
        }
    }

}
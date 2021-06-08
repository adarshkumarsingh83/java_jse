open module espark.services {
    requires  transitive espark.persistence;
    exports com.adarsh.service;
    // or remove below comments
    // opens com.adarsh.service.EntityService;
}
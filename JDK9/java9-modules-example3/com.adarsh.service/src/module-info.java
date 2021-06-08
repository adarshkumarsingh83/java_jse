open module com.adarsh.service {
    requires transitive com.adarsh.persistence;
    exports com.adarsh.service;

    // or remove below comments
    // opens com.adarsh.service.EntityService;
}
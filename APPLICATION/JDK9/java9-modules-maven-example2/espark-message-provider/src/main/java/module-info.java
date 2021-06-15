import com.espark.message.Message;

module espark.message.provider {
    requires espark.message;
    uses Message;
    exports com.adarsh.message.provider;
}
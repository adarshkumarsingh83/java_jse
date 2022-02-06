import com.espark.message.Message;

module espark.message.provider {
    requires espark.message;
    requires espark.english.message;
    requires espark.hindi.message;
    uses Message;
    exports com.adarsh.message.provider;
}
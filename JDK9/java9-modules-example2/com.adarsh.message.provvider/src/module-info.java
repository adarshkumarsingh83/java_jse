import com.espark.message.Message;

module com.adarsh.message.provvider {
    requires com.adarsh.message;
    uses Message;
    exports com.adarsh.message.provider;
}
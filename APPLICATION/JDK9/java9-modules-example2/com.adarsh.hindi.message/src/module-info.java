import com.adarsh.hindi.message.HindiMessage;
import com.espark.message.Message;

module com.adarsh.hindi.message {
    requires com.adarsh.message;
    provides Message with HindiMessage;
}